package practice;

import java.util.Scanner;

public abstract class Sample {

	public static void main(String[] args) {
		/**
		 * @literal
		 */
		// String s="string";
		// String s1="string";
		// System.out.println(System.identityHashCode(s));
		// System.out.println(System.identityHashCode(s1));
		/**
		 * @non literal
		 */
		// String s=new String("welcome");
		// String s1=new String("welcome");
		//
		// System.out.println(System.identityHashCode(s));
		// System.out.println(System.identityHashCode(s1));

		/**
		 * @immutable
		 */
//		String s9 = "string";
//		String s10 = "maven";
//		String concat = s9.concat(s10);
//		System.out.println(System.identityHashCode(concat));
//		System.out.println(System.identityHashCode(s9));
//		System.out.println(System.identityHashCode(s10));
//		/**
//		 * @mutable
//		 */
//
//		StringBuilder s = new StringBuilder("java");
//		StringBuilder s1 = new StringBuilder("maven");
//		StringBuffer s2 = new StringBuffer("java");
//
//		StringBuffer append = s2.append(s);
//
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(append));

String original,reverse="";
Scanner s=new Scanner(System.in);
System.out.println("enter the string reverse is");
	 original = s.nextLine();
	
	 int length = original.length();
	 
	 for (int i = length-1; i>=0; i--) {
		reverse=reverse+original.charAt(i);
	}
	System.out.println("reverse string is"+" "+reverse);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
