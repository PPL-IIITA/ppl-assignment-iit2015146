package fog.java;

public class ChoosyGirl {
	String name;
	public int maintenance;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	int Gift;
	int happiness;
	void Infogirl(String n,int b,int i,int a,int c) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		maintenance=b;
		attraction_requirement=c;
	}
	public String Name() {
		return name;
	}
	public int Happy() {
		return happiness;
	}
	public int Gift_Price() {
		return Gift;
	}
}
