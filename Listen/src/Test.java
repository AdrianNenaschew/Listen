import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws Exception {
		PQueue pqueue = new PQueue();
		pqueue.insert(new Notruf(1, "Fahrrad Bumm", 9,30,0,1));
		pqueue.insert(new Notruf(2, "Auto Bumm", 9,32,0,2));
		pqueue.insert(new Notruf(3, "Junge tot", 9,34,0,2));
		pqueue.insert(new Notruf(4, "Flugzeug weg", 9,36,0,3));
		pqueue.insert(new Notruf(5, "Ohr gebrochen", 9,38,0,1));
		pqueue.insert(new Notruf(6, "Hamster �berfahren", 9,40,0,2));
		pqueue.insert(new Notruf(7, "Im Klo ausgesperrt", 9,42,0,2));
		pqueue.insert(new Notruf(8, "Schultoilette angez�ndet", 9,44,0,3));
		
		pqueue.output();
		System.out.println("Wichtigester Notruf: " + pqueue.max());

		
		
}

}	
		/*
		  
		  
		  
		  
		  		
		BuildTree tree = new BuildTree();
		tree.root = new Element(42);
		tree.root.insert(9);
		tree.root.insert(8);
		tree.root.insert(14);
		tree.root.insert(90);
		tree.root.insert(122);
		tree.root.insert(569);
		tree.root.insert(98);
		
		System.out.println("Depth of tree: "+tree.root.depth(1));
	
		System.out.println();
		System.out.print("PreOrder: ");
		tree.root.preOrder();
		System.out.println();
		System.out.print("InOrder: ");
		tree.root.inOrder();
		System.out.println();
		System.out.print("PostOrder: ");
		tree.root.postOrder();
		System.out.println();
		System.out.println();
		System.out.println("Counter: " + tree.root.counter());
		
		
		
		
		
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
		System.out.println("L�nge: "+stack.getGroesse());
		stack.top();
		
		System.out.println();
		
		Queue queue = new Queue(4);
		queue.enqueue(7);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(18);
		System.out.println("Queue: "+queue);
		System.out.println("L�nge: "+queue.getGroesse());
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
		
		System.out.print("Neue Queue: ");
		arrayqueue.dequeue();
		arrayqueue.dequeue();
		arrayqueue.ausgabe();
		
		
		ArrayQueue con = new ArrayQueue();
		System.out.print("Zusammengef�gt: ");
		arrayqueue.enqueue(1);
		arrayqueue.enqueue(1);
		arrayqueue.enqueue(0);
		arrayqueue.concet(con);
		arrayqueue.ausgabe();
		
		System.out.println(arrayqueue.equal(8));
		
		
		System.out.println();
		
		
		
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
	
	
