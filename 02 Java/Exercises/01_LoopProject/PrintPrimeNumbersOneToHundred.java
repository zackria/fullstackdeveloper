/**
 * Prime numbers are the numbers which have only two factors, 
 * the number itself and 1. 
 * So we have to find such numbers which have only two factors. 
 * 
 * A prime number is an integer greater than one and can be divisible by only itself 
 * and one i.e it has only two factors. 
 * Zero, one, and numbers less than one are not considered as prime numbers.
 * 
 * A number having more than two factors is referred to as a composite number. 
 * The smallest prime number is 2 because it is divisible by itself and 1 only.
 * 
 * */

class PrintPrimeNumbersOneToHundred{
	public static void main(String[] args) {
		for (int n = 0; n <=100 ; n++) {

			  //n is the number to be checked    
			  
			  int i,m=0,flag=0;      
			  
			  m=n/2;      
			  if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  }//end of else  

		}
	}
}