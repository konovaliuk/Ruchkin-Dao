package com.pis;

import com.pis.Dao.CategoryDao;
import com.pis.Dao.OrderDao;
import com.pis.Dao.RoleDao;
import com.pis.Dao.UserDao;
import com.pis.Entity.Category;
import com.pis.Entity.Order;
import com.pis.Entity.Role;
import com.pis.Entity.User;

public class main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        /*System.out.println(userDao.getAll());*/
        /**/ userDao.insert(new User(1, "asa","asdf","asdfg","4123244"));
        /*userDao.delete(1);*/
        /*System.out.println(userDao.getById(1));*/
        /*RoleDao roleDao = new RoleDao();*/
        /*roleDao.update(new Role(1, "no?"));*/
       /* System.out.println(roleDao.getAll());*/


    }
}
