import java.util.Scanner;

public class TimKiem3 {
	static final byte MIN = -50;
	static final byte MAX = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		timSoChanCuoiCung(a);

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
		System.out.println("Mảng ngẫu nhiên có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// Tạo Mảng
	public static int[] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN)) + 1);
		}
		return a;
	}
	//Tìm số chẵn cuối cùng của mảng
	public static void timSoChanCuoiCung(int a[]) {
		int indexChan = -1;
		for (int i = a.length-1; i >= 0 ; i--) {
			if (a[i]% 2 == 0 ) {
				indexChan = i;
				break;
			}
		}
		if (indexChan == -1) {
			System.out.println("Mảng không có phần tử chẵn");
		} else {
			System.out.println("Phần tử chẵn cuối cùng của mảng là " + a[indexChan] + " tại vị trí [" + indexChan + "]");
		}
	}
}
