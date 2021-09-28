package structure;

import structure.exception.StructureException;

public class GameTime {
	
	private int a;
	private int b;
	
	public GameTime(int a, int b) {
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
	
	public int duractionTime() {
		int n1 = this.a;
		int n2 = this.b;
		int time = 0;
		
		if(n1 > n2) {
			time = (24 - n1) + n2;
		} else if(n2 > n1) {
			time = (n2 - n1);
		} else {
			time = 24;
		}
		
		return time;
	}
	
	@Override
	public String toString() {
		return "O JOGO DUROU "
				+ duractionTime()
				+ " HORA(S)";
	}

}
