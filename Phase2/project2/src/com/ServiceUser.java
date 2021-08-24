package com;

import java.util.List;

public class ServiceUser {
	private UserDao dao;

	public ServiceUser() {
		dao = new UserDao();
	}

	public List<Teacher> fechTeacher() {
		List<Teacher> list = null;
		list = dao.getTeacher();
		return list;
	}

	public List<Student> fechStudent() {
		List<Student> list = null;
		list = dao.getStudent();
		return list;
	}

	public List<Subject> fechSubject() {
		List<Subject> list = null;
		list = dao.getSubject();
		return list;
	}
	
	public List<Classes> fechClasses() {
		List<Classes> list = null;
		list = dao.getClasses();
		return list;
	}
}
