public class DateTime {

	Time t; Date d;

	public DateTime(){
		
	}
	public DateTime(Time t,Date d){
		this.t=t;
		this.d=d;
	}
	public String toString(){
		return "DateTime : \n"+
				   "Date : "+ d.toString()+
				   "\nTime : "+t.toString()+"\n";
	}
	public void print(){
		System.out.println(toString());
	}	


}
