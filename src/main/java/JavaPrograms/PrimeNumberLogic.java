package JavaPrograms;

public class PrimeNumberLogic {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getPrimeNumbers(int range) {
		for (int i = 2; i <= range; i++) {
			if (isPrimeNumber(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(5));
		System.out.println(isPrimeNumber(10));
		System.out.println(isPrimeNumber(0));
		System.out.println(isPrimeNumber(-3));
		getPrimeNumbers(20);
		getPrimeNumbers(10);

	}

}
