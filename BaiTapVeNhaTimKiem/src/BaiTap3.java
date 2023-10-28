import java.util.Scanner;

public class BaiTap3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		inSoDuong(a);
	}

	// Nhap Chieu dai mang
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài n của mảng (n > 0)");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);

		return n;
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
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	//Kiểm tra trong Mảng có số dương không
	public static int timIndexDuong(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				return i;
			}
		}
		return -1;
	}
	//Tìm và in số dương nhỏ nhất
	public static void inSoDuong(int a[]) {
		int indexMin = timIndexDuong(a);
		if (indexMin == -1) {
			System.out.println("Trong mảng không có số Dương");
		}else {
			for (int i = indexMin; i < a.length; i++) {
				if (a[i] < a[indexMin] && a[i]>0 ) {
					indexMin = i;
				}
			}
			System.out.print("Số dương nhỏ nhât là: " + a[indexMin]+ " tại vị trí: ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[indexMin]) {
					System.out.print(i + ", ");
				}
			}
		}
	}
}
