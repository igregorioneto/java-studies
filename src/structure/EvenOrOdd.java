package structure;

public class EvenOrOdd {
	
	public int a;
	
	public EvenOrOdd(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public String isEvenOrOdd() {
		int value = Math.abs(this.a);
		if(value % 2 == 0) {
			return "PAR";
		} else if(value % 2 == 1) {
			return "IMPAR";
		}
		return null;
	}
	
	public String toString() {
		return isEvenOrOdd();
	}

}
