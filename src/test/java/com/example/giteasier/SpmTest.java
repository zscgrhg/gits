package com.example.giteasier;

import com.example.giteasier.ctx.Dbms;
import com.example.giteasier.spm.gits.GitsApplication;
import com.example.giteasier.spm.gits.dbms.gits.repository.RepositoryManager;
import org.junit.Test;

public class SpmTest {
    @Test
    public void helloSpm() {
        GitsApplication app = new Dbms().gitsApplication();
        RepositoryManager rm = app.getOrThrow(RepositoryManager.class);
        long count = rm.stream().count();
        System.out.println(count);
    }
}
