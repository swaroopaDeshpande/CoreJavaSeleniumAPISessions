package JavaPrograms;

public class ArmstrongNum {

	public static void isArmstrongNum(int num) {
		int r;
		int cube = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if (t == cube) {
			System.out.println("Armstrong numbr");
		} else {
			System.out.println("not armstrong");
		}
	}

	public static void main(String[] args) {
		// 153,0,1
		isArmstrongNum(153);
		isArmstrongNum(0);
		isArmstrongNum(1);
		isArmstrongNum(150);


	}

}
