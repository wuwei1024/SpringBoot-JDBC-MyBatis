package com.wuwei.test.service;

import com.wuwei.test.dao.Dao;
import com.wuwei.test.entity.Student;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 服务层Service：处理业务逻辑
 *
 * @author 吴维
 * @date 2017-8-5 14:49:21
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private Dao dao;

    public int addStudent(Student student) {
        return dao.addStudent(student);
    }

    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    public Student getStudentById(int id) {
        return dao.getStudentById(id);
    }

    public int updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    public int delStudentById(int id) {
        return dao.delStudentById(id);
    }
}
