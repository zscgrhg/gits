package com.example.giteasier.jgit;

import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import org.eclipse.jgit.api.Git;

public interface GitOperation {
    Git gitClone(Repository repository);

    void gitCheckout(Git git,String start,String branchName);

    void gitBranchPush(Git git,String source,String dest);
}
