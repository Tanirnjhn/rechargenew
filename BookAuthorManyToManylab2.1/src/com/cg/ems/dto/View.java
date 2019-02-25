package com.cg.ems.dto;

import java.util.*;

import javax.persistence.*;

public class View {
	public static void main(String[] args)
	{
    EntityManager em=JPAUtil.getEntityManager();
    EntityTransaction et=em.getTransaction();
    
    Author a= new Author();
    a.setAuthName("meera");
    
    
    Author a1= new Author();
    a1.setAuthName("Ram");
    
    
     Author a2= new Author();
    a2.setAuthName("shyam");

    Set<Author> eet= new HashSet<Author>();
    eet.add(a);
    eet.add(a1);
    eet.add(a2);

   
   Book bk=new Book();
   bk.setISBN(4535);
   bk.setPrice(100.0f);
   bk.setTitle("fgth");
   bk.setAuth(eet);
   
   Book bk1=new Book();
   bk1.setISBN(455);
   bk1.setPrice(2300.0f);
   bk1.setTitle("fghfs");
   bk1.setAuth(eet);
   
//   Book bk2=new Book();
//   bk2.setISBN(4556);
//   bk2.setPrice(23890.0f);
//   bk2.setTitle("iyuhfs");
    
   Set<Book> ek=new HashSet<Book>();
   ek.add(bk);
  ek.add(bk1);
//   ek.add(bk2);
   
   
   
   

   
   et.begin();
//   em.persist(bk);
//   em.persist(a1);
//  em.persist(a2);
   em.persist(bk);
   em.persist(bk1);

//   em.persist(bk2);
   et.commit();
  System.out.println("data is persisted");
	}
    
}
