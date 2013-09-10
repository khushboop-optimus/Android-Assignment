import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;


public class UtilDemo3 
{
public static void main (String args[])
 {
String[] str={"a","b","c","d","e"};
ArrayList l=new ArrayList();
for(int i=0;i<str.length;i++)
	l.add(str[i]);
ListIterator liter=l.listIterator();
System.out.println("before reversal");
while(liter.hasNext())
	System.out.println(liter.next());
Collections.reverse(l);
liter=l.listIterator();
System.out.println("after reversal");
while(liter.hasNext())
System.out.println(liter.next());
 }
}
