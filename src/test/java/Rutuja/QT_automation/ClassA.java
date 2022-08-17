package Rutuja.QT_automation;

class Student{
	  String name;
	  public Student(String s){
	    name = s;
	  }
	  public Student(){
	    name = "Unknown";
	  }
	}

	class Main{
	  public static void main(String[] args){
	    Student s = new Student("Rutuja");
	    Student a = new Student();

	    System.out.println(s.name);
	    System.out.println(a.name);
	  }
	}
