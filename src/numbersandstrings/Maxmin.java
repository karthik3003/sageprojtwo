package numbersandstrings;

public class Maxmin {
	
	double[] d = new double[10];
	
	public Maxmin() {
		// TODO Auto-generated constructor stub
	}
	public Maxmin(double[] d) {
		this.d = d;
	}
	
	public double maxmindiff(double[] db) {
//		String[] db = input.split(",");
		double max = db[0];
		double min = db[0];
		for(int i=0; i<db.length; i++) {
			if(db[i]>=max) {
				max = db[i];
				//System.out.println(max);
			}
		}
		for(int i=0; i<db.length; i++) {
			if(db[i]<min) {
				min = db[i];
			}
		}
		return max-min;
	}

}
