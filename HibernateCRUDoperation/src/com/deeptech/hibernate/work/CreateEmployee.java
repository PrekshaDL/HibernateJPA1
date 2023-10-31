package com.deeptech.hibernate.work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class CreateEmployee{
	public static void main(String[] args) 
	{
		Employee s = new Employee();
		s.setempName("Preksha");
		s.setemail("preksha68@gmail.com");
		s.setmobile("7204722711");
		s.setage(20);
		s.setsalary(55000.23);
		s.setstate("Karnataka");
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("Insert Record Success");
		ses.close();
		sf.close();
	}
}