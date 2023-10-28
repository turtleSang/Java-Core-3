import java.util.Scanner;

public class BaiTap7 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập N");
		int n = nhapN();
		System.out.println("Tổng biếu thức là: " + tinhTongBieuThuc(n));

	}

	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	// Hàm tính tổng mẫu số từ 1 + 2 + 3 đến N
	public static int tinhTongMauSo(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + tinhTongMauSo(n-1);
		}
	}
	//Tính tổng biếu thức
	public static float tinhTongBieuThuc(int n) {
		if (n == 1) {
			return 1;
		}else {
			return 1/(tinhTongMauSo(n)*1.0f) + tinhTongBieuThuc(n-1);
		}
	} 
}
