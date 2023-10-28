import java.util.Scanner;

public class BaiTap2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập N");
		int n = nhapN();
		System.out.println("Kết quả là " + tinhTongCanBat2(n));
	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <1);
		return n;
	}
	public static double tinhTongCanBat2(int n) {
		if (n==1) {
			return 1;
		} else {
			return Math.sqrt(n + tinhTongCanBat2(n-1)) ;
		}
	}
}
