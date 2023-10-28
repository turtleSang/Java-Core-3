import java.util.Scanner;

public class BaiTap5 {
	static final byte MIN = -50;
	static final byte MAX = 50;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		timCacViTriGan(a);

	}

	// Nhập chiều dài mảng
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
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// Nhập mảng
	public static int[] nhapMang() {
		int a[] = new int[nhapChieuDaiMang()];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	//Tìm các số gần x nhất
	public static void timCacViTriGan(int a[]) {
		//Tạo mảng chứa khoản cách
		System.out.println("Vui lòng nhập vào giá trị X để tìm các số gần X");
		int x = Integer.parseInt(scan.nextLine());
		int mangKhoangCach[] = new int[a.length];
		for (int i = 0; i < mangKhoangCach.length; i++) {
			mangKhoangCach[i] = Math.abs(a[i] - x);
		}
		//Tìm khoản cách min
		int minKhoangCach = mangKhoangCach[0];
		for (int i = 1; i < mangKhoangCach.length; i++) {
			if (mangKhoangCach[i] < minKhoangCach ) {
				minKhoangCach = mangKhoangCach[i];
			}
		}
		//In ra các giá trị có khoản cách nhỏ nhất
		System.out.println("Các giá trị gần " + x + " nhất là: " );
		for (int i = 0; i < a.length; i++) {
			if (mangKhoangCach[i] == minKhoangCach) {
				System.out.print(a[i] + "\t");
			}
		}
	}
}
