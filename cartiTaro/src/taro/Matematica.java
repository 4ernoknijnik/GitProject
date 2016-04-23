package taro;

import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Matematica extends GUI {
	public int Const1;
	public int Const2;
	public int Const3;
	public int Const4;
	public int Const5;
	public int Const6;
	public int Const7;
	public int Const8;
	public int Const9;
	public int Const10;
	public int Const11;
	public int Const12;
	public int Const13;

	public void Matematica(String day, String month, String year) {

		Const1 = Integer.parseInt(day);
		Const2 = Integer.parseInt(month);

		String year1 = "" + (year.charAt(year.length() - 4));
		String year2 = "" + (year.charAt(year.length() - 3));
		String year3 = "" + (year.charAt(year.length() - 2));
		String year4 = "" + (year.charAt(year.length() - 1));

		int one = Integer.parseUnsignedInt(year1);
		int two = Integer.parseUnsignedInt(year2);
		int three = Integer.parseUnsignedInt(year3);
		int four = Integer.parseUnsignedInt(year4);

		Const3 = (one + two) + (three + four);

	}

	public int sum() {

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
		System.out.println("10 = " + Const10 + "мюдн опнбепхрэ опюбхкэмнярэ");

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
		System.out.println("13 = " + Const13 + "мюдн опнбепхрэ опюбхкэмнярэ");

		return Const1 & Const2 & Const3 & Const4 & Const5 & Const6 & Const7 & Const8 & Const9 & Const10 & Const11
				& Const12 & Const13;
	}

}