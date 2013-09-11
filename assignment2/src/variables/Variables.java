package variables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variables {
	public static void main(String args[]) throws NumberFormatException, IOException
	{

	}
	public void getvalues(){
		BufferedReader rd1 = new BufferedReader(new InputStreamReader(
				System.in));	
		try {
			System.out.println("Please Enter Number Of Companies.");
			int no_comp;
			no_comp=Integer.parseInt(rd1.readLine());
			
			System.out.println("Please Enter Time After Which you want Logs to be Stored.");
			float lg_in=Float.parseFloat(rd1.readLine());
			
			String cm_t[]=new String[no_comp];
			float up_in[]=new float[no_comp];
			for(int i=0;i<no_comp;i++)
			{
			 System.out.println("Please Enter Company Ticker.");
			 cm_t[i]=(rd1.readLine());
			 System.out.println("Please Enter Time After Which Data Should Be Refereshed.");
			 up_in[i]=Integer.parseInt(rd1.readLine());
			}
			
			
			
			
		} catch (NumberFormatException e) {
						e.printStackTrace();
		} catch (IOException e) {
						e.printStackTrace();
		}
	
	}
}
