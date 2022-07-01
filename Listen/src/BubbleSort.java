
public class BubbleSort {
	static int[] array = { 4, 7, 3, 4, 9, 7, 1, 2 };
	
	
	public static void main(String[] args) {
		ausgabe(array);
		ausgabe(Sort(array));
	}
	
	public static int[] Sort(int array[]) {
		int[] sort = array;
		int temp = 0;
		
		for (int i = array.length-1; i>0 ; i--) {
			for (int j = 0; j<i ; j++) {
				if(sort[j] > sort [j+1]) {
					temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
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

