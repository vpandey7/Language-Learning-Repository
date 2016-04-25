package javatpoint;

interface A{
	void a();
	void b();
	void c();
	void d();
}

class B implements A{
	public void c(){
		System.out.println("C abstracted");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("A abstracted");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("B abstracted");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("D abstracted");
	}
}


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		a.a();
		a.b();
		a.c();
		a.d();
		

	}

}
