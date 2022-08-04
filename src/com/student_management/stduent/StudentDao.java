package com.student_management.stduent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StudentDao {
	
	//Method to perform crud operation
		public static boolean insertStudentDB(Student st) {
			
			boolean f = false;
			try {
				
					Connection con = ConP.createC();
					// insert a query in database
					String q = "insert into student(name,rollno,className,grade) values(?,?,?,?) ";
					// dynamic query use preparedStatemnt
					PreparedStatement pstmt = 	con.prepareStatement(q);
					//set the values
					pstmt.setString(1, st.getName());
					pstmt.setInt(2, st.getRollno());
					pstmt.setString(3, st.getClassName());
					pstmt.setString(4, st.getGrade());
					
						//excute 
						pstmt.executeUpdate();
					   f = true;
					
					} catch (Exception e) {
						e.printStackTrace();
					}
					return f;
				
		}

		public static boolean deleteStudentDetails(int id) {
			
			boolean f = false;
			try {
				
					Connection con = ConP.createC();
					// insert a query in database
					String q = "delete from student where id = ?";
					// dynamic query use preparedStatemnt
					PreparedStatement pstmt = 	con.prepareStatement(q);
					//set the values
					pstmt.setInt(1, id);
						
						
					//excute 
					pstmt.executeUpdate();
					  f = true;
					
					} catch (Exception e) {
						e.printStackTrace();
					}
					return f;
		}

		public static void showAllDetails() {
			
		
			try {
				
					Connection con = ConP.createC();
					// insert a query in database
					String q = "select * from student; ";
					
					Statement stmt = con.createStatement();
				    ResultSet set = stmt.executeQuery(q);
		          
				    while(set.next()) {
				    	// get the values
				    	int id = set.getInt(1);
				    	String name = set.getString(2);
				    	int rollno = set.getInt(3);
				    	String className = set.getString(4);
				    	String grade = set.getString(5);
				    	
				    	//print all the values
				    	System.out.println("ID : "+id);
				    	System.out.println("Name : "+name);
				    	System.out.println("Rollno : "+rollno);
				    	System.out.println("className : "+className);
				    	System.out.println("Grade : "+ grade);
				    	   System.out.println("-----------------------------");
				    }
		//		    System.out.println("=====================================");
				 
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		}

		

		public static boolean updateStudent(int id, String name,int rollno, String className, String grade) throws SQLException {
		        boolean f;
				
				Connection con=ConP.createC();
				
				String qr="update student set name=?, rollno=?, className=?, grade = ? where id=?";
				
				PreparedStatement pstm=con.prepareStatement(qr);
				
				pstm.setString(1,name);
				pstm.setInt(2,rollno);
				pstm.setString(3,className);
				pstm.setString(4, grade);
				pstm.setInt(5, id);
				
				pstm.executeUpdate();
				
				f=true;
				return f;

		}
}
