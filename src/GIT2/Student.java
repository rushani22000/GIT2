package GIT2;

import java.util.*;

public class Student {

	public static void main(String[] args) {
		

		
				Scanner no = new Scanner(System.in);  
				
				// Get Values From Student
				System.out.println("Enter Index No = ");
				int indexNo = Integer.parseInt(no.nextLine());  
				
				System.out.println("Enter First Name = ");
				String fName = no.nextLine();  
				
				System.out.println("Enter Last Name = ");
				String lName = no.nextLine();  
				
				System.out.println("Enter Age = ");
				int age = Integer.parseInt(no.nextLine());
				
				System.out.println("Enter First Subject Marks = ");
				int fm = Integer.parseInt(no.nextLine());
				
				System.out.println("Enter Second Subject Marks = ");
				int sm = Integer.parseInt(no.nextLine());
				
				System.out.println("Enter Third Subject Marks = ");
				int tm = Integer.parseInt(no.nextLine());
				
				// Create Object use Student_Grade Class 		
				Student_Grade marks = new Student_Grade();
				
				// Assign Marks For variable of Student_Grade Class 
				marks.firstMarks = fm;
				marks.secondMarks = sm;
				marks.thirdMarks = tm;
				
							
				String sGrade = marks.grade();
				
				
				// Output Student Personal Data , Average Marks And Grade 
				System.out.println("Index No = " + indexNo) ;
				System.out.println("Full Name = " + fName +" " + lName);
				System.out.println("Age = " +  age );
				System.out.println("Average Marks = " +  marks.avg );
				System.out.println("Grade = " + sGrade);
				
	}

}
