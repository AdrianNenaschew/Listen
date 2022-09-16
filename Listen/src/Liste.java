public class Liste {
	private ListenElement kopf;
	
	public Liste (int wert){
		kopf = new ListenElement(wert);
	}
	
	public void add(int wert){
		kopf.add(new ListenElement(wert));
		
	}
	public int getGroesse(){
		return kopf.getGroesse(0);
	}
	
	public String toString(){
		return kopf.toString();
	}
} 
 












/*
		private ListenElement kopf;
		private ListenElement temp;
	
	public Liste (int wert) {
		kopf=new ListenElement(wert);
	}
	public void add (int wert) {
		kopf.add(new ListenElement(wert));
	}
	public String toString() {
		return kopf.toString();
	}
	
	//Elemente zählen
	
	public int counter() {
	   return kopf.count();
	}
	
	public void addhead(int wert) {
		temp=kopf;
		kopf=new ListenElement(wert);
		kopf.add(temp);
}
	
	public void firstlast() {
		System.out.println("Erstes Element: "+kopf.getInhalt());
		kopf.firstlast();
}
	
	public int find(int wert) {
	return kopf.find(wert);
	}
	
	public void remove(int wert) {
		if(kopf.getInhalt()==wert) {
			kopf=kopf.getNext();
		}
		kopf.remove(wert);
		}
 }
	*/
