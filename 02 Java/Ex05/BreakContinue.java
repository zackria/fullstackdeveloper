class BreakContinue{
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    break;
		  }
		  System.out.println(i);
		}

		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
	}
}