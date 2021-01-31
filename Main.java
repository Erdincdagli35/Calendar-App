public class Main {

public	static void main(String[] args){

			//System.out.println("Hello World");
			
			//Time tEmpty = new Time();
			Time t = new Time(16,11,30);
			Time t2 = new Time(20,45,00);
			Time t3 = new Time(18,30,00);	
			//Date dEmpty = new Date();
			Date d = new Date(29,9,2020);
			Date d2 = new Date(5,10,2020);
			Date d3 = new Date(4,10,2020);
			//DateTime dtEmpty = new DateTime();
			DateTime dt = new DateTime(t,d);
			DateTime dt2 = new DateTime(t2,d2);
			DateTime dt3 = new DateTime(t3,d3);

			Participant p = new Participant("Erdinç Dağlı",24,false);
			Participant p2 = new Participant("Nakip Ali Yazıcı",25,false);
			Participant p3 = new Participant("İmge Aldırmaz",24,true);			   	     
			Participant p4 = new Participant("Yekta Öğreten",21,false);
			Participant p5 = new Participant("Emre Dağlı",21,false); 

			Partner partner = new Partner(p,p2);
			Partner partner2 = new Partner(p,p3);
			Partner partner3 = new Partner(p,p4,p5);

			Event e = new Event("Ar-Ge Meeting","Important CS Meeting",partner,dt,"İstanbul/Kurtköy");
			Event e2 = new Event("Light Party","Concept Party",partner2,dt2,"İstanbul/Kadıköy");
			
			Event e3 = new Event("Shoot Training","Growing up shooting",partner3,dt3,"İzmir/11 Eylül Stadyum");

			MeetingEvent me = new MeetingEvent(e);
			//me.print();

			SportEvent se = new SportEvent(e3);
			//se.print();
			
			ConcertEvent ce = new ConcertEvent(e2);
			//ce.print();		

			Calender c = new Calender("Erdinç's Calender");
			c.addEvent(se);
			c.addEvent(ce);
			c.print();
	}
}
