import java.util.Scanner;

public class BaiTap1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập N");
		int n = nhapN();
		System.out.println("Tổng từ 1/2 +...+ " + n + "/(" + n+ "+1) là " + tinhTong(n) );
		
	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <1);
		return n;
	}
	public static float tinhTong(int n) {
		if (n == 1) {
			return 0.5f;
		} else {
			return  n/(n+1f) + tinhTong(n-1);
		}
	}
}
