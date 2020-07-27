package Bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
/*限定符，当一个接口有两个实现类的时候，spring自动装配时在AutoWired下面再使用@Qualifier
 指定自己定义的限定符可以指定装配哪一个实现类*/
//@Qualifier("id")
//首选bean，自动装配时自动使用带有primary的实现类进行装配，一般不使用
//@Primary
//直接在component后面使用id绑定，默认id为实现类的类名第一个字母小写
//@Component("id")
public class Student implements Serializable {
    private String userId;
    private String password;
    private String name;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
