package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class WriteObjects {
	
	public static void main(String[] args) {
		
		System.out.println("Writing Objects");
		Person[] people = { new Person(1,"Bob"),new Person(2, "Sue"),new Person(3, "Jack")};
		
		try (FileOutputStream fs = new FileOutputStream("test.ser")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(people);
			os.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
