package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class UpdateEmployee {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		Employee e = ses.get(Employee.class,1);
		e.setempName("Ananya");
		e.setemail("ani123@gmail.com");
		e.setmobile("8951756868");
		e.setage(20);
		e.setsalary(50000.00);
		e.setstate("Delhi");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("Update success");
	
	}

}