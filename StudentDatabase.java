/**
 * 
 */
package com.Java8.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class StudentDatabase {
	
	public static  List<Student> getAllStudents(){
		Student stud1 = new Student(101, "Sachin", "M", 9.5, Arrays.asList("Reading","Swimming","Gym","Cooking"));
		Student stud2 = new Student(102, "Ram", "M", 2.5, Arrays.asList("Paying","Swimming","Waching TV"));
		Student stud3 = new Student(103, "Sham", "M", 3.5, Arrays.asList("Reading","Swimming","Trading","Dancing"));
		Student stud4 = new Student(104, "Ankit", "M", 4.5, Arrays.asList("Gym","Singing","Waching TV","Cooking"));
		Student stud5 = new Student(105, "Amol", "M", 5.5, Arrays.asList("Reading","Swimming","Dancing","Cooking"));
		Student stud6 = new Student(106, "Puru", "M", 6.5, Arrays.asList("Gym","Swimming","Trading","Cooking"));
		Student stud7 = new Student(107, "Payal", "M", 7.5, Arrays.asList("Reading","Dancing","Waching TV","Cooking"));
		List<Student> studentList = Arrays.asList(stud1,stud2,stud3, stud4, stud5, stud6, stud7);
		return studentList;
	}

}
