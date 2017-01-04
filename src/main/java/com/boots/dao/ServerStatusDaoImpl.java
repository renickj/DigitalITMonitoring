package com.boots.dao;

import com.boots.entity.ProjectMasterEntity;
import com.boots.entity.ServerStatusEntity;
import com.boots.utils.DateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Renick.J on 30/12/2016.
 */
@Repository
public class ServerStatusDaoImpl implements ServerStatusDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void save(ProjectMasterEntity p) {

    }

    @SuppressWarnings("unchecked")
    public List<ProjectMasterEntity> list() {
        System.out.println("Person List:: nnnnnnnn");
        List<ProjectMasterEntity> projectMasterList = null;
        try {
            System.out.println("Person List:: nnnnnnnn");
            Session session = this.sessionFactory.getCurrentSession();
            String hql = "from ProjectMasterEntity";
            projectMasterList = (List<ProjectMasterEntity>) hibernateTemplate.find(hql);
        /*List<ProjectMasterEntity> projectMasterList = session.createQuery("from ProjectMasterEntity").list(); */
            for (ProjectMasterEntity p : projectMasterList) {
                System.out.println("Project ID::" + p.getProjectId());
                System.out.println("Project Desc::" + p.getProjectDesc());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return projectMasterList;
    }

    public List<ServerStatusEntity> serverStatusEntityList() {
        System.out.println("ServerStatus");
        List<ServerStatusEntity> serverStatusEntityList = null;
        try {
            System.out.println("ServerStatus");
            Session session = this.sessionFactory.getCurrentSession();
            String hql = "from ServerStatusEntity";
            serverStatusEntityList = (List<ServerStatusEntity>) hibernateTemplate.find(hql);
        /*List<ProjectMasterEntity> projectMasterList = session.createQuery("from ProjectMasterEntity").list(); */
            for (ServerStatusEntity p : serverStatusEntityList) {
                System.out.println("Project ID::" + p.getProject().getProjectId());
                System.out.println("Project Desc::" + p.getCollectedTime());
                System.out.println(DateUtils.getTimeFromString(p.getCollectedTime()));
                System.out.println("Project Desc::" + p.getServerName());
                System.out.println("Project Desc::" + p.getServerStatus());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return serverStatusEntityList;
    }
}
