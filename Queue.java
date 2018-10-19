//QUEUE USING ARRAY

interface Qintf {
    
    public void enqueue(int e);
    public int dequeue();
    public boolean isEmpty();
    public int size();
    public int peek();

}

class Queue implements Qintf{
    
    private int[] a;
    private int tail = -1;
    private int head = -1;
    private int size;

    Queue(int size) {
 	this.size = size;
	a = new int[size];
    }

    @Override
    public void enqueue(int e) {
	a[++tail] = e;
    }

    private boolean isFull() {
	return size() == size;
    }

    @Override
    public int dequeue() {
	int temp = peek();
	head++;
	return temp;
    }

    @Override
    public boolean isEmpty() {
	return size() == 0;
    }

    @Override
    public int size() {
	return head == -1 && tail == -1 ? 0 : tail - head;
    }

    @Override
    public int peek() {
        return a[head + 1];
    }

    public static void main(String[] args) {
	Qintf q = new Queue(5);
	q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
	System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.size());

    }

}
