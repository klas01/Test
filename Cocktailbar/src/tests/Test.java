package tests;

import java.util.Vector;

import arten.Cocktail;
import arten.Getraenk;
import arten.Saft;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saft Orangensaft = new Saft("O-Saft",45 );
		Saft Apfelsaft = new Saft("Apfelsaft", 46);
		Vector v = new Vector();
		Getraenk[] g = new Getraenk [2]; // array variabel machen
		g[0] = Apfelsaft;
		g[1] = Orangensaft;
		Cocktail c1 = new Cocktail("Super-Saft", g);
		System.out.println(c1.getKalorien());
		System.out.println("hey");
	}

}