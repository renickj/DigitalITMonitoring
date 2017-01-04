package com.boots.service;

import com.boots.dao.ServerStatusDao;
import com.boots.entity.ProjectMasterEntity;
import com.boots.entity.ServerStatusEntity;
import com.sun.corba.se.spi.activation.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Renick.J on 01/01/2017.
 */
@Service
public class ServerStatusServiceImpl implements ServerStatusService {

    @Autowired
    private ServerStatusDao serverStatusDao;

    public void save(ProjectMasterEntity p) {
        serverStatusDao.save(p);
    }

    @Transactional
    public List<ServerStatusEntity> serverStatusEntityList() {
        return serverStatusDao.serverStatusEntityList();
    }

    @Transactional
    public List<ProjectMasterEntity> list() {
        System.out.println("Person List:: nnnnnnnn  111");
        return serverStatusDao.list();
    }
}
