package com.boots.dao;

import com.boots.entity.ProjectMasterEntity;
import com.boots.entity.ServerStatusEntity;

import java.util.List;

/**
 * Created by Renick.J on 30/12/2016.
 */
public interface ServerStatusDao {

    public void save(ProjectMasterEntity p);

    public List<ProjectMasterEntity> list();

    public List<ServerStatusEntity> serverStatusEntityList();

}
