class StringToCharArray04 {
	public static void main(String[] args) {
		String vowels = "aeiou";

		int counter = 0;
		int aCounter = 0;
		int eCounter = 0;
		int iCounter = 0;
		int oCounter = 0;
		int uCounter = 0;

		String searchString = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

		char characterArray[] = vowels.toCharArray();

		for(int i = 0; i < searchString.length(); i++){
			char tempChar = searchString.charAt(i);

			for(char vowelChar:characterArray){
				if(tempChar == vowelChar){
					System.out.println("Vowel Found "+ tempChar);
					counter++;

					switch(tempChar){
						case 'a':
							aCounter++;
							break;
						case 'e':
							eCounter++;
							break;
						case 'i':
							iCounter++;
							break;
						case 'o':
							oCounter++;
							break;
						case 'u':
							uCounter++;
							break;
					}
				}
			}
		}

		System.out.println("Number of vowels found "+ counter);
		System.out.println("Number of A vowels found "+ acounter);
		System.out.println("Number of E vowels found "+ ecounter);
		System.out.println("Number of I vowels found "+ icounter);
		System.out.println("Number of O vowels found "+ ocounter);
		System.out.println("Number of U vowels found "+ ucounter);
	}
}