public class main {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] arr = {};
		int max =10;
		int min =1;
		boolean flag =false;

		for(int i = 0; i<2; i++) {
			arr[i]= rand.nextInt((max - min) + 1) + min;
		}

		for(int item : arr) {
			System.out.print(item+" ");
		}
	}

}
