package services;

import Bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springMVCdemo
 * @Package: services
 * @ClassName: UserService
 * @Author: 杨世江
 * @Description:service接口
 * @Date: 2020/7/23 10:16
 * @Version: 1.0
 */
public interface UserService {
    public List<Student> getAllStudent();
}
