import java.util.Scanner;

public class BaiTap6 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập cơ số: ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập số Mũ");
		int n = nhapN();
		System.out.println("Tổng các số từ " + x +"^1 đến "+x+"^"+n+" là " + tinhTongXMuN(x, n));

	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <1);
		return n;
	}
	//Tính x mũ N
	public static long tinhXmuN(int x, int n) {
		if (n == 0) {
			return 1; 
		} else {
			return x*tinhXmuN(x, n-1);
		}
	}
	//Tính tổng x^n
	public static long tinhTongXMuN(int x, int n) {
		if (n == 1) {
			return x;
		}else {
			return tinhXmuN(x, n)+tinhTongXMuN(x, n-1);
		}
	}
}
