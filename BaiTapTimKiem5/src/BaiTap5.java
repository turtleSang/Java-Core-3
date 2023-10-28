import java.util.Scanner;

public class BaiTap5 {
	static final byte MIN = -50;
	static final byte MAX = 50;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		timDoan(a);

	}
	//Nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập số có giá trị > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n<=0);
		return n;
	}
	//Tạo mảng
	public static int[] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int)(Math.random()*(MAX-MIN + 1));
		}
		return a;
	}
	//Xuất mảng
	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Tìm đoạn
	public static void timDoan(int a[]) {
		int indexMax = 0;
		int indexMin = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i]>a[indexMax]) {
				indexMax = i;
			} 
			if (a[i] < a[indexMin]) {
				indexMin = i;
			} 
		}
		System.out.println("Đoạn chứa toàn bộ giá trị là đoạn:[ " + a[indexMin] + " ; " + a [indexMax] + "]");
	}
}
