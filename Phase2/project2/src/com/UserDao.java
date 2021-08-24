package com;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDao {

	public List<Teacher> getTeacher() {
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		TypedQuery<Teacher> query = session.createQuery("select t from com.Teacher t", Teacher.class);
		List<Teacher> teacher = query.getResultList();
		session.close();
		factory.close();
		return teacher;
	}

	public List<Student> getStudent() {
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		TypedQuery<Student> query = session.createQuery("select s from com.Student s", Student.class);
		List<Student> student = query.getResultList();
		session.close();
		factory.close();
		return student;
	}

	public List<Subject> getSubject() {
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		TypedQuery<Subject> query = session.createQuery("select sub from com.Subject sub", Subject.class);
		List<Subject> subject = query.getResultList();
		session.close();
		factory.close();
		return subject;
	}
	
	public List<Classes> getClasses() {
		SessionFactory factory = HiberanteUtil.getSessionFactory();
		Session session = factory.openSession();
		TypedQuery<Classes> query = session.createQuery("select cl from com.Classes cl", Classes.class);		
		List<Classes> classes = query.getResultList();
		session.close();
		factory.close();
		return classes;
	}
}
