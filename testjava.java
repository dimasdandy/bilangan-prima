package testmandiri;

public class testjava {

	public static void main(String args[]) throws Exception {
		int input = 10;
		for (int i = 2; i <= input; i++) {
			boolean check = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check == true) {
				System.out.println("hasil = " + i);
			}
		}
	}
}
