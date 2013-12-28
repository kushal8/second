import java.io.*;
import java.util.*;
class ex 
{
	  String title;
	  String genre;
	ex(String title,String genre)
	{
		this.title=title;
		this.genre=genre;
	}
	public String getTitle()
	{
		return title;
	}
		public String getGenre()
	{
		return genre;
	}
public String toString()
	{
	return title+" "+genre+" ";
	}
}

class a 
{
	public static void main(String[] args) 
	{
		
		ArrayList <ex> s=new ArrayList<ex>();
		ArrayList a=new ArrayList<>();
		ArrayList<ArrayList> aa=new ArrayList<ArrayList>();
		ex obj=new ex("blue eyes","hs");
		ex obj1=new ex("blue ","h");
		s.add(obj);
		s.add(obj1);
		aa.add(s);
		a.add(s);
		System.out.println("Coolections"+a);
		System.out.println("Coolections"+aa);
		System.out.println("Coolections"+s);
	}
}
