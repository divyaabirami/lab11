package lab11;

public class booking {

	public static void main(String[] args) {

   int t=0;
   venuebooking obj=new venuebooking();
   aaa ob1=new aaa(obj,t);
   bbb ob2=new bbb(obj,t);
   ccc ob3=new ccc(obj,t);
   ddd ob4=new ddd(obj,t);
   ob1.start();
   ob2.start();
   ob3.start();
   ob4.start();
	}

}
class venuebooking
{
	int count=0;
	aaa a;
	int getcount()
	{
		return count;
	}
	synchronized public void resort(int c) {
		if(count<2)
		{
			System.out.println("successfully booked");
			count++;
		}
		else
		{
			System.out.println("fully booked");
		}
	}
}
class aaa extends Thread
{
	venuebooking vb;
	int t=0;
	public aaa(venuebooking vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		vb.getcount();
		int c=t+1;
		vb.resort(c);
	}
}
class bbb extends Thread
{
	venuebooking vb;
	int t=0;
	public bbb(venuebooking vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		
		int c=t+1;
		vb.resort(c);
	}
}
class ccc extends Thread
{
	venuebooking vb;
	int t=0;
	public ccc(venuebooking vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		
		int c=t+1;
		vb.resort(c);
	}
}
class ddd extends Thread
{
	venuebooking vb;
	int t=0;
	public ddd(venuebooking vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		
		int c=t+1;
		vb.resort(c);
	}
}