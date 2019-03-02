package com.example.giteasier;

import com.example.giteasier.jgit.GitOperationImpl;
import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositoryImpl;
import org.eclipse.jgit.api.Git;
import org.junit.Test;

public class GitOperationImplTest {
    @Test
    public void testClone() {
        GitOperationImpl gitOperation = new GitOperationImpl();
        Repository abc = new RepositoryImpl().setName("aaas")
                .setRepository("git@github.com:zscgrhg/mybatis-plugin.git");
        Git git = gitOperation.gitClone(abc);
        gitOperation.gitBranchPush(git, "origin/master", "refs/heads/v1.1.4");
    }
}
