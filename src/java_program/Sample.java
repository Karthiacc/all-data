package java_program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {

		/**
		 * @sum of even number
		 */
		// int count=0;
		// for (int i = 0; i < 100; i++) {
		// if (i%2==0) {
		// count=count+i;
		// }
		// }
		// System.out.println(count);

		/**
		 * @sum of odd number
		 */

		// int count=0;
		// for (int i = 0; i <100; i++) {
		// if (i%2==1) {
		// count=count+i;
		// }
		// }
		// System.out.println(count);

		/**
		 * @reverse string
		 */
		// String original,reverse="";
		// Scanner s=new Scanner(System.in);
		// System.out.println("string reverse is");
		// original = s.nextLine();
		// int length = original.length();
		// for (int i = length-1; i>=0; i--) {
		// reverse=reverse+original.charAt(i);
		// }
		// System.out.println("reverse string is"+" "+reverse);

		/**
		 * factorial
		 */
		// int count=1;
		// for (int i = 1; i <=8; i++) {
		// count=count*i;
		// }
		// System.out.println(count);

		/**
		 * fibonacci
		 */

		// int a=0;
		// int b=1;
		// System.out.println(a);
		// System.out.println(b);
		// for (int i = 0; i <=10; i++) {
		// int c=b+a;
		// a=b;
		// b=c;
		// System.out.println(c);
		// }

		/**
		 * reverse the number
		 */

		// Scanner s=new Scanner(System.in);
		// System.out.println("enter the number");
		// int int1 = s.nextInt();
		//
		// int a,i=0,j=0;
		//
		// a=int1;
		//
		// while (a>0) {
		// i=a%10;
		// j=(j*10)+i;
		// a=a/10;
		// }
		// System.out.println("reverse number is"+" "+j);

		/**
		 * @String occurrence
		 */
		String s = "java is my first programming language and selenium is my first web based application";
		Map<String, Integer> mp = new LinkedHashMap<>();
		String[] split = s.split(" ");

		for (String st : split) {
			if (mp.containsKey(st)) {
				Integer count = mp.get(st);
				mp.put(st, count + 1);
			} else {
				mp.put(st, 1);
			}
		}
		System.out.println(mp);

	
	/**
	 * @ Repeated string
	 */
//	String s="greenssgr";
//	String rep="";
//	
//	for (int i = 0; i < s.length(); i++) {
//		char charAt = s.charAt(i);
//		String check = String.valueOf(charAt);
//		if (!rep.contains(check)) {
//			rep=rep+check;
//		}
//	}
//	System.out.println(rep);
	
	/**
	 * ascii table
	 */
	
//		String s="Java Is a Programming Language If Your Are Interested Ping Me @986532 #chennai-115";
//		
//		int uppercount=0;
//		int lowercount=0;
//		int numbercount=0;
//		int spcount=0;
//	
//	for (int i = 0; i <s.length(); i++) {
//		char ca = s.charAt(i);
//		
//		if (ca>='a'&& ca<='z') {
//			lowercount++;
//		}else if (ca>='A'&& ca<='Z') {
//			uppercount++;
//		}else if (ca>='0'&&ca<='9') {
//			numbercount++;
//		}else {
//			spcount++;
//		}
//	}
//	System.out.println("lowercount is"+lowercount);
//	System.out.println("uppercount is"+uppercount);
//	System.out.println("number count is"+numbercount);
//	System.out.println("specialcount is"+spcount);
	
	
	}
}
