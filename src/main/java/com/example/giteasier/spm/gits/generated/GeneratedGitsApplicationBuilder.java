package com.example.giteasier.spm.gits.generated;

import com.example.giteasier.spm.gits.GitsApplication;
import com.example.giteasier.spm.gits.GitsApplicationBuilder;
import com.example.giteasier.spm.gits.GitsApplicationImpl;
import com.example.giteasier.spm.gits.dbms.gits.branch.BranchManagerImpl;
import com.example.giteasier.spm.gits.dbms.gits.branch.BranchSqlAdapter;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositoryManagerImpl;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositorySqlAdapter;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.application.AbstractApplicationBuilder;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named gits.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGitsApplicationBuilder extends AbstractApplicationBuilder<GitsApplication, GitsApplicationBuilder> {
    
    protected GeneratedGitsApplicationBuilder() {
        super(GitsApplicationImpl.class, GeneratedGitsMetadata.class);
        withManager(BranchManagerImpl.class);
        withManager(RepositoryManagerImpl.class);
        withComponent(BranchSqlAdapter.class);
        withComponent(RepositorySqlAdapter.class);
    }
    
    @Override
    public GitsApplication build(Injector injector) {
        return injector.getOrThrow(GitsApplication.class);
    }
}