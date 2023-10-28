import java.util.Scanner;

public class DeQuy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập N");
		int n = Integer.parseInt(scan.nextLine());
		int tong = deQuy(n);
		System.out.println("Tổng = " + tong);

	}
	public static int deQuy(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n+deQuy(n -1);
		}
	}
}
