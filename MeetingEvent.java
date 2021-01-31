public class MeetingEvent extends Event{
	public  Event e;

	public MeetingEvent(){System.out.println("MEETING EVENT");}
	public MeetingEvent(Event e){
		this.e=e;
	}	
	@Override	
	public String toString(){
		return "Meeting Event : \n"+                                                                      "Name : "+e.getEventName()+"\n"+                                                     "Subject : "+e.getSubject()+"\n"+                                                    "Participant : "+e.p.toString()+"\n"+                                                "Date and Time : "+e.datetime.toString()+"\n"+                                       "Location : "+e.getLocation()+"\n";  
	}
	@Override 
	public void print(){System.out.println(toString());}
}
