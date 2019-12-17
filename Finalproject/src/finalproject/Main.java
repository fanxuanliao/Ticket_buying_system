package finalproject;

import java.io.IOException;

public class Main {
	static movie datain[] = setData();
	//public void main(String[] args) 
	public static void main(String[] args){
		// TODO Auto-generated method stub
	}
	
	public static movie[] setData(){
		movie[] allData;
		allData = new movie[1];
		for(int i=0;i<1;i++)
		{
			try
			{
				movie datain = new movie("lalaland", "1");
			}
		
			catch(IOException IO)
			{
				System.out.println(IO);
			}
		}
		return allData;
	}
}
