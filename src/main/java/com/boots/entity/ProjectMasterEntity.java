package com.boots.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Renick.J on 30/12/2016.
 */
@Entity
@Table(name="project_master")
public class ProjectMasterEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="project_id")
    private String projectId;

    @Column(name="project_desc")
    private String projectDesc;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    @OneToMany(mappedBy = "project")
    private List<ServerStatusEntity> serverStatusEntityList;
}
