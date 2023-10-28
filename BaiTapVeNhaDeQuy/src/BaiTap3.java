import java.util.Scanner;

public class BaiTap3 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập N");
		int n = nhapN();
		System.out.println("Kết quả là: " +tinhTong(n));
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
			return 1;
		} else {
			return 1/(n*1.0f) + tinhTong(n-1);
		}
	}
}
