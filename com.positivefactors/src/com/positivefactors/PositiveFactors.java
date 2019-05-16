package com.positivefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author msfata ProgrammingHelp 16/05/2019
 */
public class PositiveFactors {

	public static void main(String[] args) {
		System.out.println(positiveFactor(6));
		System.out.println("-----------------------------");
		System.out.println(pos(6));
	}

	/*
	 * show only positive factor count
	 */
	private static int pos(int number) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				list.add(i);
			}
		}
		return list.size();
	}

	/*
	 * shows positive factors
	 */
	private static int positiveFactor(int number) {
		int i;
		String string = "";
		System.out.print("Factors of " + number + " are: ");
		for (i = 1; i <= number; i++) {
			if (number % i == 0) {
				string += i;
			}
		}
		return Integer.parseInt(string);
	}
}