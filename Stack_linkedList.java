class Node
{
    int data;
    Node next;

    Node(int d)
    {
	data = d;
    }
}

class Stack_linkedList
{
    Node root = null;

    public void push(int d)
    {
	Node nn = new Node(d);
	nn.next=root;
	root=nn;
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
	Stack_linkedList s = new Stack_linkedList();
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
