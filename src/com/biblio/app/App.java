package com.biblio.app;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création des objets
		
		Person person1 = new Person("El bettal",21);
		Person person2 = new Person("El bettal",21);
		Person person3 = new Person("El bettal",21);
		
		Student student1 = new Student(person1,"YC");
		Student student2 = new Student(person1,"YC");
		Student student3 = new Student(person1,"YC");


		
		Book book1 = new Book("je te promet la liberté", "Laurent gounelle", 230);
		Book book2 = new Book("je te promet la liberté", "Laurent gounelle", 230);
		Book book3 = new Book("je te promet la liberté", "Laurent gounelle", 230);
		
		Employee employee1 = new Employee("El bettal",21, 45000);
		Employee employee2 = new Employee("El bettal",21, 45000);
		Employee employee3 = new Employee("El bettal",21, 45000);


		ArrayList<Student> listStudents = new ArrayList<Student>();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		ArrayList<Book> listBooks = new ArrayList<Book>();
		
		
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		
		listBooks.add(book1);
		listBooks.add(book2);
		listBooks.add(book3);
		
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		
		while(true) {
		Scanner reader = new Scanner(System.in);
		Scanner test = new Scanner(System.in);
	    System.out.print("What to manage students, employees, or books? (s/e/b) : ");
	    char choice = reader.next().charAt(0);
	   
	 
		switch (choice) {
	      case 's':
	    	  System.out.println("Student list :");
	    	  //Affichage des etudiants :
	    	  for(int i=0; i<listStudents.size() ;i++)
	    	  {
	    		  System.out.println("\t The student "+ (i+1) +":");
	    		  System.out.println(listStudents.get(i).toString());
	    	  }
 			  System.out.println("Add, update or delete ? (a/u/d) :");
 			  char choice2 = reader.next().charAt(0);
 			  switch(choice2)
 			  {
	 			  case 'a' : 
	 				 Student student01 = new Student();
		 			 System.out.println("New student : ");
		 			 System.out.println("Enter name : ");
		 			 student01.setName(reader.next()) ;
		 			 System.out.println("Enter age: ");
		 			 student01.setAge(reader.nextInt()) ;
		 			 System.out.println("Entrer school: ");
		 			 student01.setSchool(reader.next()) ;
		 			 listStudents.add(student1);
	 			  	break;
	 			  	
		      	  case 'u' : 
		      		for (int i = 0; i < listStudents.size(); i++) 
					{
						System.out.println(listStudents.get(i).toString()); 
					}
		 			 System.out.println("Update student : ");
		 			 System.out.println("Enter student's index ");
		 			 int id01 = reader.nextInt();
		 			 System.out.println("Enter new name : ");
		 			 listStudents.get(id01).setName(reader.next()) ;
		 			 System.out.println("enter new age: ");
		 			 listStudents.get(id01).setAge(reader.nextInt()) ;
		 			 System.out.println("enter new school: ");
		 			 listStudents.get(id01).setSchool(reader.next()) ;
		 			 System.out.println(listStudents.get(id01).toString());
				  	break;
				  	
				  case 'd' : 
						for (int i = 0; i < listStudents.size(); i++) 
						{
							System.out.println(listStudents.get(i).toString()); 
						}
						System.out.println("Enter student's index : ");
						int id2 = reader.nextInt();
						listStudents.remove(id2);
						System.out.println("Etudiant deleted!");
				  	break;
				}
		      break;  
	      case 'e':
	    	  System.out.println("Employees list :");
	    	  //Affichage des employees :
	    	  for(int i=0; i<listEmployees.size() ;i++)
	    	  {
	    		  System.out.println("\t The employee "+ (i+1) +":");
	    		  System.out.println(listEmployees.get(i).toString());
	    	  }
 			  System.out.println("Add, update or delete ? (a/u/d) :");
 			  char choice3 = reader.next().charAt(0);
 			  switch(choice3)
 			  {
	 			  case 'a' : 
	 				 Employee employee01 = new Employee();
		 			 System.out.println("New employee : ");
		 			 System.out.println("Enter name : ");
		 			 employee01.setName(reader.next()) ;
		 			 System.out.println("entrez son age: ");
		 			 employee01.setAge(reader.nextInt()) ;
		 			 System.out.println("entrez son salary: ");
		 			 employee01.setSalary(reader.nextInt()) ;
		 			 listEmployees.add(employee01);
	 			  	break;
	 			  	
		      	  case 'u' : 
		      		for (int i = 0; i < listEmployees.size(); i++) 
					{
						System.out.println(listEmployees.get(i).toString()); 
					}
		 			 System.out.println("Update employee : ");
		 			 System.out.println("Enter employee's index : ");
		 			 int id01 = reader.nextInt();
		 			 System.out.println("Enter new name : ");
		 			 listEmployees.get(id01).setName(reader.next()) ;
		 			 System.out.println("enter new age: ");
		 			 listEmployees.get(id01).setAge(reader.nextInt()) ;
		 			 System.out.println("enter new salary: ");
		 			 listEmployees.get(id01).setSalary(reader.nextInt()) ;
		 			 System.out.println(listEmployees.get(id01).toString());
				  	break;
				  	
				  case 'd' : 
						for (int i = 0; i < listEmployees.size(); i++) 
						{
							System.out.println(listEmployees.get(i).toString()); 
						}
						System.out.println("Entrer employee's index : ");
						int id2 = reader.nextInt();
						listEmployees.remove(id2);
						System.out.println("Employee deleted");
				  	break;
				}
	        break;

	      case 'b':
	    	   System.out.println("Books list :");
		    	  //Affichage des livres :
		    	  for(int i=0; i<listBooks.size() ;i++)
		    	  {
		    		  System.out.println("\t The book "+ (i+1) +":");
		    		  System.out.println(listBooks.get(i).toString());
		    	  }
	 			  System.out.println("Add, update or delete ? (a/u/d) :");
	 			  char choice4 = reader.next().charAt(0);
	 			  switch(choice4)
	 			  {
		 			  case 'a' : 
		 				 Book book4 = new Book();
			 			 System.out.println("New book : ");
			 			 System.out.println("Enter title : ");
			 			 book4.setTitle(reader.next()) ;
			 			 System.out.println("enter author : ");
			 			 book4.setAuthor(reader.next()) ;
			 			 System.out.println("enter ref : ");
			 			 book4.setRef(reader.nextInt()) ;;
			 			 listBooks.add(book4);
		 			  	break;
		 			  	
			      	  case 'u' : 
			      		for (int i = 0; i < listBooks.size(); i++) 
						{
							System.out.println(listBooks.get(i).toString()); 
						}
			 			 System.out.println("Update book : ");
			 			 System.out.println("Enter book's index : ");
			 			 int id01 = reader.nextInt();
			 			 System.out.println("Enter title : ");
			 			 listBooks.get(id01).setTitle(reader.next()) ;
			 			 System.out.println("Enter author : ");
			 			 listBooks.get(id01).setAuthor(reader.next()) ;
			 			 System.out.println("Enter ref : ");
			 			 listBooks.get(id01).setRef(reader.nextInt()) ;
			 			 System.out.println(listBooks.get(id01).toString());
					  	break;
					  	
					  case 'd' : 
							for (int i = 0; i < listBooks.size(); i++) 
							{
								System.out.println(listBooks.get(i).toString()); 
							}
							System.out.println("Entrer book's index : ");
							int id2 = reader.nextInt();
							listBooks.remove(id2);
							System.out.println("Book deleted");
					  	break;
					}
	        break;

	        
	      default:
	        System.out.printf("Error! section is not correct");
	        return;
	        
	    	}

		}
		
	}
	
}