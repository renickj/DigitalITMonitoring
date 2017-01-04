package com.boots.entity;


import javax.persistence.*;

/**
 * Created by Renick.J on 01/01/2017.
 */
@Entity
@Table(name = "project_server_status")
public class ServerStatusEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="project_id")
    private ProjectMasterEntity project;

    @Column(name="server_name")
    private String serverName;

    @Column(name="server_status")
    private String serverStatus;

    @Column(name="collected_time")
    private String collectedTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
    }

    public String getCollectedTime() {
        return collectedTime;
    }

    public void setCollectedTime(String collectedTime) {
        this.collectedTime = collectedTime;
    }

    public ProjectMasterEntity getProject() {
        return project;
    }

    public void setProject(ProjectMasterEntity project) {
        this.project = project;
    }
}
