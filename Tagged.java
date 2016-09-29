import java.util.*;
import java.lang.*;
public class Tagged
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner in = new Scanner(System.in);
		Tag t =new Tag();
		System.out.println("Enter tag");
		s1=in.nextLine();
		System.out.println("Enter string");
		s2=in.nextLine();
		String str=t.makeTags(s1,s2);
		System.out.println(str);
	}
}
class Tag
{
	public String makeTags(String a,String b)
	{
		String p,q,r;
		p="<"+a+">";
		r="</"+a+">";
		q=p+b+r;
		return q;
	}
}
