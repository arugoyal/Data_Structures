import java.util.*;

class Linked_list implements Iterable <Integer>
{
    Node head;
   
    class Node
    {
	int data;
	Node next;

	Node(int d)
	{
	    data = d;
	    next = null;
	}
    }

    public void add(int d)
    {
	if(head == null)
	    head = new Node(d);
	else
	{
	    Node t = head;
	    while(t.next != null)
		t = t.next;
	    t.next = new Node(d);
	}
    }
    
    @Override
    public Iterator <Integer> iterator()
    {
	return new CustomIterator();
    }

    class CustomIterator implements Iterator <Integer>
    {
	Node temp = head;
	    
	@Override
	public boolean hasNext()
	{
	    return (temp != null);
	}

	@Override
	public Integer next()
	{
	    int t = temp.data;
	    temp = temp.next;
	    return t;
	}

    }
    
}

public class iterable_linkedList
{
    public static void print(Iterable <Integer> i)
    {
	Iterator <Integer> ite = i.iterator();
	while(ite.hasNext())
	{
	    System.out.println(ite.next());
	}
    }

    public static void main(String[] args)
    {
        Linked_list s = new Linked_list();
        s.add(1);
	s.add(2);
	print(s);
    }
}





