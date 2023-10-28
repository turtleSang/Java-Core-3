import java.util.Scanner;

public class DemoLinearSearch {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		// Tim Tuyet tinh
//		int i = timViTri1(a, nhapChieuDaiMang());
//		if (i == -1) {
//			System.out.println("Không tìm thấy");
//		} else {
//			System.out.println("tại vị trí " + i);
//		}
		//Tim nhi Phan
		System.out.println("Vui lòng nhập số muốn tìm kiếm");
		int x = Integer.parseInt(scan.nextLine());
				
		boolean found = checkNhiPhan(a, x);
		if (found) {
			System.out.println("Tim thay roi");
		} else {
			System.out.println("deo tim dc");
		}
		int viTri = timViTriNhiPhan(a, x);
		if (viTri == -1) {
			System.out.println("Không tìm thấy");
		} else {
			System.out.println("Tại vị trí thứ " + viTri);
		}

	}
	// hàm tìm số
	public static boolean timViTri(int a[], int x) {
		int i = 0;
		while (i < a.length) {
			i++;
		}
		if (i == a.length) {
			return false;
		} else {
			return true;
		}
	}
	//hàm in vị trí 
	public static int timViTri1(int a[], int x) {
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				return i;
			}
		}
		return -1;
	}
	// Hàm Xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng vừa nhập có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static int nhapChieuDaiMang() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài mảng > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
		return n;
	}

	public static int[] nhapMang() {
		int n = nhapChieuDaiMang();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	//Binary search
	public static boolean checkNhiPhan(int a[], int x) {
		int left = 0;
		int right = a.length -1;
		
		do {
			int mid = (right + left)/2;
			if (x == a[mid]) {
				return true;
			} else if (x < a[mid]) {
				right = mid -1;
			} else {
				left = mid + 1;
			} 
		} while (left <= right);
		return false;
	}
	public static int timViTriNhiPhan(int a[], int x) {
		int left = 0;
		int right = a.length -1;
		do {
			int mid = (right + left)/2;
			if (x == a[mid]) {
				return mid;
			} else if (x < a[mid]) {
				right = mid -1;
			} else {
				left = mid + 1;
			} 
		} while (left <= right);
		return -1;
	}
	
}
