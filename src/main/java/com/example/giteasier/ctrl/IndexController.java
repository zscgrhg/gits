package com.example.giteasier.ctrl;

import com.example.giteasier.ctx.Dao;
import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class IndexController {

    @Autowired
    Dao dao;
    @RequestMapping({"", "/"})
    public String index(Model model) {
        List<String> rGroupList = dao.REPOSITORY.stream()
                .map(Repository.GROUP)
                .distinct()
                .collect(Collectors.toList());
        model.addAttribute("rGroupList", rGroupList);
        return "index";
    }
}
