
import java.net.*;
import java.io.*;

public class yaho {
	static int no_comp=5,R;
	static long t,r;
	//static Console c = System.console();
	static String[] s= new String[no_comp];
    public static void main(String[] args) throws Exception {
    	try{
    	r=t=System.currentTimeMillis();
    	System.out.println("enter value of Q ");
    
    	 BufferedReader rd1 = new BufferedReader(new InputStreamReader(System.in)); 
    	 float Q=Float.parseFloat(rd1.readLine());
    	 
    	 System.out.println("enter value of S ");
    	 float S=Float.parseFloat(rd1.readLine());
    	 
    	 System.out.println("enter value of R ");
    	 R=Integer.parseInt(rd1.readLine());
    	 
    	System.out.println("enter no of companies");
	    	
		no_comp=Integer.parseInt(rd1.readLine());
	
		for(int i=0;i<no_comp;i++)
		{
			System.out.println("enter company ticker");
			s[i]=rd1.readLine();
		
		}
		yaho y=new yaho();
		while(1==1)
		{
			
			if((System.currentTimeMillis()-t)>=(S*1000))
			{
				System.out.println("TIMEOUT!!!");
				return;
			}
			
			//c.flush();
			System.out.flush();
			
			//Runtime.getRuntime().exec("clear");
			
		y.display();
		Thread.sleep((long) (Q*1000));
		}
    	}
    	catch(IOException e2)
		{
			 System.out.println("EXCEPTION DETECTED :-" + e2);
		}
		
    }
		public void display()

		{
				try
		{
			for(int i=0;i<no_comp;i++)
			{
		URL comp = new URL("http://in.finance.yaho.com/d/quotes.csv?s=" + s[i] + "&f=sl1pj3d1t1");
			
		 URLConnection yc = comp.openConnection();
        BufferedReader rd2 = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        
        String inputLine;
        String[] s1;
        
     
        while ((inputLine = rd2.readLine()) != null) 
        {
        	
        	
        	s1=inputLine.split(",");
        	System.out.println("Ticker No-" + (i+1) + " Ticker-" + s1[0] +" Current price-" + s1[1] +" Previous Close-" + s1[2] +" Market Cap-" + s1[3]+" Date-" + s1[4] +" Time-" + s1[5]);
        	if((System.currentTimeMillis()-r)>=(R*1000))
			{
        		RandomAccessFile file = new RandomAccessFile ("c:/java/yaho.txt","rw");
        		  file.setLength(0);
        		PrintWriter fileWriter = new PrintWriter(new FileOutputStream("c:/java/yaho.txt",true));
        		fileWriter.print("current price-" + s1[1] + "," +"previous close-"+ s1[2] + "," +"market cap-" + s1[3]);
        		fileWriter.close();
			}
        }
        	
        rd2.close();
       
		
		}
		}
		catch(MalformedURLException e1)
		{
			 System.out.println("EXCEPTION DETECTED :-" + e1);
		}
		catch(IOException e2)
		{
			 System.out.println("EXCEPTION DETECTED :-" + e2);
		}
		
		}
    
    
}