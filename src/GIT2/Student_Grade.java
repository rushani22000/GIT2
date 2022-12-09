package GIT2;

public class Student_Grade {
	
	// Create Variable for Student_Grade Class 
	public int firstMarks;
	public int secondMarks;
	public int thirdMarks;
	double avg = 0.0; 
	String gradeValue = "";
	
	/*   Create Constructor for Student_Grade class because 
	when creating new object from Student_Grade class 
	first point, second point, third point should be null.   */
			
	Student_Grade()
	{
		firstMarks = 0;
		secondMarks = 0;
		thirdMarks = 0;
	
	}
	
	public static void main(String[] args) 
	{	
	
	}
		// Select Grading to Average Marks
		String grade()
		{
			avg = (firstMarks + secondMarks + thirdMarks)/3;
			if (75 <= avg && avg <= 100 )
			{
				gradeValue = "A";
			}
			else if (65 <= avg && avg <= 74 )
			{
				gradeValue = "B";
			}
			else if (50 <= avg && avg <= 64 )
			{
				gradeValue = "C";
			}
			else if (35 <= avg && avg <= 49 )
			{
				gradeValue = "S";
			}
			else if (0 <= avg && avg <= 34 )
			{
				gradeValue = "F";
			}
			else
			{
				gradeValue = "Invalid";
			}
			
			return gradeValue;
		
		
		
	}

}
