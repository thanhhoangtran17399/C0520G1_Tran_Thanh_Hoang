package vn.codegym.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.demo.model.Image;
import vn.codegym.demo.service.ImageService;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/")
    public String comment(Model model, @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("comments", imageService.findAll(pageable));
        model.addAttribute("comment", new Image());
        return "/HaiQuayXe";
    }

    @PostMapping("/create-comment")
    public String create(@ModelAttribute("comment") Image image) {
        imageService.save(image);
        return "redirect:/";
    }

    @GetMapping("/update-like/{id}")
    public ModelAndView update(@PathVariable int id, @PageableDefault(value = 2) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/HaiQuayXe");
        Image image = imageService.findById(id);
        image.setNumberOfLikes(image.getNumberOfLikes()+1);
        imageService.update(image);
        modelAndView.addObject("comments", imageService.findAll(pageable));
        modelAndView.addObject("comment", new Image());
        return modelAndView;
    }

}
