import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Liste liste = new Liste(8);
		liste.add(0);
		liste.add(0);
		liste.add(8);
		liste.add(2);
		liste.add(1);
		liste.add(5);
		System.out.println("Liste: "+liste);
		
		System.out.println();
		
		Stack stack = new Stack(4);
		stack.push(4);
		stack.push(1);
		stack.push(2);
		stack.push(7);
		System.out.println("Stack: "+stack);
		System.out.println("Länge: "+stack.getGroesse());
		stack.top();
		
		System.out.println();
		
		Queue queue = new Queue(4);
		queue.enqueue(7);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(18);
		System.out.println("Queue: "+queue);
		System.out.println("Länge: "+queue.getGroesse());
		queue.front();
		
		System.out.println();
	
		
		ArrayStack arraystack = new ArrayStack();
		System.out.print("Array: ");
		arraystack.push(1);
		arraystack.push(8);
		arraystack.push(7);
		System.out.println();
		System.out.print("Kopie: ");
		arraystack.copy();
		
		System.out.println();
		System.out.println();
		
		ArrayQueue arrayqueue = new ArrayQueue();
		System.out.print("Queue: ");
		arrayqueue.enqueue(1);
		arrayqueue.enqueue(8);
		arrayqueue.enqueue(7);
		arrayqueue.enqueue(187);
		arrayqueue.ausgabe();
		
	/*	System.out.print("Neue Queue: ");
		arrayqueue.dequeue();
		arrayqueue.dequeue();
		arrayqueue.ausgabe();
	*/	
		
		ArrayQueue con = new ArrayQueue();
		System.out.print("Zusammengefügt: ");
		arrayqueue.enqueue(1);
		arrayqueue.enqueue(1);
		arrayqueue.enqueue(0);
		arrayqueue.concet(con);
		arrayqueue.ausgabe();
		
		System.out.println(arrayqueue.equals(1));
	//	System.out.println("ArrayStack: "+arraystack);
		
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
	
	
