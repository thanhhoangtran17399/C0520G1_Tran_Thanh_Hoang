package vn.codegym.giohang.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.giohang.model.Cart;
import vn.codegym.giohang.model.Product;
import vn.codegym.giohang.service.ProductService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String getCartPage(HttpSession session) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        return "cart/list";
    }

    @PostMapping("add")
    public String getCartPage(@RequestParam("id") long productId, HttpSession session, Model model) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        Product product = productService.findById(productId);
        if (product != null) {
            if (cartItems.containsKey(productId)) {
                Cart item = cartItems.get(productId);
                item.setProduct(product);
                item.setQuantity(item.getQuantity() + 1);
                cartItems.put(productId, item);
            } else {
                Cart item = new Cart();
                item.setProduct(product);
                item.setQuantity(1);
                cartItems.put(productId, item);
            }
        }
        model.addAttribute("cart", new Cart());
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        return "cart/list";
    }

    public double totalPrice(Map<Long, Cart> cartItems) {
        long count = 0;
        for (Map.Entry<Long, Cart> list : cartItems.entrySet()) {
            count += list.getValue().getProduct().getPrice() * (100 - list.getValue().getProduct().getDiscount())
                    / 100 * list.getValue().getQuantity();
        }
        return count;
    }

    @GetMapping(value = "remove/{id}")
    public String viewRemove(ModelMap modelMap, HttpSession session, @PathVariable("id") long productId) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        if (cartItems.containsKey(productId)) {
            cartItems.remove(productId);
        }
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        return "cart/list";
    }

    @GetMapping(value = "update")
    public ModelAndView update(@RequestParam("id") long productId, HttpSession session, Cart cart) {
        ModelAndView modelAndView = new ModelAndView("/cart/list");
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        Product product = productService.findById(productId);
        if (product != null) {
            if (cartItems.containsKey(productId)) {
                Cart item = cartItems.get(productId);
                item.setProduct(product);
                item.setQuantity(cart.getQuantity());
                cartItems.put(productId, item);
            }
        }
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        return modelAndView;
    }


}
