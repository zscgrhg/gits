package com.example.giteasier.ctx;


import com.example.giteasier.spm.gits.GitsApplication;
import com.example.giteasier.spm.gits.dbms.gits.branch.BranchManager;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositoryManager;
import com.speedment.runtime.core.component.transaction.TransactionComponent;
import com.speedment.runtime.core.component.transaction.TransactionHandler;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    public final GitsApplication APP;
    public final RepositoryManager REPOSITORY;
    public final BranchManager BRANCH;
    public final TransactionComponent TC;
    public final TransactionHandler TX;

    public Dao(GitsApplication APP) {
        this.APP = APP;
        this.REPOSITORY = APP.getOrThrow(RepositoryManager.class);
        this.BRANCH = APP.getOrThrow(BranchManager.class);
        TC = APP.getOrThrow(TransactionComponent.class);
        TX = TC.createTransactionHandler();
    }
}
