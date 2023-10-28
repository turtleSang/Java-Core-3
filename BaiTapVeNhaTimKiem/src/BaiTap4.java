import java.util.Scanner;

public class BaiTap4 {
	static final byte MIN = -50;
	static final byte MAX = 50;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		inSoNguyenToCuoi(a);

	}
	//Nhập chiều dài mảng
	public static int nhapChieuDaiMang() {
		int chieuDaiMang;
		do {
			System.out.println("Vui lòng nhập chiều dài n của mảng (n > 0)");
			chieuDaiMang = Integer.parseInt(scan.nextLine());
		} while (chieuDaiMang <= 0);

		return chieuDaiMang;
	}

	// Xuất Mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng có các giá trị");
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println();
	}

	// Tạo Mảng
	public static int[] taoMang() {
		int a[] = new int[nhapChieuDaiMang()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN)) + 1);
		}
		return a;
	}
	//Kiểm tra số nguyên tố
	public static boolean checkNguyenTo(int pt) {
		if (pt <= 1) {
			return false;
		}		
		for (int i = 2; i <= pt/2; i++) {
			if (pt%i == 0) {
				return false;
			}
		}
		return true;
	}
	//Kiểm tra mảng có số nguyên tố không
	public static boolean checkMang(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (checkNguyenTo(a[i])) {
				return true;
			}
		}
		return false;
	}
	//In ra số nguyên tố cuối
	public static void inSoNguyenToCuoi(int a[]) {
		if (checkMang(a)) {
			for (int i = a.length - 1; i >= 0; i--) {
				if (checkNguyenTo(a[i])) {
					System.out.println("Số Nguyên tố cuối của mảng là " + a[i] + " tại vị trí thứ " + i);
					break;
				}
			}
		} else {
			System.out.println("Mảng không có số Nguyên tố");
		}
		
	}
	
}
