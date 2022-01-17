package assignments;

import java.io.File;
import java.io.IOException;

public class trycatch {

		public static void main (String [] args){
			
			try {
				File file1 =new File("C:\\Users\\Sheeba");
				
				if (file1.createNewFile()){
					System.out.println("File Successfully Created");
				}else {if (file1.exists()){
					System.out.println("File Already Exists");
				}
				else {
					System.out.println("File Dosenot Exists");
				}
				}
			    }
				catch (IOException e){
			          e.getStackTrace();
					
				}
			}		
		}