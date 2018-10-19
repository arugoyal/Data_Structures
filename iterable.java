import java.io.*;
import java.util.*;

class iterable
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
	List <Integer> s = new ArrayList<>();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	print(s);
    }
}
