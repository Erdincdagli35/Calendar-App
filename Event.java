public class Event extends DateTime{
	
	protected String EventName,Location,Subject;
	protected Partner p;
	public  DateTime datetime;

	public Event(){}
	public Event(String EventName,String Subject,Partner  p,DateTime datetime,String Location){
		this.EventName=EventName;
		this.Subject=Subject;
		this.p=p;
		this.datetime=datetime;
		this.Location=Location;
	}

	public String getEventName(){return EventName;}
	public String getLocation(){return Location;}
	public String getSubject(){return Subject;}
	
	public String toString(){
		return "Event : \n"+
		       "Name : "+getEventName()+"\n"+
		       "Subject : "+getSubject()+"\n"+
		       "Participant : "+p.toString()+"\n"+
		       "Date and Time : "+datetime.toString()+"\n"+
		       "Location : "+getLocation()+"\n"; 
	}
	
	public void print(){System.out.println(toString());}
}
