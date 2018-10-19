class Trie_tree {
    static class Node
    {
        Node[] arr = new Node[26];
        boolean end;

        Node() {
            end = false;
            int i;
            for(i = 0; i < 26; i++)
                arr[i] = null;
        }

    }

    static Node root;

    static public void insert(String s)
    {
	Node curr = root;
	int i;
	char[] str = s.toCharArray();
	for(i = 0; i < str.length; i++)
	{
	    if(curr.arr[str[i]-'a'] == null)
                curr.arr[str[i]-'a'] = new Node();
	    curr = curr.arr[str[i]-'a'];
	}
	curr.end=true;
    }   

    static public int search(String s)
    {
	Node curr = root;
	int i,flag = 1,count=0;
	char[] str = s.toCharArray();
	for(i = 0; i < str.length; i++)
	{
	    if(curr.arr[str[i]-'a'] != null)
	        curr = curr.arr[str[i]-'a'];
	    else
	    {
		flag = 0;
		break;
	    }
	}
	if(flag == 1)
	{
	    if(curr.end == true)
		count=1;
	}
	return count;
    }

    public static void main(String[] args) {
	root = new Node();
	Trie_tree tree = new Trie_tree();
	String[] s = {"hello", "world", "dog", "aru"};
	int i;
	for(i=0;i<s.length;i++)
	    tree.insert(s[i]);
	String s1="goyal";
	int j = tree.search(s1);
	System.out.println(j);
    }

}
