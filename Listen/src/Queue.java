public class Queue {

	private ListenElement kopf;
	private ListenElement tmp;
	
	public Queue(int wert) {
		kopf = new ListenElement(wert);
	}
	
	public boolean isEmpty() {return true;}
	
	public void enqueue (int wert) {
		tmp = new ListenElement(wert);
		kopf.add(tmp);
	}
	
	public void dequeue() throws Exception {
		kopf.remove();
	}
	
	public void front() throws Exception {
		System.out.println("Kopfelement: "+kopf.getInhalt());
	}
	
	public int getGroesse() {
		return kopf.getGroesse(0);
	}
	
	public String toString(){
		return kopf.toString();
	}
}

