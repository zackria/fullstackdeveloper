class SearchArray01{
	public static void main(String[] args) {
		//creating an instance of an array  
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65}; 
		int searchValue = 90;

		for (int i = 0; i < arr.length; i++)   
		{  
			if(searchValue==arr[i]){
				System.out.println("Search value "+searchValue+" found at position "+i);
			}
		}
	}
}