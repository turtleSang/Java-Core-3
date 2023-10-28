
public class Test {

	public static void main(String[] args) {
		int a[] = {3,1,2,0,-5,6};
		int b = 0;
		int c = 0;
		for (int i = 0; i < a.length;) {
			if (a[i] > a[b]) {
				b =i;
			}
			if (a[i] < c) {
				c = i;
			}
			i++;
		}
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
