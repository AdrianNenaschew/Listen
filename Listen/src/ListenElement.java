public class ListenElement {

	private int inhalt;
	private ListenElement next;

	public ListenElement(int inhalt) {
		this.inhalt = inhalt;
	}

	public void add(ListenElement neu) {
		if (next == null) {
			next = neu;
		} else {
			next.add(neu);
		}
	}

	public int getInhalt() {
		return inhalt;
	}

	public void firstlast() {
		if (next == null) {
			System.out.println("Letztes Element: " + inhalt);
		} else {
			next.firstlast();
		}
	}

	public String toString() {
		if (next == null) {
			return "" + inhalt;
		} else {
			return "" + inhalt + " " + next.toString();
		}
	}

	public int count() {
		if (next == null) {
			return 1;
		} else {
			return 1 + next.count();
		}

	}

	public int addition() {
		if (next == null) {
			return inhalt;
		} else {
			return inhalt + next.addition();

		}

	}

	public int find(int wert) {
		if (inhalt==wert) {
			return inhalt;
		}else {
			if (next==null) {
				return -1;
			}else {
			return	next.find(wert);
			}
		}
	
	}
	
	
	public ListenElement getNext() {
		return next;
	}
	
	public void remove(int wert) {
		if (next != null) {
		if(next.getInhalt()==wert) {
			if(next.getNext()!=null) {
			next=next.getNext();
		}else {
			next=null;
		}
		}
		else{ 
			if(next!=null) {
				next.remove(wert);
			}
	}
	}
}
}