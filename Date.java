public class Date{                                                                                                                                                                                                                                                                                                        
	private int year,mounth,day;                                                                                                                                                                                                                                                                                   
	public Date(){                                                                                                                                                   
		System.out.println("DATE\n");                                                                                                                      }                                                                                                                                                        
	public Date(int day,int mounth,int year){                                                                                                                     
		this.year=year;                                                                                                                                         
		this.mounth=mounth;
		this.day=day;

	}

	public int getYear(){ return year;}                                                                                                                      
	public void setYear(int year){ this.year=year;}                                                                                                          
	public int getMounth(){ return mounth;}                                                                                                                  
	public void setMounth(int mounth){ this.mounth=mounth;}                                                                                                  
	public int getDay(){ return day;}
	public void setDay(int day){ this.day=day;}

			
	public String toString(){                                                                                                                                        
		return "Date : \n"+getDay()+"."+getMounth()+"."+getYear()+"\n";                                                                               }
	public void print(){System.out.print(toString());}                                                                                                                                                                                                                                                                                                                                                                                                                 }          
