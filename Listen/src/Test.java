import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Liste liste = new Liste(8);
		liste.add(0);
		liste.add(0);
		liste.add(8);
		liste.add(2);
		liste.add(1);
		liste.add(5);
		System.out.println("Liste: "+liste);
		
		
		
	}	
}
		
		
		/*
		Liste liste = new Liste(8);
		liste.add(0);
		liste.add(0);
		liste.add(8);
		liste.add(2);
		liste.add(1);
		liste.add(5);
		liste.remove(2);
		liste.addhead(187);	
		System.out.println("Liste: "+liste);
		System.out.println("Counter: "+liste.counter());
		liste.firstlast();
		System.out.println("Gesuchtes Element: "+liste.find(6));
	
		
		
	    Random rand = new Random();
	    int[] array = new int[10];
	    int[] array2 = new int[10];
	    int[] array3= new int[10];
	    int[] array4 = new int[10];


	    for (int i = 0; i < array.length; i++) {
	      array[i] = rand.nextInt(9);
	    }
	    array2=array;
	    array3=array;
	    array4=array;

	    System.out.println("Before:");
	    MergeSort.printArray(array);

	    MergeSort.mergeSort(array); 

	    System.out.println("\nAfter:");
	    MergeSort.printArray(array);
	
	    System.out.println();
		QuickSort q= new QuickSort();
		int[] zuSortieren= {7,2,4,8,6,1,3,5,9,3 ,3 };
		System.out.println(Arrays.toString(array2));
		q.quicksort(array2,0,9);
		System.out.println(Arrays.toString(array2));
		
	*/	
	
	
