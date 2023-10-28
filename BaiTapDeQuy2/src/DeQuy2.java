import java.util.Scanner;

public class DeQuy2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập N");
		long n = Integer.parseInt(scan.nextLine());
		System.out.println("Tổng là: " +tinhTong(n));
	}

	public static long tinhGiaiThua(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n * tinhGiaiThua(n-1);
		}
	}

	public static long tinhTong(long n) {
		if (n == 1) {
			return 1;
		} else {
			return tinhGiaiThua(n)+tinhTong(n-1);
		}
	}

}
