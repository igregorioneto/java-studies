package structure;

public class Program {

	public static void main(String[] args) {
//		Number is negative?
		NumberInteger ni = new NumberInteger(-10);
		System.out.println(ni);
		
		ni.setA(8);
		System.out.println(ni);
		
		ni.setA(0);
		System.out.println(ni);
		System.out.println();
		
//		Number is ever or odd?
		EvenOrOdd eo = new EvenOrOdd(12);
		System.out.println(eo);
		
		eo.setA(-27);
		System.out.println(eo);
		
		eo.setA(0);
		System.out.println(eo);
		System.out.println();
		
//		is Multiple
		Multiples m = new Multiples(6,24);
		System.out.println(m);
		
		m.setA(6);
		m.setB(25);
		System.out.println(m);
		
		m.setA(24);
		m.setB(6);
		System.out.println(m);
		System.out.println();
		
//		Total game time
		GameTime gt = new GameTime(16,2);
		System.out.println(gt);
		
		gt.setA(0);
		gt.setB(0);
		System.out.println(gt);
		
		gt.setA(2);
		gt.setB(16);
		System.out.println(gt);
	}

}
