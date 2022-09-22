public class ArrayQueue {
	private int[] queue;
	private ArrayQueue queue2;
	private int eoq;

	public ArrayQueue() {
		queue = new int[100];
		eoq = 0;
	}

	public void enqueue(int x) {
		if (eoq < 99) {

			queue[eoq] = x;
			// System.out.print(x + " ");
			eoq++;
		}
	}

	public void dequeue() {
		for (int i = 0; i < eoq; i++) {
			queue[i] = queue[i + 1];
		}
		eoq--;
	}

	public int front() {
		if (!empty())
			return queue[0];
		else
			return -999;
	}

	public boolean empty() {
		return (eoq == 0);
	}

	public void ausgabe() {

		int dummy = 0;
		while (dummy != eoq) {

			System.out.print(queue[dummy] + " ");
			dummy++;

		}
		System.out.println(" ");

	}

	public void concet(ArrayQueue queue2) {
		this.queue2 = queue2;
		eoq++;
		while (!queue2.empty()) {
			queue[eoq] = queue2.front();
			queue2.dequeue();
			eoq++;
		}
	}

	public boolean equal(int x) {

		int tmptos = eoq - 1;
		while (tmptos > 0) {
			if (queue[tmptos] == x) {

				return true;
			} else {
				tmptos--;
			}
		}
		return false;
	}
	
	
}