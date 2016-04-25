package javatpoint;
import java.lang.*;

public class StringDemo {
	
	public static void main(String[] args) {
		  
		   String str1 = "Collections of tutorials at tutorials point";
		   
		   System.out.println(str1.charAt(11));
		  
		   /*  search starts from index 10 and if located it returns 
		   the index of the first character of the substring "tutorials" */
		   System.out.println("index = " + str1.indexOf("tutorials", 10)); 
		      
		   /* search starts from index 9 and returns -1 as substring "admin"
		   is not located */
		   System.out.println("index = " + str1.indexOf("admin", 9));     
		   }

}
