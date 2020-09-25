package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Blog;
import vn.codegym.service.BlogService;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String index(Model model) {

        List<Blog> customerList = blogService.findAll();
        model.addAttribute("blogs", customerList);
        return "/index";
    }

    @GetMapping("/blog/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/blog/save")
    public String save(Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("success", "Saved blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/edit";
    }

    @PostMapping("/blog/update")
    public String update(Blog blog, RedirectAttributes redirect) {
        blogService.update(blog);
        redirect.addFlashAttribute("success", "Modified blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/delete";
    }

    @PostMapping("/blog/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog);
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/view";
    }

//    @PostMapping("/image/save")
//    public String save(Image image, RedirectAttributes redirect) {
//        image.setId((int)(Math.random() * 10000));
//        imageService.save(image);
//        redirect.addFlashAttribute("success", "Saved customer successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/image/{id}/edit")
//    public String edit(@PathVariable int id, Model model) {
//        model.addAttribute("image", imageService.findById(id));
//        return "/edit";
//    }
//
//    @PostMapping("/image/update")
//    public String update(Image image, RedirectAttributes redirect) {
//        imageService.update(image);
//        redirect.addFlashAttribute("success", "Modified customer successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/image/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("image", imageService.findById(id));
//        return "/delete";
//    }
//
//    @PostMapping("/image/delete")
//    public String delete(Image image, RedirectAttributes redirect) {
//        imageService.remove(image);
//        redirect.addFlashAttribute("success", "Removed customer successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/image/{id}/view")
//    public String view(@PathVariable int id, Model model) {
//        model.addAttribute("image", imageService.findById(id));
//        return "/view";
//    }
}
