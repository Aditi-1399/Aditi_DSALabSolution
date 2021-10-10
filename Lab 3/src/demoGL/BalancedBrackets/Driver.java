package demoGL.BalancedBrackets;

import java.util.Scanner;
import java.util.Stack;

public class Driver {

	static boolean checkBalance(String bracket) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0 ; i < bracket.length() ; i++) {
			char ch = bracket.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				s.push(ch);
			else {
				if (s.empty())
					return false;
				else {
					char comparech = s.pop();
					switch (ch) {
					case ')' :
					{
						if (comparech == '(')
							break;
						else
							return false;
					}	

					case ']' :
					{
						if (comparech == '[')
							break;
						else
							return false;
					}

					case '}' :
					{
						if (comparech == '{')
							break;
						else
							return false;
					}

					}
				}
			}
		}
		boolean checkStack = s.isEmpty();
		if (checkStack == false)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string of brackets ");
		String bracket = scan.next();
		int num = bracket.length();
		if (num%2 != 0)
			System.out.println("The entered Strings do not contain Balanced Brackets");
		else {
			boolean result = checkBalance(bracket);
			if (result == true)
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
