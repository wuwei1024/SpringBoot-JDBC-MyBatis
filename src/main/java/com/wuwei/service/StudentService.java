package com.wuwei.service;

import com.wuwei.entity.Student;
import java.util.List;

/**
 * Service接口
 *
 * @author 吴维
 * @date 2017-8-6 20:31:29
 */
public interface StudentService {

    public int addStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(int id);

    public int updateStudent(Student student);

    public int delStudentById(int id);
}
