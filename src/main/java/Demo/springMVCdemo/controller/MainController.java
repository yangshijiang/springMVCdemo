package Demo.springMVCdemo.controller;

import Bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import services.UserService;
import java.io.IOException;
import java.util.List;

/**
 * 五大注入
 * 1，原始注入
 * 2，moudleAndView注入
 * 3，moudle注入
 * 4，map注入
 * 5，
 */

@Controller
//加入此标签后访问下面方法的地址之前要加/tt
@RequestMapping(value = "/tt")
public class MainController {
    @Autowired
    //指定id，告诉spring、要装配哪一个实现类
    @Qualifier("userServiceImpl")
    //可以代替Autowired和Qulifier
    //@Resource(name="类名第一个字母小写")
    private UserService userService;
    @RequestMapping(value = "/index")
    public ModelAndView index() throws IOException {
        ModelAndView mad = new ModelAndView("tt/index");
//        InputStream inputStream = Resources.getResourceAsStream("WEB-INF/sqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//        //根据Mapper接口生成mapper对象

//        Student student =new Student();
//        student.setUserId("ysj3");
//        student.setPassword("123");
//        student.setName("杨世讲讲");
//        user.insertStudent(student);
////        sqlSession.commit();
        System.out.println(userService);
        List<Student> list= userService.getAllStudent();
        mad.addObject("c",list);

// 转发的方法       return "forward:/mad";
// 重定向       return "redirect:/mad";
        return mad;
    }
}
