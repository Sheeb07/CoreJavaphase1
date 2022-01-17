package assignments;

import java.util.Scanner;

	//You are given a project to demonstrate the uses of classes, objects, and the object-oriented pillars in Java.

	public class Question19Emp  {

		private static int id;
		private static String Name;
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		public Question19Emp(int id, String name) {
			super();
			this.id = id;
			Name = name;
		}


		public static void main (String [] args){
			
		
			Question19Emp emp1 = new Question19Emp(11,"Sheeba");
			System.out.println(emp1.toString());
			System.out.println(emp1.hashCode());

		}
		@Override
		public String toString(){
			
		return "Employee ID : "+id +" Employee Name :"+Name;
		  	   
	   }
		@Override
		public int hashCode(){
			return id ;
		}
	}


