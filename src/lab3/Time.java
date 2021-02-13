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

	public void printStandard(){
		System.out.print((hrs == 0 || hrs == 12? 12: hrs % 12) + ":");
		System.out.print((mins < 10? "0": "") + mins + ":");
		System.out.print((secs < 10? "0": "") + secs);
		System.out.print((hrs < 12? "AM": "PM"));
	}

	public String toString(){
		return hrs + ":" + mins + ":" + secs;
	}

	public void increment(){
		secs++;
		if(secs > 59){
			secs = 0;
			mins++;
			if(mins > 59){
				mins = 0;
				hrs++;
				if(hrs > 23)
					hrs = 0;
			}
		}
	}

	public boolean equals(Time otherTime){
		return (hrs == otherTime.hrs && mins == otherTime.mins && secs == otherTime.secs);
	}

	public boolean lessThan(Time t){
		return (hrs < t.hrs || hrs == t.hrs && mins < t.mins || hrs == t.hrs && mins == t.mins && secs < t.secs);
	}

	public void copy(Time otherTime){
		hrs = otherTime.hrs;
		mins = otherTime.mins;
		secs = otherTime.secs;
	}

	public Time getCopy(){
		Time temp = new Time();
		temp.hrs = hrs;
		temp.mins = mins;
		temp.secs = secs;
		return temp;
	}
}

