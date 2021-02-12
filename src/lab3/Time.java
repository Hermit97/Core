public class Time{
	public int hrs;
	public int mins;
	public int secs;

	public Time(){
		hrs = 0;
		mins = 0;
		secs = 0;
	}

	public Time(int h, int m, int s){
		hrs = h;
		mins = m;
		secs = s;
	}

	public void setTime(int h, int m, int s){
		hrs = (h >= 0 && h < 24)? h : 0;
		mins = (m >= 0 && m < 60)? m : 0;
		secs = (s >= 0 && s < 60)? m : 0;
	}

	public int getHours(){
		return hrs;
	}

	public int getMins(){
		return mins;
	}

	public int getSecs(){
		return secs;
	}

	public void printMilitary(){
		System.out.print((hrs < 10? "0": "") + hrs + ":");
		System.out.print((mins < 10? "0": "") + mins + ":");
		System.out.print((secs < 10? "0": "") + secs);
	}
}
