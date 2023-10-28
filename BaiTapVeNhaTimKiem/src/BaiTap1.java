import java.util.Scanner;

public class BaiTap1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		int indexMin = timMin(a);
		System.out.println("Phần tử nhỏ nhất có giá trị là " + a[indexMin] + " tại vị trí: " + indexMin);

	}
	//Nhap Chieu dai mang
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
			System.out.print("a["+i+"] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	//Tim phan tu nho nhat cua mang
	public static int timMin(int a[]) {
		int indexMin = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[indexMin]) {
				indexMin = i;
			}
		}
		return indexMin;
	}
}
