class Node { 
    int data, height; 
    Node left, right; 
    Node(int d) { 
        data = d; 
        height = 1; 
    } 
} 
  
class bal_BST { 
    Node root; 

    int height(Node root)
    {
	if(root==null)
	    return 0;
	int l=height(root.left);
	int r=height(root.right);
	if(l>r)
	    return l+1;
	else
	    return r+1;
	//return (1+ max(height(root.left),height(root.right)));
    }
   
    int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
   
    Node rightRotate(Node root) { 
        Node y = root.left; 
        Node temp = y.right;  
        y.right = root; 
        root.left = temp; 
        root.height = max(height(root.left), height(root.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
        return y; 
    } 
   
    Node leftRotate(Node root) { 
        Node y = root.right; 
        Node temp = y.left; 
        y.left = root; 
        root.right = temp; 
        root.height = max(height(root.left), height(root.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
        return y; 
    } 

     Node insert(Node node, int key) { 
        if (node == null) 
            return (new Node(key)); 
  
        if (key < node.data) 
            node.left = insert(node.left, key); 
        else if (key > node.data) 
            node.right = insert(node.right, key); 
  
        int balance = height(node.left) - height(node.right); 
        if (balance > 1)
	{
	    if (height(node.left.left) - height(node.left.right) >= 0)
                node = rightRotate(node);
	    else
	    {
		node.left = leftRotate(node.left);
		node = rightRotate(node);
	    }
	}
	if (balance < -1)
	{
	    if(height(node.right.left) - height(node.right.right) < 0)
                node = leftRotate(node);
	    else
	    {
		node.right = rightRotate(node.right);
		node = leftRotate(node);
	    }
	}
	
	else
	{
	    int l=height(node.left);
	    int r=height(node.right);
	    if(l>r)
	        node.height=l+1;
	    else
	        node.height=r+1;
	    //root->h=max(height(root->left),height(root->right))+1;
	}
	
	return node;
    } 
    void inOrder(Node node) { 
        if (node == null)
	    return;
	inOrder(node.left);
        System.out.print(node.data + " "); 
        inOrder(node.right);  
    } 
  
    public static void main(String[] args) { 
        bal_BST tree = new bal_BST();
        tree.root = tree.insert(tree.root, 15); 
        tree.root = tree.insert(tree.root, 20); 
        tree.root = tree.insert(tree.root, 24); 
        tree.root = tree.insert(tree.root, 10); 
        tree.root = tree.insert(tree.root, 13); 
        tree.root = tree.insert(tree.root, 7);
	tree.root = tree.insert(tree.root, 30);
	tree.root = tree.insert(tree.root, 36);
	tree.root = tree.insert(tree.root, 25);  
        tree.inOrder(tree.root); 
    } 
} 
