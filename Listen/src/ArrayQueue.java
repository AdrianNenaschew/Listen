public class ArrayQueue
{
    private int[] queue;
    private ArrayQueue queue2;
    private int eoq;

    
    public ArrayQueue()
    {
        queue = new int[100];
        eoq = 0;
    }
    
   public void enqueue(int x)
   {
      if (eoq < 99)
      {  
       
         queue[eoq] = x;
     //    System.out.print(x + " ");
         eoq++;
      }  
   }
   
   public void dequeue()
   {
      for (int i=0; i<eoq; i++) {
    	  queue[i]=queue[i+1];
      }
      eoq--;
   }
   
   public int front()
   {
      if (!empty())
         return queue[0];
      else
         return -1;
   }
   
   public boolean empty()
   {
      return (eoq == -1); 
   }
   
   public void ausgabe() {

		int tmp = 0;
		while (tmp != eoq) {
			System.out.print(queue[tmp] + " ");
			tmp++;

		}
		System.out.println(" ");
	}
   
   public void concet(ArrayQueue queue2) {
	this.queue2=queue2;
	   eoq++;
	   while(!queue2.empty()) {
	queue[eoq]=queue2.front();
	queue2.dequeue();
	eoq++;
	   }
   }
	
   
   

}