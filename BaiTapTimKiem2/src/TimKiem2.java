import java.util.Scanner;

public class TimKiem2 {
	static final byte MIN = -50;
	static final byte MAX = 0;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		lietKeSoAmNhoNhat(a);

	}

	// Xuất Mảng
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

	public static int[] nhapMang() {
		int n = nhapN();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void lietKeSoAmNhoNhat(int a[]) {
		int indexMin = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i]< 0) {
				indexMin = i;
				break;
			}
		}
		if (indexMin == -1) {
			System.out.println("Mảng không có số âm");
		} else {
			//Tìm phần tử âm thật sự
			for (int i = indexMin +1; i < a.length; i++) {
				if (a[i] < indexMin && a[i] < 0) {
					indexMin = i;
				}
			}
			System.out.println("Phần tử âm nhỏ nhất là " + a[indexMin]);
			System.out.print("Vị trí có phần tử âm nhỏ nhất là: ");
			//Xuất ra các phần tử có  min
			for (int i = 0; i < a.length; i++) {
				if (a[i] ==  a[indexMin]) {
					System.out.print("["+i+"]"+"\t");
				}
			}
		}
	}
}
