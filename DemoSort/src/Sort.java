
public class Sort {

	public static void main(String[] args) {
		int a[] = { 6, 5, 3, 2, 9, 1, 6, 7 };
		a = bubbleSort(a);
		xuatMang(a);

	}

	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static int[] bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int tam = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tam;
				}
			}
		}

		return a;
	}

	// Selection Sort
	public static int timViTriMin(int a[], int viTri) {
		int viTriMin = viTri;
		for (int i = viTri + 1; i < a.length; i++) {
			if (a[i] < a[viTriMin]) {
				viTriMin = i;
			}
		}
		return viTriMin;
	}

	public static int[] selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int viTriMin = timViTriMin(a, i);
			int temp = a[i];
			a[i] = a[viTriMin];
			a[viTriMin] = temp;
		}
		return a;
	}

	// Insert sort
	public static int[] insertSort(int a[]) {
		int x;
		int pos;
		for (int i = 1; i < a.length; i++) {
			x = a[i];
			pos = i - 1;
			while (pos >= 0 && x < a[pos]) {
				a[pos + 1] = a[pos];
				pos--;
			}
			a[pos + 1] = x;
		}
		return a;
	}

	// quick sort
	public static int[] quickSort(int a[], int left, int right) {
		int mid = (left + right)/2;
		int i = left;
		int j = right;
		do {
			while(a[i]< a[mid]) {
				i++;
			}
			while (a[j]>a[mid]) {
				j--;
			}
			if (i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		} while (i<j);
		if (left < j) {
			quickSort(a, left, j);
		}
		if (right > i) {
			quickSort(a, i, right);
		}
		
		return a;
	}
}