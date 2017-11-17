package uk.ac.brunel.cs1702;

public class GradeCalculator {

import java.util.Scanner;

public class main {

	// declaration of static constants with value
	
	public static final 	double W1 = 0.10;
	public static final 	double W2 = 0.10;
	public static final 	double W3 = 0.15;
	public static final 	double W4 = 0.15;
	public static final 	double W5 = 0.25;
	public static final 	double W6 = 0.25;
	
	// declaration of static variables
	
	public static double a1;
	public static double a2;
	public static double a3;
	public static double a4;
	public static double a5;
	public static double a6;
		
	public static String v1;
	public static String v2;
	public static String maxV;
	
	public static double totalMarks;
	public static String finalGrade;

	public static Scanner scanner = new Scanner(System.in);
	
	// Here the user is inputting the grades for the worksheets and the viva grade
	
	public static void main(String[] args) {
		System.out.println("Enter First worksheet grade:");
		a1 = scanner.nextInt();
		a1 = a1 * W1;
		
		System.out.println("Enter Second worksheet grade:");
		a2 = scanner.nextInt();
		a2 = a2 * W2;

		System.out.println("Enter Third worksheet grade:");
		a3 = scanner.nextInt();
		a3 = a3 * W3;

		System.out.println("Enter Fourth worksheet grade:");
		a4 = scanner.nextInt();
		a4 = a4 * W4;

		System.out.println("Enter Fifth worksheet grade:");
		a5 = scanner.nextInt();
		a5 = a5 * W5;

		System.out.println("Enter Sixth worksheet grade:");
		a6 = scanner.nextInt();
		a6 = a6 * W6;

		System.out.println("Enter First Viva grade:");
		v1 = scanner.next();
		
		System.out.println("Enter Second Viva grade:");
		v2 = scanner.next();
		
		// to calculate total marks all grades are added together
		
		totalMarks = a1 + a2 + a3 + a4 + a5 + a6;

		
		if (v1.equalsIgnoreCase("A") || v2.equalsIgnoreCase("A")) {
			maxV = "A";
		} else if (v1.equalsIgnoreCase("B") || v2.equalsIgnoreCase("B")) {
			maxV = "B";
		} else if (v1.equalsIgnoreCase("C") || v2.equalsIgnoreCase("C")) {
			maxV = "C";
		} else if (v1.equalsIgnoreCase("D") || v2.equalsIgnoreCase("D")) {
			maxV = "D";
		} else if (v1.equalsIgnoreCase("F") || v2.equalsIgnoreCase("F")) {
			maxV = "F";
		}
		
		//70+       &&  v1||v2 = A		    			    = A
		//69 - 60   &&  v1||v2 = B || A 					= B
		//59 - 50   &&  v1||v2 = A || B || C 			= C
		//49 - 40   &&  v1||v2 = A || B || C || D 		= D

		
		
		
		if ((a5 >= 40*W5) && (a6 >= 40*W6)) {
			if (maxV.equals("A")) {
				checkTotalMarksA();
			} else if (maxV.equals("B")) {
				checkTotalMarksB();
			} else if (maxV.equals("C")) {
				checkTotalMarksC();
			} else if (maxV.equals("D")) {
				checkTotalMarksD();
			} else if (maxV.equals("F")) {
				finalGrade = "F";
			}
		} else {
			if (maxV.equals("A")) {
				checkTotalMarksC();
			} else if (maxV.equals("B")) {
				checkTotalMarksC();
			} else if (maxV.equals("C")) {
				checkTotalMarksC();
			} else if (maxV.equals("D")) {
				checkTotalMarksD();
			} else if (maxV.equals("F")) {
				finalGrade = "F";
			}	
		}
		
		// System will output result in this structure
		
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Viva Grade: " + maxV);
		System.out.println("Final Grade: " + finalGrade);
	}
	
	// Will assign grade if total is fallen in the score category
	
	public static void checkTotalMarksA() {
		if (totalMarks >= 70) {
			finalGrade = "A";
		} else if (totalMarks > 59 && totalMarks < 70) {
			finalGrade = "B";
		} else if (totalMarks > 49 && totalMarks < 60) {
			finalGrade = "C";
		} else if (totalMarks > 39 && totalMarks < 50) {
			finalGrade = "D";
		} else {
			finalGrade = "F";
		}
	}
	public static void checkTotalMarksB() {
		if (totalMarks >= 60) {
			finalGrade = "B";
		} else if (totalMarks > 49 && totalMarks < 60) {
			finalGrade = "C";
		} else if (totalMarks > 39 && totalMarks < 50) {
			finalGrade = "D";
		} else {
			finalGrade = "F";
		}
	}
	public static void checkTotalMarksC() {
		if (totalMarks >= 50) {
			finalGrade = "C";
		} else if (totalMarks > 39 && totalMarks < 50) {
			finalGrade = "D";
		} else {
			finalGrade = "F";
		}
	}
	public static void checkTotalMarksD() {
		if (totalMarks >= 40) {
			finalGrade = "D";
		} else {
			finalGrade = "F";
		}
	}
}
