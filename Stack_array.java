class Stack_array
{
    int[] arr;
    int top;

    Stack_array()
    {
        arr = new int[100];
        top = -1;
    }
    
    public void push(int d)
    {
	top++;
	arr[top]=d;
    }

    public void pop()
    {
	if(top == -1)
	    System.out.println("nothing to pop");
	else
	    top--;
    }

    public int peek()
    {
	return arr[top];
    }

    public int empty()
    {
	if(top == -1)
	    return 1;
	return 0;
    }

    public static void main(String[] args)
    {
	Stack_array s = new Stack_array();
	s.push(3);
	s.push(4);
	s.push(6);
	s.pop();
	int a = s.peek();
	System.out.println(a);
	s.pop();
	a = s.peek();
	System.out.println(a);
    }

}
