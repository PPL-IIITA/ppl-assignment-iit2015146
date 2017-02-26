package fog.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws NullPointerException,IOException{
		Utility u = new Utility();
		u.Csvwriter();
		String name;
		int attractive;
		int maintanence;
		int intelligence;
		int attraction_requirement;
		int cnt1=0;
		int [] Compatible=new int [200];
		Boys B[]=new Boys[200];
		Girl G[]=new Girl[200];	
		String File_name1="Girl.csv";
		String File_name2="Boys.csv";
		try {
			FileReader a=null;
			BufferedReader b;
			a=new FileReader(File_name1);
			b=new BufferedReader(a);
			String Current_Line;
			while((Current_Line=b.readLine())!=null) {
				String [] girl=Current_Line.split(",");
				name=girl[0];
				attractive=Integer.parseInt(girl[1]);
				maintanence=Integer.parseInt(girl[2]);
				intelligence=Integer.parseInt(girl[3]);
				G[cnt1]=new Girl();
				G[cnt1].infogirl(name,maintanence,intelligence,attractive,Integer.parseInt(girl[3]));
				cnt1++;
			}
			b.close();
			a.close();
		}
		catch(NullPointerException nx) {
			nx.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();

		}
		int cnt2=0;
		try {
			FileReader a=null;
			BufferedReader b;
			a=new FileReader(File_name2);
			b=new BufferedReader(a);
			String Current_Line;
			while((Current_Line=b.readLine())!=null) {
				String [] boy=Current_Line.split(",");
				name=boy[0];
				attractive=Integer.parseInt(boy[1]);
				maintanence=Integer.parseInt(boy[2]);
				intelligence=Integer.parseInt(boy[3]);
				attraction_requirement=Integer.parseInt(boy[4]);
				B[cnt2]=new Boys();
				B[cnt2].infoboy(name,maintanence,intelligence,attractive,attraction_requirement);
				cnt2++;
			}
			b.close();
			a.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(NullPointerException nx) {
			nx.printStackTrace();
		}
		int x=0;

		for(int i=0;i<cnt1;i++) {
			for(int j=0;j<cnt2;j++) {
				if(B[j].budget>G[i].maintenance && B[j].attraction_requirement>G[i].attractiveness) {
					B[j].budget=0;
					System.out.println(B[j].Name()+" "+ G[i].Name());
					//happiness[x]=B[j].happiness+G[i].happiness;
					Compatible[x]=(B[j].budget-G[i].maintenance)+Math.abs(B[j].attractiveness-G[i].attractiveness)+Math.abs(B[j].intelligencelevel-G[i].intelligencelevel);
					break;
				}
			}
			x++;
		}
		
		
	}
}
