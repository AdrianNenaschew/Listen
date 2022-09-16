public class SelectionSort {
	static int[] array = { 4, 7, 3, 4, 9, 7, 1, 2 };

/*	public static void main(String[] args) {
		ausgabe(array);
		ausgabe(Sort(array));
	}
*/
	
	public static int[] Sort(int array[]) {
		int[] sort = array;
		int number = 0;
		int temp = 0;
		for (int i = 0; i < sort.length - 1; i++) {
			number = sort[i];
			for (int j = i; j < sort.length - 1; j++) {
				if (number > sort[j + 1]) {
					temp = sort[j + 1];
					sort[j + 1] = number;
					number = temp;
				}
			}
			sort[i] = number;		
		}
		return sort;
	}

	
	public static void ausgabe(int[] array) {
		System.out.println("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}