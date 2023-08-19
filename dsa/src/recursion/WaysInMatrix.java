package recursion;

public class WaysInMatrix {

	public static int count(int n, int m) {
		if (n == 1 || m == 1)
			return 1;
		else
			return count(n - 1, m) + count(n, m - 1);
	}

	public static void main(String[] args) {
		int n = 4;
		int m = 3;
		System.out.println(count(n, m));

	}

}
