package lab11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordcount {

	public static void main(String args[]) {
		countword aa=new countword();
		file1 f1=new file1(aa,args[0]);
		file2 f2=new file2(aa,args[1]);
		file3 f3=new file3(aa,args[2]);
		f1.start();
		f2.start();
		f3.start();
		
	}

}
class countword
{


	public void  count(String filename) throws IOException, FileNotFoundException
	{
		File f=new File(filename);
		BufferedReader fd=new BufferedReader (new FileReader(f));
		String read;
		int count=0;
		while((read=fd.readLine())!=null)
		{
			int i;
			String s[]=read.split(" ");
			for(i=0;i<s.length;i++)
			{
				count++;
			}
		}
		System.out.println(f.getName()+":"+count+"words");
		fd.close();
		
	}
}
class file1 extends Thread
{
	countword w;
	String filename;
	public file1(countword w,String filename) {
		this.w=w;
		this.filename=filename;
	}
	public void run()
	{
		try
		{
			w.count(filename);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class file2 extends Thread
{
	countword w;
	String filename;
	public file2(countword w,String filename) {
		this.w=w;
		this.filename=filename;
	}
	public void run()
	{
		try
		{
			w.count(filename);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class file3 extends Thread
{
	countword w;
	String filename;
	public file3(countword w,String filename) {
		this.w=w;
		this.filename=filename;
	}
	public void run()
	{
		try
		{
			w.count(filename);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
