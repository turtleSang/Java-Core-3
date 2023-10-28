import java.util.Scanner;

public class BaiTap8 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập số muốn đếm vào ");
		int n = nhapN();		
		System.out.println("Số " + n + " có " + demChuSo(n) + " chữ số");
	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n <1);
		return n;
	}
	public static int demChuSo(int n) {
		if (n<10) {
			return 1;
		} else {
			return 1+ demChuSo(n/10);
		}
	}
}
