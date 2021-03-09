import static java.lang.System.*;
public class Primes
{
	public static void main(String[] args) 
	{
		for (int i=2; i<100; i++) {//перебор чисел от 2 до 100
			if(isPrime(i)){

				out.println(i);
			}
		}
	}
	public static boolean isPrime(int n)//Проверка является ли число простым
	{
		for (int i=2; i<n; i++) 
		{
			if ((n%i) == 0) {
				return false;// Если число является составным ты выполняется false
			}
		}
		return true;//Если число n не делится ни на одно число меньше n и больше 1 то число является простым и выполняется true
	}
}