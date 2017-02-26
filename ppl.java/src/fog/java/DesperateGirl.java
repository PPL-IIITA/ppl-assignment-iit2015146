package fog.java;

public class DesperateGirl {
	String name;
	public int maintenance;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	int Gift;
	int happiness;
	void Infogirl(String n,int b,int i,int a) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		maintenance=b;
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
