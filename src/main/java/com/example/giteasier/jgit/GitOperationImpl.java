package com.example.giteasier.jgit;

import com.example.giteasier.spm.gits.dbms.gits.repository.Repository;
import lombok.SneakyThrows;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.transport.RefSpec;

import java.io.File;

public class GitOperationImpl implements GitOperation {
    public static final File workspace = new File("./workspace");

    static {
        if (!workspace.exists()) {
            workspace.mkdirs();
        }
    }

    @Override
    @SneakyThrows
    public Git gitClone(Repository repository) {
        File workDir = workspace.toPath().resolve(repository.getName()).toFile();
        if (workDir.exists()) {
            workDir.delete();
            workDir.mkdir();
        }
        Git git = Git
                .cloneRepository()
                .setDirectory(workDir)
                .setNoCheckout(true)
                .setTransportConfigCallback(SshTransportConfigCallback.INSTANCE)
                .setURI(repository.getRepository())
                .call();
        return git;
    }

    @Override
    @SneakyThrows
    public void gitCheckout(Git git, String start, String branchName) {

        git.checkout()
                .setCreateBranch(true)
                .setName(branchName)
                .setStartPoint(start)
                .call();
    }

    @Override
    @SneakyThrows
    public void gitBranchPush(Git git, String source, String dest) {
        PushCommand pushCommand = git.push();
        pushCommand.setTransportConfigCallback(SshTransportConfigCallback.INSTANCE);
        pushCommand.setRemote("origin");
        pushCommand.setRefSpecs(new RefSpec().setSourceDestination(source, dest));
        pushCommand.call();
    }
}
