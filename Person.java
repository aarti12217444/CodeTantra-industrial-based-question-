


/*Imagine you are writing a small program to simulate a family gathering, and you want to represent each family member using a Java class named Person. The program should be able to handle family members of varying ages and include their names.



Your task is to create the Person class with attributes for the person's name and age, and methods getName(), setName(), getAge(), and setAge() ﻿incorporating both default and parameterized constructors.



Input Format:

The first input line reads a string representing the name.

The next input line reads an integer representing age.



Output Format:

The output lines print the default name and age followed by user entered name and age.



Note: Take the default name as Unknown and the age as 0. Use println() to print the output statements.
*/

import java.util.Scanner;
public class Person{
	private String name;
	private int age;
	
	public Person(){
		this.name = "Unknown";
		this.age=0;
	}
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person defaultPerson = new Person();
        String nameInput = scanner.nextLine();
        int ageInput = scanner.nextInt();
        Person userInputPerson = new Person(nameInput, ageInput);
        System.out.println("Default Person: Name - " + defaultPerson.getName() + ", Age - " + defaultPerson.getAge());
        System.out.println("User Input Person: Name - " + userInputPerson.getName() + ", Age - " + userInputPerson.getAge());
        scanner.close();
    }
}
