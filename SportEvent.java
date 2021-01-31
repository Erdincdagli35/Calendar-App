public class SportEvent extends Event{
	        
	public Event e;
		
	public SportEvent(){System.out.println("SPORT EVENT");}
	public SportEvent(Event e){		                
		this.e=e;		
	}
				     
     	@Override

	public String toString(){

		return "Sport Event : \n"+                                                                      "Name : "+e.getEventName()+"\n"+                                                     "Subject : "+e.getSubject()+"\n"+                                                    "Participant : "+e.p.toString()+"\n"+                                                "Date and Time : "+e.datetime.toString()+"\n"+                                       "Location : "+e.getLocation()+"\n";
									        }
			
	@Override
	public void print(){System.out.println(toString());}
}
