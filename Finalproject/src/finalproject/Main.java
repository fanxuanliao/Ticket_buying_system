package finalproject;

public class Main {
	static movie datain[] = setDatas();
	public void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[50];
	}
	
	public static movie[] setDatas(){
		movie[] allData;
		allData = new movie[50];
		for(int i=0;i<50;i++) allData[i] = new movie();
		allData[0] = new movie("lalaland");
		allData[1] = new movie("lalaland1");
		allData[2] = new movie("lalaland2");
		allData[3] = new movie("lalaland3");
		return allData;
	}
}
