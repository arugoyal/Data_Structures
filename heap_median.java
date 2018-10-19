//calculate median of running array.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Arrays;

class heap_median {
    public static void addNumber(int n,PriorityQueue <Integer> min,PriorityQueue <Integer> max) {
	if(max.size() == 0 || n < max.peek())
	    max.add(n);
	else
	    min.add(n);
    }

    public static void balance (PriorityQueue <Integer> min,PriorityQueue <Integer> max) {
	PriorityQueue <Integer> s=min.size() < max.size()? min : max;
	PriorityQueue <Integer> l=min.size() > max.size()? min : max;
	if(l.size() - s.size() > 1)
	    s.add(l.poll());
    }

    public static int cal  (PriorityQueue <Integer> min,PriorityQueue <Integer> max) {
        PriorityQueue <Integer> s=min.size() < max.size()? min : max;
        PriorityQueue <Integer> l=min.size() > max.size()? min : max;
        if(l.size() == s.size())
            return (l.poll() + s.poll())/2;
	else if(l.size() > s.size())
	    return l.poll();
	else
	    return s.poll();
	
    }
 
    public static int[] median (int[] arr) {
	PriorityQueue <Integer> max=new PriorityQueue<Integer>();
	PriorityQueue <Integer> min=new PriorityQueue<Integer>(new Comparator <Integer>() {
	    public int compare(Integer a,Integer b) {
	        return -1*a.compareTo(b);
	    }
        });
        
	int n=arr.length;
	int[] res=new int[n];
	int i;
	for(i=0;i<n;i++) {
	    addNumber(arr[i],min,max);
	    balance(min,max);
	    res[i]=cal(min,max);
	}
	return res;
	    
    }

    public static void main(String[] args) {
        int[] arr={2,6,2,4,5,1,6,3};
	int[] med=median(arr);
	int n=med.length;
	int i;
	for(i=0;i<n;i++)
	    System.out.println(med[i]);
	
    }
}
