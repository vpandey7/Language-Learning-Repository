package udemy;

class Animal{
	private int id;
	private String name;
	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class Lec45 {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal(5, "Fido");
		Animal animal2 = new Animal(5, "Fido");
		
		System.out.println(animal1.equals(animal2));
		
		String text1 = "Hello";
		String text2 = "Hello";
		System.out.println(text1.equals(text2));
		
	}

}
