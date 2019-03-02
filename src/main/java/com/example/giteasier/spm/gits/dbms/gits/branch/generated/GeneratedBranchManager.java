package com.example.giteasier.spm.gits.dbms.gits.branch.generated;

import com.example.giteasier.spm.gits.dbms.gits.branch.Branch;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.giteasier.spm.gits.dbms.gits.branch.Branch} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedBranchManager extends Manager<Branch> {
    
    TableIdentifier<Branch> IDENTIFIER = TableIdentifier.of("gits", "gits", "branch");
    List<Field<Branch>> FIELDS = unmodifiableList(asList(
        Branch.ID,
        Branch.PROJECT_ID,
        Branch.NAME,
        Branch.CHASH,
        Branch.TAG,
        Branch.MESSAGE,
        Branch.CREATION_TIME,
        Branch.UPDATE_TIME,
        Branch.DELETED,
        Branch.BASE,
        Branch.BASELINE
    ));
    
    @Override
    default Class<Branch> getEntityClass() {
        return Branch.class;
    }
}