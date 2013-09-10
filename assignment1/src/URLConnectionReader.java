import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
    	System.out.println("enter no of companies");
	    BufferedReader rd1 = new BufferedReader(new InputStreamReader(System.in));  	
		int no_comp=Integer.parseInt(rd1.readLine());
		String[] s= new String[no_comp];
		for(int i=0;i<no_comp;i++)
		{
			System.out.println("enter company ticker");
			s[i]=rd1.readLine();
				
			URL comp = new URL("http://in.finance.yahoo.com/d/quotes.csv?s=" + s[i] + "&f=sl1pj3d1");
			
		 URLConnection yc = comp.openConnection();
        BufferedReader rd2 = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        
        String inputLine;
        System.out.println("Info is in format-Ticker No, Ticker, Current price, Previous close, Market Cap, Date");
        System.out.print(i+1 + ",");
        while ((inputLine = rd2.readLine()) != null) 
            System.out.println(inputLine);
        rd2.close();
    }
    }
}