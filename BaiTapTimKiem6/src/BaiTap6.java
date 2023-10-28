import java.util.Scanner;

public class BaiTap6 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		demPhanTuX(a);
		

	}
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
		System.out.println("Mảng ngẫu nhiên có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Nhập Mảng
	public static int[] nhapMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i +"]= ");;
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void demPhanTuX(int a[]) {
		System.out.println("Vui lòng nhập phần tử muốn đếm trong mảng");
		int ptDem = Integer.parseInt(scan.nextLine());
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ptDem) {
				dem++;
			}
			
		}
		if (dem==0) {
			System.out.println("Trong mảng không có số: " + ptDem);
		} else {
			System.out.println("Trong mảng có " + dem + " phần tử có giá trị " + ptDem);
		}
		
	}
	
}
