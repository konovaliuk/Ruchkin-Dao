package com.pis.services;

import com.pis.Dao.UserRoleDao;
import com.pis.Entity.UserRole;

import java.util.ArrayList;

public class UserRoleService {

    public ArrayList<UserRole> getAll() {
        UserRoleDao userRoleDao = new UserRoleDao();
        ArrayList<UserRole> RolesForUsers = userRoleDao.getAll();
        return RolesForUsers;
    }

    public UserRole getURById(int id) {
        UserRoleDao userRoleDao = new UserRoleDao();
        UserRole URByID = userRoleDao.getById(id);
        return URByID;
    }


    public void delete(int id) {
        UserRoleDao userRoleDao = new UserRoleDao();
        userRoleDao.delete(id);
    }

}
