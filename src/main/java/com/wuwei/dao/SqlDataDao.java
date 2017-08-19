package com.wuwei.dao;

import com.wuwei.entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * 数据访问层Dao：与数据库交互
 *
 * @author 吴维
 * @date 2017-8-5 21:16:05
 */
@Repository("SqlDataDao")
public class SqlDataDao implements Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int i) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            return student;
        }
    };

    @Override
    public int addStudent(Student student) {
        String sql = "insert into student(name,course)values(?,?)";
        String name = student.getName();
        String course = student.getCourse();
        return jdbcTemplate.update(sql, new Object[]{name, course});
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "select * from student";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "select * from student where id = ?";
        List<Student> students = jdbcTemplate.query(sql, new Object[]{id}, new StudentRowMapper());
        if (students != null && students.size() > 0) {
            return students.get(0);
        }
        return null;
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update student set name = ?,course = ? where id = ?";
        int id = student.getId();
        String name = student.getName();
        String course = student.getCourse();
        return jdbcTemplate.update(sql, new Object[]{name, course, id});
    }

    @Override
    public int delStudentById(int id) {
        String sql = "delete from student where id = ?";
        return jdbcTemplate.update(sql, new Object[]{id});
    }
}
