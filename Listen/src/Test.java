import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
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
	
		*/
		QuickSort q= new QuickSort();
		int[] zuSortieren= {7,2,4,8,6,1,3,5,9,3 ,3 };
		System.out.println(Arrays.toString(zuSortieren));
		q.quicksort(zuSortieren,0,10);
		System.out.println(Arrays.toString(zuSortieren));
	}
	
}