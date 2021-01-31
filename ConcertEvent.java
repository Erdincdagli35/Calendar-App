public class ConcertEvent extends Event{
	        public  Event e;

		public ConcertEvent(){System.out.println("CONCERT EVENT");}
		public ConcertEvent(Event e){
			this.e=e;
		}
				        
		@Override
		
		public String toString(){

			return "Concert Event : \n"+                                                                      "Name : "+e.getEventName()+"\n"+                                                     "Subject : "+e.getSubject()+"\n"+                                                    "Participant : "+e.p.toString()+"\n"+                                                "Date and Time : "+e.datetime.toString()+"\n"+                                       "Location : "+e.getLocation()+"\n";
									        }

		@Override


		public void print(){System.out.println(toString());}}
