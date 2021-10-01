package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangles;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangles x, y;
		x = new Triangles();
		y = new Triangles();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		
		if(x.area() > y.area()) {
			System.out.println("areaX is bigger");
		} else {
			System.out.println("areaY is bigger");
		}
		sc.close();
	}

}
