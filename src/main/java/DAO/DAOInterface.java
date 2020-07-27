package DAO;

import Bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface DAOInterface {

    public Student getStudent(int id);

    public List<Student> list();

    public void deleteStudent(int id);

    public void updateStudent(Student student);
}
