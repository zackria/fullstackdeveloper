class CloneableExample implements Cloneable{  
	int rollno;  
	String name;  
	  
	CloneableExample(int rollno,String name){

		this.rollno=rollno;  
		this.name=name;  

	}  
	  
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	  
	public static void main(String args[]){

		try{ 

			CloneableExample s1=new CloneableExample(101,"Zack");  
			  
			CloneableExample s2=(CloneableExample)s1.clone();  
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  

			s2.name = "Jarvis";

			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
		  
		}catch(CloneNotSupportedException c)
		{
			c.printStackTrace();
		}  
	  
	}  
}  