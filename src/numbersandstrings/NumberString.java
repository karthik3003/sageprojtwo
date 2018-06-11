package numbersandstrings;

import java.util.Scanner;

public class NumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		System.out.println("Is the input a palindrome? " + palindrome(test));
		System.out.println("Enter array of numbers to find max and min difference");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] d = s.split(",");
		double[] nums = new double[d.length];
		for(int i=0; i<nums.length; i++) {
			nums[i] = Double.parseDouble(d[i]);
		}
		Maxmin m = new Maxmin();
		System.out.println("The difference of max and min numbers of the input is: " + m.maxmindiff(nums));
		
		System.out.println("Enter a value on which the math functions are to be applied");
		Scanner scc = new Scanner(System.in);
		double dd = scc.nextDouble();
		System.out.println("The cube root of the entered value is: "+ Math.cbrt(dd));
		System.out.println("The ceil value of the entered value is: " + Math.ceil(dd));
		System.out.println("The arc cosine of the entered value is: " + Math.acos(dd));
		System.out.println("The absolute value of the entered value is: " + Math.abs(dd));
		System.out.println("The floor value of the entered value is: " + Math.floor(dd));
		System.out.println("The unbiased exponent used in the representation of entered value is: " + Math.getExponent(dd));
		System.out.println("The natural logarithemic value of the entered value is: " + Math.log(dd));
		System.out.println("The  ex -1 value of the entered value is: " + Math.expm1(dd));
		System.out.println("The  euler number e raised to the power of a double value is: " + Math.exp(dd));
		System.out.println("The  arc tangent value of the entered value is: " + Math.atan(dd));
	}
	public static boolean palindrome(String input) {
		//String s = input.replaceAll("\\s","");
		String s = input.replaceAll(" ", "");
		//System.out.println(s);
		char[] inputarr = s.toCharArray();
		boolean palindrome = false;
		if (inputarr.length%2 == 0) {
			for(int i=0; i<=(inputarr.length/2)-1; i++) {
				if (inputarr[i] != inputarr[inputarr.length-i-1]) {
					return false;
				}
				else {
					palindrome = true;
				}
			}
		}
		else {
			for(int i=0; i<(inputarr.length-1/2)-1; i++) {
				if (inputarr[i] != inputarr[inputarr.length-i-1]) {
					return false;
				}
				else {
					palindrome = true;
				}
			}
		}
		return palindrome;
	}
/*	
	public double maxmindiff(double[] db) {
		String[] db = input.split(",");
		double max = db[0];
		double min = db[0];
		for(int i=0; i<db.length; i++) {
			if(db[i]>=max) {
				max = db[i];
				//System.out.println(max);
			}
		}
		for(int i=0; i<db.length; i++) {
			if(db[i]<min) {
				min = db[i];
			}
		}
		return max-min;
	}
*/

}
