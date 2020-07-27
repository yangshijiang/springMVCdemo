package services;

import Bean.Student;
import SqlMap.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 杨世江
 * @Description:
 * @Date: 2020/7/23 10:44
 */
@Service
public class UserServiceSecond implements UserService {

    private User user;

    @Override
    public List<Student> getAllStudent() {
        System.out.println("UserServiceSecond");
        return user.getAllStudent();
    }

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }
}
