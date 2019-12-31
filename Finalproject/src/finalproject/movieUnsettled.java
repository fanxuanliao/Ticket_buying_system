package finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class movieUnsettled {
	movieUnsettled(){		
	this.name = "default";
	this.index =1;
	intro = "default";
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
	
	movieUnsettled(String name, String i,Boolean genre[],Boolean language [],int id) throws IOException{
		this.name = name;
		this.prize = 300.0;
		this.index = id;
		ty01 = genre[0];
		ty02 = genre[1];
		ty03 = genre[2];
		ty04 = genre[3];
		ty05 = genre[4];
		ty06 = genre[5];
		ty07 = genre[6];
		ty08 = genre[7];
		ty09 = genre[8];
		ty10 = genre[9];
		ty11 = genre[10];
		
		En = language[0];
		Eu = language[1];
		Ch = language[2];
		other = language[3];
		
		
		FileReader fr = new FileReader("src/intro/" + i + ".txt");
		BufferedReader br = new BufferedReader(fr);
		intro ="";
		while (br.ready())
		{
			String thisLine = br.readLine();
			intro += thisLine;
			intro +="\n";
		}	
		fr.close();
		br.close();
	}
	//movie contribute
	String name;
	String photo;
	String intro;
	int index;
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
