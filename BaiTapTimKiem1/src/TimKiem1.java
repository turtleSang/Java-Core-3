import java.util.Scanner;

public class TimKiem1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		int viTriDuongDauTien = timPhanTuDuongDauTien(a);
		if (viTriDuongDauTien == -1) {
			System.out.println("Không có phần tử dương trong mảng");
		} else {
			System.out.println("Phần tử dương đầu tiên tại vị trí " + viTriDuongDauTien);
		}

	}
	//Nhập Chiều dài mảng
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài n của mảng (n > 0)");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);

		return n;
	}
	//Xuất Mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng ngẫu nhiên có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Tạo Mảng
	public static int[] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN)) + 1);
		}
		return a;
	}
	// Tìm vị trí dương đầu tiên
	public static int timPhanTuDuongDauTien(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0) {
				return i;
			}
		}
		return -1;
	}
}
