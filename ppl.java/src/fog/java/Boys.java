package fog.java;

public class Boys {
		String name;
		public int budget;
		int intelligencelevel;
		int attraction_requirement;
		int attractiveness;
		public void infoboy(String n,int b,int i,int a,int c) {
			name=n;
			attractiveness=a;
			intelligencelevel=i;
			budget=b;
			attraction_requirement=c;
		}
		public String Name() {
			return name;
		}
}

class MiserBoy {
	String name;
	public int budget;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	public void Infoboy(String n,int b,int i,int a) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		budget=b;
	}
	int happiness=budget;
}

class GenerousBoy {
	String name;
	public int budget;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	void Infoboy(String n,int b,int i,int a) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		budget=b;
	}
}
class GeekBoy {
	String name;
	public int budget;
	int intelligencelevel;
	int attraction_requirement;
	int attractiveness;
	void Infoboy(String n,int b,int i,int a) {
		name=n;
		attractiveness=a;
		intelligencelevel=i;
		budget=b;
	}
}