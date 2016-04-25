package udemy;

class Elephant{
	
	private int id;
	private String name;
	
	public Elephant(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" ").append(name);
		return sb.toString();
		
	}
	
}

public class Lec25 {
	public static void main(String[] args){
		
		Elephant ele1 = new Elephant(7,"Ellen");
		Elephant ele2 = new Elephant(5, "Krkaen");
		System.out.println(ele1);
		System.out.println(ele2);
		
		
	}

}
