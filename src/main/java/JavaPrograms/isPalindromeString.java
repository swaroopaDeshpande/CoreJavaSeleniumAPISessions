package JavaPrograms;

public class isPalindromeString {

	public static void main(String[] args) {

		String str = "madam";
		String revereseStr = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			revereseStr = revereseStr + str.charAt(i);
		}
		System.out.println(revereseStr);
		if (str.equals(revereseStr)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("not palindrome String");
		}

	}

}
