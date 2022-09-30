import java.util.ArrayList;

public class PQueue {
		ArrayList<Notruf> pqueue;
		
	public PQueue() {
		pqueue = new ArrayList<Notruf>();
	}
	
	public void insert(Notruf notruf) {
		pqueue.add(notruf);
	}
	
    public void output() {
        int i=0;
        while(i<8) {
            System.out.println("Number:" +pqueue.get(i).nummer +"  Uhrzeit:"+pqueue.get(i).stunde+":"+pqueue.get(i).minute+":"+pqueue.get(i).sekunde+"  Prio:"+pqueue.get(i).prio+"  Beschreibung:"+ pqueue.get(i).beschreibung );
            i++;
        }
    }
    
    public boolean empty() {
    	return pqueue.isEmpty();
    }
    
    public int max() {
    	int i=0;
    	int dummyprio=1;
    	while(!empty()) {
    		if(pqueue.get(i).prio==dummyprio) {
    			return pqueue.get(i).prio;
    		}
    	}
    	return 0;
    }
}