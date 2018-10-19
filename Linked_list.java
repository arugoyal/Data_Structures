import java.util.LinkedList;

class Linked_list {
    public static void main(String[] args) {
        LinkedList <Integer> l = new LinkedList <Integer>();
	l.add(1);
	l.add(2);
	l.add(3);
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
	l.set(1,4);
	System.out.println(l);
    }
}
