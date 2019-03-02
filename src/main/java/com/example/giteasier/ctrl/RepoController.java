package com.example.giteasier.ctrl;


import com.example.giteasier.ctx.Dao;
import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("repo")
public class RepoController {
    public static final String LIST = "repo/list";
    public static final String CREATE = "repo/create";
    public static final String SUCCESS = "repo/success";
    public static final String REDIRECT_SUCCESS = "redirect:/repo/success";
    @Autowired
    Dao dao;

    @GetMapping(value = {"/list/{group}"})
    public String list(Model model,@PathVariable("group") String group) {
        List<Repository> repoList = dao.REPOSITORY.stream()
                .filter(Repository.GROUP.equalIgnoreCase(group))
                .collect(Collectors.toList());

        model.addAttribute("repoList", repoList);
        return LIST;
    }

    @GetMapping(value = {"/create"})
    public String create(Model model) {
        model.addAttribute("repoModel", new RepositoryImpl());
        return CREATE;
    }

    @PostMapping(value = {"/create"})
    public String createRepo(@ModelAttribute RepositoryImpl repo, RedirectAttributes redirectAttributes) {
        repo.setCreationTime(LocalDateTime.now())
                .setUpdateTime(LocalDateTime.now());
        Repository saved = dao.REPOSITORY.persist(repo);
        return REDIRECT_SUCCESS;
    }
    @GetMapping(value = {"/success"})
    public String success() {

        return SUCCESS;
    }
}
