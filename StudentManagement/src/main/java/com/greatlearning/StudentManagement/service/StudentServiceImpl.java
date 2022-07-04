package com.greatlearning.StudentManagement.service;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.StudentManagement.model.Student;



@Repository 
public class StudentServiceImpl implements StudentService{
	private SessionFactory sessionFactory;
	private Session session;
	
	@Autowired
	
	public StudentServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			this.session = sessionFactory.getCurrentSession();
		}
		catch (HibernateException e) {
			// TODO: handle exception
			this.session=sessionFactory.openSession();
		}
	}
	@Override
	@Transactional
	public List<Student> listAllData() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Student> l1= (List<Student>)session.createQuery("from Student").list();
		return l1;
	}

	@Override
	public void save(Student s1) {
		// TODO Auto-generated method stub
		//System.out.println(s1.getId()+" "+s1.getCountry()+" "+s1.getDept()+" "+s1.getName());
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(s1);
		tx.commit();
		System.out.println("Save Completed");
		
	}

	@Override
	@Transactional
	public Student delete (int id){
		// TODO Auto-generated method stub
		Student s1 = session.get(Student.class,id);
		session.delete(s1);
		return s1;
	}
	@Override
	public Student getStudentDetails(int id) {
		// TODO Auto-generated method stub
		Student s1 = session.get(Student.class,id);
		return s1;
	}
	
		
	
}
