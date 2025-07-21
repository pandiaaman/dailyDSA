package dsa_java.leetcode.easy;

public class A001_RomanToInteger_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(romanToInt("MCMXCIV"));
		
		System.out.println(romanToInt("MDLXX"));

	}
	
	/*
	 * Solution copied from Leetcode.
	 */
	public static int romanToInt(String s) {
       
		int tot = 0, num = 0;
		
		//below we are going reverse
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.println(s.charAt(i));
			
			switch(s.charAt(i)) {
               case 'I': num = 1; break;
               case 'V': num = 5; break;
               case 'X': num = 10; break;
               case 'L': num = 50; break;
               case 'C': num = 100; break;
               case 'D': num = 500; break;
               case 'M': num = 1000; break;
			}
			if (4 * num < tot) tot -= num;
           	else tot += num;
		}
		return tot;
   }
}
