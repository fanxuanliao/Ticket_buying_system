package finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class movie {
	movie(){		
	this.name = "defalt";
	En = false;
	Eu = false;
	Ch = false;
	other = false;

	ty01 = false;
	ty02 = false;
	ty03 = false;
	ty04 = false;
	ty05 = false;
	ty06 = false;
	ty07 = false;
	ty08 = false;
	ty09 = false;
	ty10 = false;
	ty11 = false;

	};
	
	movie(String name, String i) throws IOException{
		this.name = name;
		this.prize = 300.0;
		FileReader fr = new FileReader("src/intro/" + i + ".txt");
		BufferedReader br = new BufferedReader(fr);
		while (br.ready())
		{
			System.out.println(br.readLine());
		}
		
		fr.close();
	}
	//movie contribute
	String name;
	String photo;
	
	boolean En;
	boolean Eu;
	boolean Ch;
	boolean other;
	
	boolean ty01;
	boolean ty02;
	boolean ty03;
	boolean ty04;
	boolean ty05;
	boolean ty06;
	boolean ty07;
	boolean ty08;
	boolean ty09;
	boolean ty10;
	boolean ty11;


	double prize;
} 
