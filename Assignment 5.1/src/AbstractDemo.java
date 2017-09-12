import java.util.*;   //importing the util class to use scanner method

abstract class Details {       //creating abstract class Details
	abstract String Name(String name);	//Abstract method Name to get name from user
	abstract String Course(String course);	//Abstract method Course to get course from user
	abstract int RegistrationNo(int roll);	//Abstract method Registration to get roll from user
	abstract float percentage(float percent);	//Abstract method Percentage to get percent from user
}

class StoreDetails extends Details{   //child class to implement abstract method 
	String name, course;		//declaration of string type variables to store name and course
	int roll_no;		//declaration of integer type variables to store roll number
	float percentage;	//declaration of float type variable  to store percentage
	String Name(String name) {    //implementation of abstract method Name
		this.name = name;  //getting the name and storing it in name variable from user
		return name;		//returning name 
	} 

	String Course(String course) {    //implementation of abstract method Course
		this.course = course;	//getting course and storing it in course variable from user
		return course;		//returning the value of course
	}

	int RegistrationNo(int roll) {    //implementation of abstract method course
		this.roll_no = roll;		//getting roll and storing it in roll_no variable from user
		return roll_no;		//returning the value of roll_no
	}

	float percentage(float percent) {   //implementation of abstract method course
		this.percentage = percent;	//getting percent and storing it in percentage variable from user
		return percentage;	//returning the value of percentage
	}
}
public class AbstractDemo {    //main class holding main method

	public static void main(String[] args) {   //main method of the program
		
		String s_name, s_course;    //initialization of string type variables
		int s_roll;		//initialization of integer type variables
		float s_percent;		//initialization of float type variables
		Scanner sc = new Scanner(System.in);		//creating object of scanner class
		StoreDetails sd = new StoreDetails();	//creating object of StoreDetails class
		System.out.println("Enter the Name of the Student: ");	//Statement to take name as input from the user prints on console
		s_name = sc.next();			//takes input from the user and stores in s_name variable
		System.out.println("Enter the Course of the Student: ");	 //Statement to take course as input from the user prints on console
		s_course = sc.next();		//takes input from the user and stores in s_course variable	
		System.out.println("Enter the Roll Number of the Student: ");   //Statement to take roll number as input from the user prints on console
		s_roll = sc.nextInt();		//takes input from the user and stores in s_roll variable
		System.out.println("Enter the Percentage of the Student: ");	  //Statement to take percentage as input from the user prints on console
		s_percent = sc.nextFloat();	//takes input from the user and stores in s_percent variable
		System.out.println("      STUDENT DETAILS      ");   //prints the statement on console
		System.out.println("Name: " +sd.Name(s_name));	//prints the message on the console and the data returned from the method
		System.out.println("Course: " +sd.Course(s_course));		//prints the message on the console and the data returned from the method
		System.out.println("Roll Number: " +sd.RegistrationNo(s_roll));		//prints the message on the console and the data returned from the method
		System.out.println("Percentage: " +sd.percentage(s_percent));		//prints the message on the console and the data returned from the method
		sc.close();       //closing of scanner class
	}

}
