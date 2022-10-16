import java.util.Arrays;

class SortArray02{
	public static void main(String[] args) {
		//creating an instance of an array  
		int[] array = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
		}   
	}
}