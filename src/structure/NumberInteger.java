package structure;

public class NumberInteger {
	
	private int a;
	
	public NumberInteger(int a) {
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public String negative() {
		if(this.a < 0) {
			return "NEGATIVO";
		} else {
			return "NAO NEGATIVO";
		}
	}
	
	public String toString() {
		return negative();
	}

}
