package com.Java8.learn;

import java.util.List;
import java.util.function.Consumer;

import com.Java8.data.Student;
import com.Java8.data.StudentDatabase;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1  = (s) -> System.out.println(s.toUpperCase());
		// use of c1 Consumer Interface
		c1.accept("Welcome to the Java 8 Frunctional Interface : Consumer");
		System.out.println("******** Consumer Function Interface ******************");
		System.out.println();
		printStudent();
		printStudentAndHobbies();
	}

	private static void printStudent() {
		Consumer<Student> s1 = (s) -> System.out.println(s);
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(s1);
	}
	
	private static void printStudentAndHobbies() {
		Consumer<Student> studName = (stud) -> System.out.print(stud.getName() + " : -> " );
		Consumer<Student> studHobbies = (stud) -> System.out.println(stud.getHobbies());
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(studName.andThen(studHobbies)); // consumer chaining
	}
}
