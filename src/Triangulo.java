
public class Triangulo {

	public double base = 0;
	public double altura = 0;
	public double area = 0;
	
	
	public Triangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return (this.base * this.altura) / 2;
	
	}
}
