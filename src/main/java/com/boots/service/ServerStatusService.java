package com.boots.service;

import com.boots.entity.ProjectMasterEntity;
import com.boots.entity.ServerStatusEntity;
import com.mysql.fabric.Server;

import java.util.List;

/**
 * Created by Renick.J on 01/01/2017.
 */
public interface ServerStatusService {

    public void save(ProjectMasterEntity p);

    public List<ProjectMasterEntity> list();

    public List<ServerStatusEntity> serverStatusEntityList();
}
