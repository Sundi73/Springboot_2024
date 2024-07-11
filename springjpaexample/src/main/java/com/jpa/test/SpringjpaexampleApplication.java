package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepositry;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
							SpringApplication.run(SpringjpaexampleApplication.class, args);
		
	   UserRepositry userRepositry = context.getBean(UserRepositry.class);
	   
	 /*  User user = new User();
	   
	   user.setName("Ashutosh Kumar Tiwari");
	   user.setCity("Delhi");
	   user.setStatus("I am java developer");

	   User user1 = new User();
	   
	   user1.setName("Shivam");
	   user1.setCity("Gorakhpur");
	   user1.setStatus("I am python developer");
	   
	   List<User> users = List.of(user,user1);
	   
	   users.forEach(t ->{
		   System.out.println(t);
	   });
	   
	   Iterable<User> saveAll = userRepositry.saveAll(users);
	   
	   System.out.println(saveAll);
	   */
	   
	   //Updating user detail by Id.
//	   
//	   Optional<User> getId = userRepositry.findById(102);
//	   
//	   User user2 = getId.get();
//	   user2.setName("Ankit Tiwari");
//	   
//	   userRepositry.save(user2);
//	   
//	   System.out.println(user2);
	   
	   // read All users from database
	   
//	   Iterable<User> findAll = userRepositry.findAll();
//	   
////	   findAll.forEach(user -> {
////		   System.out.println(user);
////	   });
////	   
//	   
//	   Iterator<User> itr = findAll.iterator();
//	   
//	   while(itr.hasNext()) {
//		   User users = itr.next();
//		   System.out.println(users);
//	   }
	   
	   
	   userRepositry.deleteById(102);
	   
	   System.out.println("Deleted");
	   
	   userRepositry.deleteAll();
	   System.out.println("Deleted all ");
	   
	}

}
