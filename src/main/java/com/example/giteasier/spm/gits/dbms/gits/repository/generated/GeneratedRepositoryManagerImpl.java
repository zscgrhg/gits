package com.example.giteasier.spm.gits.dbms.gits.repository.generated;

import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositoryManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.example.giteasier.spm.gits.dbms.gits.repository.Repository} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRepositoryManagerImpl 
extends AbstractManager<Repository> 
implements GeneratedRepositoryManager {
    
    private final TableIdentifier<Repository> tableIdentifier;
    
    protected GeneratedRepositoryManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("gits", "gits", "repository");
    }
    
    @Override
    public TableIdentifier<Repository> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Repository>> fields() {
        return RepositoryManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Repository>> primaryKeyFields() {
        return Stream.of(
            Repository.ID
        );
    }
}