package com.pis.services;

import com.pis.Dao.UserDao;
import com.pis.Entity.User;

import java.util.List;

public class UserService {

    public boolean createUser(Integer id, String name, String surname, String email, String password){

        UserDao userDao = new UserDao();
        Integer rec = userDao.insert(new User(id, name,surname,email,password));

        return rec != null;
    }

    public User findByID(int id){
        User user;
        UserDao userDao = new UserDao();
        user = userDao.getById(id);
        return user;
    }

    public List<User> getAllUsers(){
        UserDao userDao = new UserDao();
        return userDao.getAll();
    }


}
