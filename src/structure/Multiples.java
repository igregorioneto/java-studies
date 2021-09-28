package structure;

public class Multiples {
	
	private int a;
	private int b;
	
	public Multiples(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public String isMultiple() {
		int n1;
		int n2;
		
		if( this.a < this.b ) {
			n1 = this.b;
			n2 = this.a;
		} else {
			n1 = this.a;
			n2 = this.b;
		}
		
		if(n1%n2 == 0) {
			return "Sao Multiplos";
		} else {
			return "Nao sao Multiplos";
		}
	}
	
	public String toString() {
		return isMultiple();
	}

}
