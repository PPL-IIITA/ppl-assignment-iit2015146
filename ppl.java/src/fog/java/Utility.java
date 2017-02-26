package fog.java;
import java.io.*;
import java.util.*;

public class Utility {
	public void Csvwriter() {
		Random rand=new Random();
		try {
			FileWriter b=new FileWriter("Boys.csv");
			String boy[]= {"Jon Snow","Hodor","Jaime Lannister","Theon Greyjoy","Daario Naharis","Tyrion Lannister","Bran Stark","Ramsay Bolton","Mance Rayder","Robb Stark","Grey Wind","Samwell Tarly"};
			for(int i=0;i<12;i++) {
				b.write(boy[i]+","+rand.nextInt(11)+","+rand.nextInt(101)+","+rand.nextInt(101)+","+rand.nextInt(101)+System.lineSeparator());
			}
			FileWriter g=new FileWriter("Girl.csv");
			String girl[]={"Daenerys Targaryen","Talisa","Sansa Stark","Cersei Lannister","Ygritte"};
			for(int i=0;i<5;i++) {
				g.write(girl[i]+","+rand.nextInt(11)+","+rand.nextInt(101)+","+rand.nextInt(101)+","+rand.nextInt(101)+System.lineSeparator());
			}
			b.close();
			g.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
