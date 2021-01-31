public class Participant{
	
	String name;
	int age;
	boolean sex;

	public Participant(){}
	public Participant(String name,int age,boolean sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

	public String getName(){return name;}
	public int getAge(){return age;}
	public String getSex(){
		if(sex==false)
			return "Male";
		else
			return "Female";	
	}
	public void setName(String name){this.name=name;}
	public void setAge(int age){this.age=age;}
	public void setSex(boolean sex){this.sex=sex;}

	public String toString(){
		return "Participant : \n"+
			"Name : "+getName()+"\n"+
			"Age : "+getAge()+"\n"+
			"Sex : "+getSex()+"\n";


	}

	public void print(){
		System.out.println(toString());
	}
}
