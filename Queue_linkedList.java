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

class Queue_linkedList
{
    Node root = null;
    Node tail = null;
    public void push(int d)
    {
	Node nn = new Node(d);
	if(root == null)
        {
	    root = nn;
	    tail = nn;
	}
	else
	{
	    tail.next = nn;
	    tail = nn;
	}

    }

    public void pop()
    {
        Node nn = root;
        root = root.next;
        nn = null;
    }

    public int peek()
    {
        return root.data;
    }

    public int empty()
    {
        if(root == null)
            return 1;
        return 0;
    }

    public static void main(String[] args)
    {
        Queue_linkedList s = new Queue_linkedList();
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        int a = s.peek();
        System.out.println(a);
        s.pop();
        a = s.peek();
        System.out.println(a);
    }
}
