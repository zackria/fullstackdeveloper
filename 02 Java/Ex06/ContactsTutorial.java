public class ContactsTutorial{
	
	public static void main(String[] args) {
		Contact contact = new Contact("Zack", 123456578);

		System.out.println(contact.getName() + " " + contact.getNumber());

		System.out.println(contact);

		ContactRecord contactRecord = new ContactRecord("Zack", 123456578);

		System.out.println(contactRecord.name() + " " + contactRecord.number());

		System.out.println(contactRecord);

		System.out.println(contactRecord.nameInUpperCase());

		contactRecord.printClassName();

		ContactRecord.printClassName();
	}
}