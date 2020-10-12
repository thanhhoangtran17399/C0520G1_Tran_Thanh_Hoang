package vn.codegym.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.model.Category;
import vn.codegym.blog.service.BlogService;
import vn.codegym.blog.service.CategoryService;

import java.util.List;


@RestController
@RequestMapping()
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> getListBlog(){
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else {
            return new ResponseEntity<>(blogList,HttpStatus.OK);
        }
    }

    @PostMapping("/blog")
    public ResponseEntity addBlog(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> findStudentById(@PathVariable int id){
        Blog blog = blogService.findById(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @PutMapping("/blog/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id, @RequestBody Blog blog){
        Blog currentBlog = blogService.findById(id);
        if(currentBlog==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentBlog.setName(blog.getName());
        currentBlog.setContent(blog.getContent());
        currentBlog.setBlogCategory(blog.getBlogCategory());

        blogService.save(currentBlog);

        return new ResponseEntity<>(currentBlog, HttpStatus.OK);
    }
    @DeleteMapping("/blog/{id}")
    public ResponseEntity deleteBlog(@PathVariable int id){
        Blog blog=blogService.findById(id);
        blogService.remove(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
//    @GetMapping("/blog/create")
//    public String create(Model model) {
//        model.addAttribute("blog", new Blog());
//        model.addAttribute("categoryList",categoryService.findAll());
//        return "blog/create";
//    }
//
//    @PostMapping("/blog/save")
//    public String save(Blog blog, RedirectAttributes redirect) {
//        blogService.save(blog);
//        redirect.addFlashAttribute("success", "Saved blog successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/blog/{id}/edit")
//    public String edit(@PathVariable int id, Model model) {
//        model.addAttribute("blog", blogService.findById(id));
//        return "blog/edit";
//    }
//
//    @PostMapping("/blog/update")
//    public String update(Blog blog, RedirectAttributes redirect) {
//        blogService.update(blog);
//        redirect.addFlashAttribute("success", "Modified blog successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/blog/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("blog", blogService.findById(id));
//        return "blog/delete";
//    }
//
//    @PostMapping("/blog/delete")
//    public String delete(Blog blog, RedirectAttributes redirect) {
//        blogService.remove(blog);
//        redirect.addFlashAttribute("success", "Removed blog successfully!");
//        return "redirect:/";
//    }
//
//    @GetMapping("/blog/{id}/view")
//    public String view(@PathVariable int id, Model model) {
//        model.addAttribute("blog", blogService.findById(id));
//        return "blog/view";
//    }
}
