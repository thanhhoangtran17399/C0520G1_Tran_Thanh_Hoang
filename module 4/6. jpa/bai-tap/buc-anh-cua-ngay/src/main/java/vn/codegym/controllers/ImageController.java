package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Image;
import vn.codegym.service.ImageService;

import java.util.List;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/")
    public String comment(Model model) {
        model.addAttribute("comments", imageService.findAll());
        model.addAttribute("comment", new Image());
        return "/HaiQuayXe";
    }

    @PostMapping("/create-comment")
    public String create(Image image) {
        imageService.save(image);
        return "redirect:/";
    }

    @GetMapping("/update-like/{id}")
    public ModelAndView update(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/HaiQuayXe");
        Image image = imageService.findById(id);
        image.setNumberOfLikes(image.getNumberOfLikes()+1);
        imageService.update(image);
        modelAndView.addObject("comments", imageService.findAll());
        modelAndView.addObject("comment", new Image());
        return modelAndView;
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
