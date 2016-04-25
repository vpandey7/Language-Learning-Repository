package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects");
		
		try(FileInputStream fi = new FileInputStream("test.ser")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person[] people = (Person[]) os.readObject();
			
			for(Person person:people){
				System.out.println(person);
			}
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
