package com.wuwei.test.dao;

import com.wuwei.test.entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * 模拟的静态数据
 *
 * @author 吴维
 * @date 2017-8-5 14:11:29
 */
@Repository("LocalDataDao")
public class LocalDataDao implements Dao {

    private static List<Student> students;

    static {
        students = new ArrayList<Student>() {
            {
                add(new Student(1, "John", "English"));
                add(new Student(2, "Smith", "Math"));
                add(new Student(3, "Marry", "Computer"));
            }
        };
    }
    
    @Override
    public int addStudent(Student student) {
        return 0;
    }

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public int delStudentById(int id) {
        return 0;
    }

}
