public class Time{
	
	public int hour,minute,second;

	public Time(){
		System.out.println("TIME\n");	
	}
	public Time(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour(){ return hour;}
	public void setHour(int hour){ this.hour=hour;}
	public int getMinute(){ return minute;}                                                                                                                  public void setMinute(int minute){ this.minute=minute;}
	public int getSecond(){ return second;}                                                                                                                  public void setSecond(int second){ this.second=second;}
	
	public String toString(){
		return "Time : \n"+getHour()+":"+getMinute()+":"+getSecond()+"\n";
	}
	public void print(){System.out.print(toString());}


}
