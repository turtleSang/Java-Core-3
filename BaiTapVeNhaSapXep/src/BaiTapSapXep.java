import java.util.Scanner;

public class BaiTapSapXep {
	static final int MAX = 20;
	static final int MIN = -20;
	static Scanner scan = new Scanner(System.in);

	// Chương trình chính
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập chiều dài Mảng A");
		int a[] = taoMang(nhapN());
		System.out.println("Vui lòng nhập chiều dài Mảng B");
		int b[] = taoMang(nhapN());
		System.out.print("Mảng A");
		xuatMang(a);
		System.out.print("Mảng B");
		xuatMang(b);
		// Sắp xếp mảng
		a = sapXepMang(a);
		System.out.print("Mảng A sau sắp xếp");
		xuatMang(a);
		b = sapXepMang(b);
		System.out.print("Mảng B sau sắp xếp");
		xuatMang(b);
		// Tạo mảng trộn của 2 mảng A và B
		System.out.print("Trộng 2 mảng và sắp xếp giảm dần");
		int c[] = taoMangLon(a, b);
		xuatMang(c);
	}

	// Nhập chiều dài mảng
	public static int nhapN() {
		int n;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 1) {
				System.out.println("Vui lòng nhập chiều dài >0");
			}
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * (MAX - MIN + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println(" có các phần tử:");
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.println();
	}

	public static int[] sapXepMang(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static int[] taoMangLon(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		// gán indexMax của 2 mảng
		int indexMaxA = a.length - 1;
		int indexMaxB = b.length - 1;
		// Chạy vòng for để điền vào vị trí C
		for (int i = 0; i < c.length; i++) {
			if (indexMaxA < 0) {				//Nếu indexMaxA âm
				c[i] = b[indexMaxB];			//Gán c[i]==b[indexMaxB]
				indexMaxB--;					//Giảm indexMaxB 1 đơn vị để có được đơn vị lớn tiếp theo của mảngB
			} else if (indexMaxB < 0 ) {		//Tương tự như indexMaxB
				c[i] = a[indexMaxA];
				indexMaxA--;
			} else {								//Nếu 2 index không âm thì xét phần tử lớn nhất của 2 Mảng
				if (a[indexMaxA] > b[indexMaxB]) { //Nếu 2 a[indexMaxA] > b[indexMaxB 
					c[i] = a[indexMaxA];			//gán c[i] = a[indexMaxA]
					indexMaxA--;					//Giảm indexMinA đi 1 đơn vị
				} else {
					c[i] = b[indexMaxB];			//Còn lại thì gánc[i] = b[indexMaxB];	
					indexMaxB--;					//Giảm indexMinB đi 1 Đơn vị
				}
			}
		}
		return c;
	}
}
