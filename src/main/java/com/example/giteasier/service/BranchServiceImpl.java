package com.example.giteasier.service;

import com.example.giteasier.ctx.Dao;
import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    Dao dao;

    @Override
    public void createBranch(String groupName) {
        List<Repository> repoList = dao.REPOSITORY.stream()
                .filter(Repository.GROUP.equalIgnoreCase(groupName))
                .collect(Collectors.toList());

    }
}
