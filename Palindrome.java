import static java.lang.System.*;

public class Palindrome{
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++) {
			String s=args[i];
			out.print(s+" ");
			if(isPalindrome(s))
				out.println("is a Palindrome");
			else
				out.println("is not a Palindrome");
		}
	}
	public static String reverseString(String s)//изменение последовательности символов в слове
	{
		String revstr="";
		for (int i=s.length(); i>0; i--) {
			revstr+=s.charAt(i-1);
		}
		return revstr;//Возврат слова в обратном порядке
	}
	public static boolean isPalindrome(String s)// Проверка слова на палиндромность
	{
		String rev=reverseString(s);
		return s.equals(rev);
	}
}