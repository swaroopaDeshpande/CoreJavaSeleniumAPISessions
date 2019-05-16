package JavaPrograms;

public class FactorialNum {

	public static int facto(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static void main(String[] args) {

		int fact = facto(10);
		System.out.println(fact);

	}

}
