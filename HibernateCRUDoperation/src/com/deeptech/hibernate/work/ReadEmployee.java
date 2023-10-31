package com.deeptech.hibernate.work;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class ReadEmployee {
	public static void main(String[] args)
	{	
	 SessionFactory sf = HibernateUtil.connection();
	 Session ses = sf.openSession();
	 ses.beginTransaction();  //performs DML operations(insert,select,update,delete)
	 //collection framework
	 Query q = ses.createQuery("from Employee");
	 List<Employee> et = q.list();
	  for(Employee e:et)
	  {
		System.out.println(e.getempName()+"\t"+e.getemail()+"\t"+e.getmobile()+"\t"+e.getage()+"\t"+e.getsalary()+"\t"+e.getstate());
	  }
	}
}
