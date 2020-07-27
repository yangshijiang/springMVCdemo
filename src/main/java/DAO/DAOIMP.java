package DAO;

import Bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
/*限定符，当一个接口有两个实现类的时候，spring自动装配时在AutoWired下面再使用@Qualifier
 指定自己定义的限定符可以指定装配哪一个实现类*/
//@Qualifier("id")
//首选bean，自动装配时自动使用带有primary的实现类进行装配，一般不使用
//@Primary
//直接在component后面使用id绑定，默认id为实现类的类名第一个字母小写
//@Component("id")
public class DAOIMP implements DAOInterface {

    private SqlSessionFactory sqlSessionFactory;

    public DAOIMP(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Student getStudent(int id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Student student=sqlSession.selectOne("test.GetUserByCid",id);
        sqlSession.close();
        return student;
    }

    @Override
    public List<Student> list() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<Student> students=sqlSession.selectOne("test.GetUserAll");
        sqlSession.close();
        return students;
    }

    @Override
    public void deleteStudent(int id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.selectOne("test.deleteUser",id);
        sqlSession.close();


    }

    @Override
    public void updateStudent(Student student) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.selectOne("test.deleteUser",student);
        sqlSession.close();
    }
}
