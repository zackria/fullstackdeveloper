import java.util.Objects;

public class Contact{
	private final String name;
	private final int number;

	public Contact(String name, int number){
		this.name = name;
		this.number = number;
	}

	public String getName(){
		return name;
	}

	public int getNumber(){
		return number;
	}

	@Override
	public String toString(){
		return "Contract(name="+this.getName()+ ", number="+this.getNumber()+")";
	}

	@Override
	public int hashCode(){
		return Objects.hash(name, number);
	}

	@Override
	public boolean equals(final Object o){
		if(this == o){
			return true;
		}

		if(this == null){
			return false;
		}

		if(getClass() != o.getClass()){
			return false;
		}

		Contact contact = (Contact) o;

		return Objects.equals(name, contact.name) 
			&& Objects.equals(number, contact.number);

	}
}