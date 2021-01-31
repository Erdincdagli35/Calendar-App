public class Partner extends Participant{
	
	public Participant p;
	public Participant partner,partner2=null;

	public Partner(){System.out.print("PARTNER");}
	public Partner(Participant p,Participant partner){
		this.p=p;
		this.partner=partner;
	}
	public Partner(Participant p,Participant partner,Participant partner2){
		this.p=p;                                                                                                                                                               this.partner=partner;
		this.partner2=partner2;
	}

	public String toString(){
		
		return p+" with "+partner+" with "+partner2;
	}
	public void print(){System.out.println(toString());}
}
