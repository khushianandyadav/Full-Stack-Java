package com.first.one;

public class DemoProject {
	
int age = 21; //this is an instance variable because it comes under a class 
String name = "Nisha"; double salary = 90000.00;

static double sal = 55000.00;
	public static void main(String[] khushi) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		DemoProject obj = new DemoProject();
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		
		//Static variable can be called in three ways
		System.out.println(sal);
		System.out.println(obj.sal);
		System.out.println(DemoProject.sal);
		
		
		
		
	}

}

/*
 * Company Standards - Start project name with capital letter
 * Package name should have a format of dots e.g. com.first.one
 * in public static void main(String[] args) String[] makes sure output displays in a single line(ie in an array)
 * args is used to pass argument and you can write anything over there instead of args
 *static = global 
 
 * TYPES OF VARIABLES
 
 1) Instance Variable
 The variable declared inside the class and outside the function without 'static' keyword. 
 To call instance variable we have only one option that is object reference.
 
  2) Local Variable
  The variable declared inside the class and inside any function without static keyword is called local variable.
  
  3) Static Variable
  The variable declared inside the class and outside the function with static keyword is called static variable.
  static is used to save memory because creating objects utilizes memory.
 * 
 * 
 * */
