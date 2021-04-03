class FinalMethodExample {
	
	public final void display(){

		System.out.println("FinalMethodExample display()");
	}

	public static void main(String[] args) {
		new FinalMethodExample().display();
	}
}

class FinalExecute extends FinalMethodExample
{
	public void display(){

		System.out.println("FinalMethodExample display()");
	}
}