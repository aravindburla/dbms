package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public String add(Student student) {
		String status = "";
		Student std = search(student.getSid());
		if(std == null) {
			int rowCount = jdbcTemplate.update("insert into student values('"+student.getSid()+"', '"+student.getSname()+"','"+student.getSemail()+"','"+student.getScourse()+"','"+student.getSaddr()+"','"+student.getScity()+"','"+student.getSstate()+"','"+student.getScountry()+"','"+student.getScontact()+"')");
			if(rowCount == 1) {
				status = "success";
			}
			else {
				status = "failure";
			}
		}
		else {
			status = "existed";
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
		List<Student> studentList =  jdbcTemplate.query("select * from student where SID = '"+sid+"'", (rs,rowNum)->{
			Student s = new Student();
			s.setSid(rs.getString("SID"));
			s.setSname(rs.getString("SNAME"));
			s.setSemail(rs.getString("SEMAIL"));
			s.setScourse(rs.getString("SCOURSE"));
			s.setSaddr(rs.getString("SADDR"));
			s.setScity(rs.getString("SCITY"));
			s.setSstate(rs.getString("SSTATE"));
			s.setScountry(rs.getString("SCOUNTRY"));
			s.setScontact(rs.getString("SCONTACT"));
			return s;
		});
		if(studentList.isEmpty()==true) {
			student = null;
		}
		else {
			student = studentList.get(0);
		}
		return student;
	}

	@Override
	public String update(Student student) {
		String status = "";
		int rowCount = jdbcTemplate.update("update student set SNAME='"+student.getSname()+"',SEMAIL = '"+student.getSemail()+"',SCOURSE = '"+student.getScourse()+"', SADDR='"+student.getSaddr()+"', SCITY = '"+student.getScity()+"', SSTATE = '"+student.getSstate()+"', SCOUNTRY = '"+student.getScountry()+"', SCONTACT = '"+student.getScontact()+"' where SID = '"+student.getSid()+"'");
		if(rowCount == 1) {
			status = "success";
		}
		else {
			status = "failure";
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		String status = "";
		int rowCount = jdbcTemplate.update("delete from student where SID = '"+sid+"'");
		if(rowCount == 1) {
			status = "success";
		}
		else {
			status = "failure";
		}
		return status;
	}

}
