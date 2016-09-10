package com.trademygame.server;

import com.trademygame.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by manjtsingh on 9/9/2016.
 */
@Component
public class LoginService {

    @Autowired
    UserDao userDao;

    public boolean authenticateUser(String username,String password)
    {
        return userDao.authenticateUser(username,password);
    }

}
