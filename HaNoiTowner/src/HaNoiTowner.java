import java.util.Scanner;

public class HaNoiTowner {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập vào số đĩa muốn chuyển");
		int n = Integer.parseInt(scan.nextLine());
		thapHaNoi(n, 'A', 'B', 'C');
	}
	public static void chuyen(int n, char X, char Y) {
		System.out.println("Chuyển "+ n + " từ " + X + " sang " + Y);
	}
	public static void thapHaNoi(int n, char X, char Z, char Y) {
		if (n == 1) {
			chuyen(n, X, Y);
		} else {
			thapHaNoi(n - 1, X, Y, Z);
			chuyen(n, X, Y);
			thapHaNoi(n-1, Z, X, Y);
		}
	}
}
