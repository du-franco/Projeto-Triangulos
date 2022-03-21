
public class Principal {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo(15, 10);
		Triangulo t2 = new Triangulo(25, 15);
		Triangulo t3 = new Triangulo(35, 20);
		
		System.out.println("Triangulo 1:" + "Base: " + t1.getBase() + " altura: " + t1.getAltura() + " area: " + t1.area() );
		System.out.println("Triangulo 2:" + "Base: " + t2.getBase() + " altura: " + t2.getAltura() + " area: " + t2.area() );
		System.out.println("Triangulo 3:" + "Base: " + t3.getBase() + " altura: " + t3.getAltura() + " area: " + t3.area() );
	}

}
