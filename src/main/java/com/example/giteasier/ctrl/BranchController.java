package com.example.giteasier.ctrl;

import com.example.giteasier.ctx.Dao;
import com.example.giteasier.spm.gits.dbms.gits.branch.Branch;
import com.example.giteasier.spm.gits.dbms.gits.branch.BranchImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("branch")
public class BranchController {
    public static final String LIST = "branch/list";
    public static final String CREATE = "branch/create";
    public static final String SUCCESS = "branch/success";
    public static final String REDIRECT_SUCCESS = "redirect:/branch/success";

    @Autowired
    Dao dao;

    @GetMapping(value = {"/list/{projectId}"})
    public String list(Model model, @PathVariable("projectId") long projectId) {
        List<String> branchList = dao.BRANCH.stream()
                .filter(Branch.PROJECT_ID.equal(projectId))
                .map(Branch.NAME)
                .distinct()
                .collect(Collectors.toList());
        model.addAttribute("branchList", branchList);
        return LIST;
    }

    @GetMapping(value = {"/create/{group}"})
    public String create(Model model,@PathVariable("group") String group) {
        BranchImpl branch = new BranchImpl();
        model.addAttribute("branchModel", branch);
        return CREATE;
    }

    @PostMapping(value = {"/create/{group}"})
    public String createRepo(@ModelAttribute BranchImpl branch, @PathVariable("group") String group) {
        branch.setCreationTime(LocalDateTime.now())
                .setUpdateTime(LocalDateTime.now());
        branch.setChash("chash");
        Branch saved = dao.BRANCH.persist(branch);
        return REDIRECT_SUCCESS;
    }

    @GetMapping(value = {"/success"})
    public String success() {

        return SUCCESS;
    }
}
