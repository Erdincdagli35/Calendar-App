import java.util.List;
import java.util.ArrayList;

public class Calender{
	
	public String name;
	public Event event;
		
	List<Event> list = new ArrayList<Event>();
	
	public Calender(){}
	public Calender(String name){this.name=name;}

	public String getName(){
		return name;
	}
	public Event getEvent(){
		return event;
	}
	public  void addEvent(Event event){
		list.add(event);
	}
	public String toString(){
		return getName();
	}
	public void print(){
		System.out.println(toString()+"\nEvent :");
		for (Event event : list)
			System.out.print(event+"\n");
	}
}
