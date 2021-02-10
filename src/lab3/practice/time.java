public class Time{

	private int hrs;
	private int mins;
	private int secs;



//Deafult constructor
public time(){
	hrs = 0;
	mins = 0;
	secs = 0;

}

public Time(int h, int m, inst s){
	hrs = h;
	mins = m;
	secs = s;

}

public void setTime(int h , int m, int s){
	hrs = (h >= 0 && h < 24) ? h : 0;
	mins = (m >= 0 && h < 60) ? m : 0;
	secs = (s >= 0 && h < 60) ? s : 0;
	
}

public int getHours(){
	return hrs;
}

public int getMinutes(){
	return mins;
}

public int getSeconds(){
	return secs;
}

}
