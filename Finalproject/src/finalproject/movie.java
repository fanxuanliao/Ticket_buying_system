package finalproject;

public class movie {
	movie(){		
	this.name = " ";
	this.region = " ";
	this.type = " ";
	};
	movie(String name,String region, String type, double prize){
		this.name = name;
		this.region = region;
		this.type = type;
		this.prize = 300;
	}
	//movie contribute
	String name;
	String region;
	String type;
	double prize;
} 
