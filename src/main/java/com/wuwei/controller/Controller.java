package com.wuwei.controller;

import com.wuwei.entity.Student;
import com.wuwei.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器Controller 
 * 请求地址：http://ip:port/contextPath/servletPath
 * 例如：http://localhost:8181/demo/student/getAllStudent
 *
 * @author 吴维
 * @date 2017-8-5 14:52:54
 */
@RestController
@RequestMapping("/student")
public class Controller {

    @Autowired
    private StudentService studentService;

    //增加(Create)
    @RequestMapping("/addStudent")
    public int addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //查询(Retrieve)
    @RequestMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    //根据ID查询
    @RequestMapping("/getStudentById")
    public Student getStudentById(@RequestParam("id") int id) {
        return studentService.getStudentById(id);
    }

    //更新(Update)
    @RequestMapping("/updateStudent")
    public int updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    //删除(Delete)
    @RequestMapping("/delStudentById")
    public int delStudentById(@RequestParam("id") int id) {
        return studentService.delStudentById(id);
    }
}
