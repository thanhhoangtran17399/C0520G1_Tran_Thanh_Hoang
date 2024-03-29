package vn.codegym.demo_jpa_repository.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.demo_jpa_repository.model.Student;
import vn.codegym.demo_jpa_repository.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Qualifier("studentServiceImpl")
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String getStudentPage(Model model, @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("studentList", studentService.findAll(pageable));
        return "/student/list";
    }

//    @GetMapping("/create")
//    public ModelAndView getCreatePage(){
//        ModelAndView modelAndView  = new ModelAndView("/student/create");
//        modelAndView.addObject("student", new Student());
//
//        List<String> languageList = new ArrayList<>();
//        languageList.add("JAVA");
//        languageList.add("C#");
//        languageList.add("PHP");
//        modelAndView.addObject("languageList", languageList);
//        return modelAndView;
//    }

    @GetMapping("/create")
    public String getCreatePage(Model model) {
        model.addAttribute("student", new Student());
        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("C#");
        languageList.add("PHP");
        model.addAttribute("languageList", languageList);
        return "/student/create";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes) {
        studentService.save(student);
        redirectAttributes.addFlashAttribute("ok", "da dang ki thanh cong");
        return "redirect:/student";
    }


    @GetMapping("/edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/student/edit");
        modelAndView.addObject("student", new Student());

        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("C#");
        languageList.add("PHP");
        modelAndView.addObject("languageList", languageList);
        modelAndView.addObject("student", studentService.findById(id));
        return modelAndView;
    }


    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Student student) {
        studentService.update(student);
        return "redirect:/student";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.remove(id);
        return "redirect:/student";
    }

    @GetMapping("/search")
    public ModelAndView searchByName(@RequestParam String inputSearch) {
        return new ModelAndView("/student/list", "studentList", studentService.findByNameAndAddress(inputSearch));
    }
}
