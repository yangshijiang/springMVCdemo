package SqlMap;

import Bean.Student;

import java.util.List;

/**
 * mapper接口开发DAO
 */

public interface User {
    /*mapper接口，接口名字跟xml文件nameSpace一致
      方法名与xml的id名称一致
      参数与xml的parametertype名称一致
      返回值xml的resultType名称一致
     */

    public Student getStudent(String id);

    public List<Student>getAllStudent();

    public List<Student>getAllStudentMap();

    public void deleteStudent(String id);

    public void updateStudent(Student student);

    public void insertStudent(Student student);
}
