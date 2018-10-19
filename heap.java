//Implementation Of Heap And Heap Sort

class heap {
    public int[] a = new int[1000000];
    int size;
    static int 	N;
    
    heap() {
	int i;
	for(i=0;i<10000;i++)
	    a[i]=0;
	size=0; 
    }

    public int size() {
	return size;
    }

    public boolean empty() {
	return size==0;
    }
    
    public void swap(int i,int j) {
	int temp;
	temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }

    public void swim(int i) {
	if (i == 0) return;
	if (a[i] <= a[i/2]) return;
	swap(i,i/2);
	swim(i/2);
    }

    public void enque(int e) {
	a[size] = e;
	swim(size);
	size++;
    }

    public void sink(int i) {
	int max=i;
	if (2*i < size && a[2*i] > a[max])
	   max=2*i;
	if (2*i+1 < size && a[max] < a[2*i+1])
	   max=2*i+1;
	if(max != i) {
	    swap(i,max);
	    sink(max);
	}
    }

    public int deque() {
	swap(0,size);
	int temp = a[size];
	size--;
	sink(0);
	return temp;
    }

    public void sort() {
        N=size;
	size--;
	while(size>0) {

	    swap(0,size);
	    size--;
	    sink(0);
	}
	size=N;
    }

    public void print() {
	int i;
	for(i=0;i<size;i++) 
	    System.out.println(a[i]);
    }

    public static void main(String[] args) {
	int[] arr = {9,7,6,8,3,2,1};
	int[] b= {3,6,5,7,4,1,5};
	heap h = new heap();	
	int i,k;
	for(i=0;i<7;i++) {
	    //k=arr[i];
	    h.enque(arr[i]);
	}
	h.print();
	//h.deque();
	h.sort();
	h.print();
    }
}
