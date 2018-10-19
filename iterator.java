import java.io.*;
import java.util.*;

class iterator
{
    public static void main(String[] args)
    {
        ArrayList <Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        Iterator ite = s.iterator();
	while(ite.hasNext())
	{
	    System.out.println(ite.next());
	}
    }
}

