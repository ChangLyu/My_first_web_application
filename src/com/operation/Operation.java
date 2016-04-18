package com.operation;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.controller.HibernateUtil;
import com.model.Contacts;

//import com.contact.Contacts;

public class Operation {


private Session session;
private Contacts[] ctArray;

public void add(int id,String name,String mobile_phone, String email){
      Contacts ct=new Contacts();
      ct.setId(id);
      ct.setName(name);
      ct.setMobile_number(mobile_phone);
      ct.setEmail(email);
      session=HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      session.save(ct);
      session.getTransaction().commit();
      session.close();
}

@SuppressWarnings("rawtypes")
public List getAllInf(){
	session= HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();	
	
	String hql = "FROM Contacts";
	Query query = session.createQuery(hql);

//	List<Contacts> results=(List<Contacts>)query.list();
	List results=query.list();
  
    return results;
}
public void edit(int id,String name,String mobile_phone, String email){
    Contacts ct=new Contacts();
    ct.setId(id);
    ct.setName(name);
    ct.setMobile_number(mobile_phone);
    ct.setEmail(email);
    session=HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.update(ct);
    session.getTransaction().commit();
    session.close();
}

public void delete(int id){
	session=HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
	Contacts ct=(Contacts)session.get(Contacts.class,id);
	session=HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.delete(ct);
    session.getTransaction().commit();
    session.close();
	
}

public Contacts getContactById(int id){
	session=HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
	return (Contacts)session.get(Contacts.class,id);
}

}
