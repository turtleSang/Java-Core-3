import java.util.Scanner;

public class BaiTap2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		int indexChan = timViTriSoChanDauTien(a);
		if (indexChan == -1) {
			System.out.println("Trong mảng không có số chẵn");
		} else {
			System.out.println("Số chẵn đầu tiên nằm ở vị trí: " + indexChan);
		}

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
	public static int timViTriSoChanDauTien(int a[]) {
		int indexChan = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				indexChan = i;
				break;
			}
		}
		return indexChan;
	}
}
