import java.util.Scanner;

public class BaiTap4 {
	static final byte MIN = -50;
	static final byte MAX = 50;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		inPhanTuCoGiaTriXaNhat(a);
		

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
	public static void inPhanTuCoGiaTriXaNhat (int a[]) {
		System.out.println("Vui lòng nhập giá trị x");
		int x = Integer.parseInt(scan.nextLine());
		int b[] = new int [a.length];
		//viết vảo Mảng B chứa khoản cách của số x tới phần tử a[i]
		for (int i = 0; i < b.length; i++) {
			b[i] = Math.abs(a[i] - x);
		}
		//Tìm ra khoản cách lớn thật sự
		int maxLen = b[0];
		for (int i = 1; i < b.length; i++) {
			if(b[i] > maxLen) {
				maxLen = b[i];
			}
		}
		
		System.out.println("Số có giá trị xa " + x +" nhất trong mảng là: ");
		for (int i = 0; i < b.length; i++) {
			if (b[i] == maxLen) {
				System.out.print(a[i] + " vị trí a[" + i + "]" + "\t");
			}
		}
		
	}
}
