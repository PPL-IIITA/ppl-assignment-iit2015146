package fog.java;

public class Girl{
	String name;
	public int maintenance;
	int intelligencelevel;
	int attractiveness;
	public void infogirl(String n,int b,int i,int a,int c) throws NullPointerException{
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		maintenance=b;
	}
	public String Name() {
		return name;
	}
}

class ChoosyGirl1 {
	String name;
	public int maintenance;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	int Gift;
	void Infogirl(String n,int b,int i,int a,int cost) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		maintenance=b;
		Gift=cost;
	}
	public String Name() {
		return name;
	}
	public int Gift_Price() {
		return Gift;
	}
	double happiness = Math.log(maintenance/Gift);
}

class DesperateGirl1 {
	String name;
	public int maintenance;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	int Gift;
	void Infogirl(String n,int b,int i,int a,int cost) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		maintenance=b;
		Gift=cost;
	}
	public String Name() {
		return name;
	}
	public int Gift_Price() {
		return Gift;
	}
	double happiness=maintenance/Gift;
}

class NormalGirl1 {
	String name;
	public int maintenance;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	int Gift;
	public void Infogirl(String n,int b,int i,int a,int cost) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		maintenance=b;
		Gift=cost;
	}
	public int Gift_Price() {
		return Gift;
	}
	double happiness=Math.pow(2.37,maintenance/Gift);
}
