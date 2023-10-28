import java.util.Scanner;

public class BaiTap5 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập N");
		int n = nhapN();
		System.out.println("Kết quả là " + tinhTong(n));

	}

	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 2");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2);
		return n;
	}

	public static float tinhTong(int n) {
		if (n == 2) {
			return 0.5f;
		} else {
			return 1 / (n*(n-1)*1.0f) + tinhTong(n - 1);
		}
	}
}
