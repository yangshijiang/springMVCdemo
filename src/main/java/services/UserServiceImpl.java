package services;

import Bean.Student;
import SqlMap.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Init;
import java.util.List;

/**
 * @Author: 杨世江
 * @Description:
 * @Date: 2020/7/23 10:20
 */
@Service
@Scope(value = "session", proxyMode= ScopedProxyMode.TARGET_CLASS)

//@Lazy
/*限定符，当一个接口有两个实现类的时候，spring自动装配时在AutoWired下面再使用@Qualifier
 指定自己定义的限定符可以指定装配哪一个实现类*/
//@Qualifier("userServiceImpl")
//首选bean，自动装配时自动使用带有primary的实现类进行装配，一般不使用
//@Primary
//直接在component后面使用id绑定，默认id为实现类的类名第一个字母小写
//@Component("id")
public class UserServiceImpl implements UserService{

    private User user;

    @Override
    public List<Student> getAllStudent() {
        System.out.println("UserServiceImpl");
        return user.getAllStudent();
    }
    @Autowired
    public UserServiceImpl(User user) {
        this.user = user;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }

}
