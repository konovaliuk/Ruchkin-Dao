package com.pis.services;



import com.pis.Dao.RoleDao;
import com.pis.Entity.Role;

import java.util.ArrayList;

public class RoleService {

    public Role getByID(int id){
        RoleDao roleDao = new RoleDao();
        Role role = roleDao.getById(id);
        return role;
    }

    public Role getByName(int id){
        RoleDao roleDao = new RoleDao();
        Role role = roleDao.getById(id);
        return role;
    }

    public ArrayList<Role> getAllRoles(){
        RoleDao roleDao = new RoleDao();
        ArrayList<Role> roles = roleDao.getAll();
        return roles;
    }













}
