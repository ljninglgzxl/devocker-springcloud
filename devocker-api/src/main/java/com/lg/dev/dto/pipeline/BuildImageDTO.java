package com.lg.dev.dto.pipeline;

import java.io.Serializable;

/**
 * @author lg
 * @date 2018-11-06
 * &Desc build image dto
 */
public class BuildImageDTO implements Serializable {
    private String projectName;
    private String branchName;
    private String gitSSHUrl;
    private String projectVersion;
    private String codeReversion;
    private String imageUrl;
    private String fileServer;
    private String storagePath;
    private Byte status;
    private Byte result;


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getGitSSHUrl() {
        return gitSSHUrl;
    }

    public void setGitSSHUrl(String gitSSHUrl) {
        this.gitSSHUrl = gitSSHUrl;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getCodeReversion() {
        return codeReversion;
    }

    public void setCodeReversion(String codeReversion) {
        this.codeReversion = codeReversion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFileServer() {
        return fileServer;
    }

    public void setFileServer(String fileServer) {
        this.fileServer = fileServer;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getResult() {
        return result;
    }

    public void setResult(Byte result) {
        this.result = result;
    }

}
