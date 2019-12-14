package finalproject;

public class movie {
	movie(){		
	this.name = "default";
	this.region = "default";
	this.type = "default";
	this.commandStars = 0;
	};
	movie(String name,String region, String type, double prize,int commandStars){
		this.name = name;
		this.region = region;
		this.type = type;
		this.prize = prize;
		this.commandStars = commandStars;
	}
	//movie contribute
	String name;
	String region;
	String type;
	double prize;
	int commandStars;	
} 
