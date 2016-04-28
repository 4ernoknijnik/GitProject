package taro;

import taro.GUI;

public class Matematica {
	public static int Const1; // переменна€ Static что бы получить значение а не
								// 0
	public static int Const2;
	public static int Const3;
	public static int Const4;
	public static int Const5;
	public static int Const6;
	public static int Const7;
	public static int Const8;
	public static int Const9;
	public static int Const10;
	public static int Const11;
	public static int Const12;
	public static int Const13;

	public static int A;
	public static int B;
	public static int C;
	public static int D;
	public static int E;
	public static int F;
	public static int G1max;
	public static int G2help;
	public static int H;
	public static int I;
	public static int J;
	public static int K;

	public Matematica() {

		Const1 = Integer.parseInt(GUI.day);
		Const2 = Integer.parseInt(GUI.month);

		String year1 = "" + (GUI.year.charAt(GUI.year.length() - 4));
		String year2 = "" + (GUI.year.charAt(GUI.year.length() - 3));
		String year3 = "" + (GUI.year.charAt(GUI.year.length() - 2));
		String year4 = "" + (GUI.year.charAt(GUI.year.length() - 1));

		int one = Integer.parseUnsignedInt(year1);
		int two = Integer.parseUnsignedInt(year2);
		int three = Integer.parseUnsignedInt(year3);
		int four = Integer.parseUnsignedInt(year4);

		Const3 = (one + two) + (three + four);

	}

	public void sum() {

		if (Const1 >= 23) {
			Const1 = Const1 - 22;
		}
		System.out.println("1 = " + Const1);

		System.out.println("2 = " + Const2);

		if (Const3 >= 23) {
			Const3 = Const3 - 22;

		}
		System.out.println("3 = " + Const3);

		Const4 = Const1 + Const2;
		if (Const4 >= 23) {
			Const4 = Const4 - 22;
		}
		System.out.println("4 = " + Const4);

		Const5 = Const2 + Const3;
		if (Const5 >= 23) {
			Const5 = Const5 - 22;
		}
		System.out.println("5 = " + Const5);

		Const6 = Const4 + Const5;
		if (Const6 >= 23) {
			Const6 = Const6 - 22;
		}
		System.out.println("6 = " + Const6);

		Const7 = Const4 + Const3;
		if (Const7 >= 23) {
			Const7 = Const7 - 22;
		}
		System.out.println("7 = " + Const7);

		Const8 = Const2 + Const6;
		if (Const8 >= 23) {
			Const8 = Const8 - 22;
		}
		System.out.println("8 = " + Const8);

		Const9 = Const7 + Const8;
		if (Const9 >= 23) {
			Const9 = Const9 - 22;
		}
		System.out.println("9 = " + Const9);

		if (Const1 > Const2) {
			Const10 = Const1 - Const2;
		} else if (Const1 < Const2) {
			Const10 = Const2 - Const1;
		} else
			Const10 = 0;
		System.out.println("10 = " + Const10);

		if (Const2 > Const3) {
			Const11 = Const2 - Const3;
		} else if (Const2 < Const3) {
			Const11 = Const3 - Const2;
		} else
			Const11 = 0;
		System.out.println("11 = " + Const11);

		if (Const10 > Const11) {
			Const12 = Const10 - Const11;
		} else if (Const10 < Const11) {
			Const12 = Const11 - Const10;
		} else
			Const12 = 0;
		System.out.println("12 = " + Const12);

		Const13 = Const2 + Const4 + Const5 + Const6;
		if (Const13 >= 23) {
			Const13 = Const13 - 22;
		} else if (Const13 >= 23) {
			Const13 = Const13 - 22;
		} else if (Const13 >= 23) {
			Const13 = Const13 - 22;
		}
		System.out.println("13 = " + Const13);

		// ƒальше пошли буквы

		A = Const1 + Const4;
		if (A >= 23) {
			A = A - 22;
		}
		System.out.println("A = " + A);

		B = Const2 + Const4;
		if (B >= 23) {
			B = B - 22;
		}
		System.out.println("B = " + B);

		C = Const2 + Const5;
		if (C >= 23) {
			C = C - 22;
		}
		System.out.println("C = " + C);

		D = Const3 + Const5;
		if (D >= 23) {
			D = D - 22;
		}
		System.out.println("D = " + D);

		E = Const4 + Const6;
		if (E >= 23) {
			E = E - 22;
		}
		System.out.println("E = " + E);

		F = Const5 + Const6;
		if (F >= 23) {
			F = F - 22;
		}
		System.out.println("F = " + F);

		G1max = C + D;
		if (G1max >= 23) {
			G1max = G1max - 22;
		}
		System.out.println("G1max = " + G1max);

		G2help = B + F;
		if (G2help >= 23) {
			G2help = G2help - 22;
		}
		System.out.println("G2help = " + G2help);

		H = A + E;
		if (H >= 23) {
			H = H - 22;
		}
		System.out.println("H = " + H);

		I = G1max + G2help;
		if (I >= 23) {
			I = I - 22;
		}
		System.out.println("I = " + I);

		J = Const2 + Const8;
		if (J >= 23) {
			J = J - 22;
		}
		System.out.println("J = " + J);

		K = Const10 + Const6;
		if (K >= 23) {
			K = K - 22;
		}
		System.out.println("K = " + K);

		System.out.println("–асчет окончен.");

	}

}