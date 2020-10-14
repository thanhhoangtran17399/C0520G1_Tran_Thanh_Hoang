package vn.codegym.casestudyfurama.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.casestudyfurama.model.Contract;
import vn.codegym.casestudyfurama.model.Customer;
import vn.codegym.casestudyfurama.service.ContractService;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;
    @GetMapping
    public String index(Model model, @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("listContract", contractService.findAll(pageable));
        return "contract/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("contract", new Contract());
        return "contract/list";
    }
    @PostMapping("/save")
    public String save(Contract contract, RedirectAttributes redirect) {
        contractService.save(contract);
        redirect.addFlashAttribute("success", "Saved contract successfully!");
        return "redirect:/contract";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("contract", contractService.findById(id));
        return "contract/list";
    }

    @PostMapping("/update")
    public String update(Contract contract, RedirectAttributes redirect) {
        contractService.update(contract);
        redirect.addFlashAttribute("success", "Modified blog successfully!");
        return "redirect:/contract";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model) {
        contractService.remove(id);
        return "redirect:/contract";
    }
}
