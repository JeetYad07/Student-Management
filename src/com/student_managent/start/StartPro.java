package com.student_managent.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.student_management.stduent.Student;
import com.student_management.stduent.StudentDao;



public class StartPro {
	
	private static int id;
	private static Student st;
	private static int rollno;
	private static String className;
	private static String grade;

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		
		System.out.println("Welcome to Student Management App!!");
		
		// Java BufferedReader class is used to read the text from a character-based input stream.
		  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));    
		  
		while(true) {
			System.out.println("Press 1 to Add student details!");
			System.out.println("Press 2 to Delete student details!");
			System.out.println("Press 3 to display student details!");
			System.out.println("Press 4 to update student details!");
			System.out.println("Press 5 to exit the programm! ");
			int choice = Integer.parseInt(br.readLine());
			
			// choice decision for crud operation
			if(choice == 1) {
				//insert oper
			
				System.out.println("Enter Student name : ");
				String name = br.readLine();
				System.out.println("Enter Student rollno : ");
				int rollno = Integer.parseInt(br.readLine());
				System.out.println("Enter Student class name : ");
				String className = br.readLine();
				System.out.println("Enter Student grade : ");
				String grade = br.readLine();
				
					// create student object
					Student st = new Student(name,rollno,className,grade);
				boolean answer = 	StudentDao.insertStudentDB(st);
					if(answer) {
						System.out.println("Stduent Details Added Successfully........");
					}
					else {
						System.out.println("Something went wrong try again...........");
					}
					
			}
			else if(choice == 2) {
				//Delete operation
					System.out.println("Enter id to delete from student details : ");
					int id  = Integer.parseInt(br.readLine());
				boolean ans =	StudentDao.deleteStudentDetails(id);
				
				if(ans) {
					System.out.println("Student deatils deleted.......");
				}else {
					System.out.println("Something went wrong try again........");
				}
			
			}else if(choice == 3) {
				// Display operation
				StudentDao.showAllDetails();
			}else if(choice == 4) {
				
		
                
				
				System.out.println("Enter student Id which you want to update");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter student name :");
				String name=br.readLine();
				
				System.out.println("Enter student rollno which you want to update");
				int rollno=Integer.parseInt(br.readLine());
				
				System.out.println("Enter student className :");
				String className=br.readLine();
				
				System.out.println("Enter student grade :");
				String grade=br.readLine();
				
				boolean f =	StudentDao.updateStudent(id, name,rollno,className, grade);
				
				if(f=true) {
					System.out.println("Student updated successfully..\n");
				}
				else {
					System.out.println("Something went wrong .. please try again..\n");
			}
			}else if(choice == 5) {
				//Exist
				break;
			}else {
				
			}
		}
		System.out.println("Thank you for using my app!!");
		System.out.println("See you soon!!");
	}

}
