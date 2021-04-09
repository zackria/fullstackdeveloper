class IfExample
{
 	public static void main(String[] args) {
         int age = 18;
         //if (true) then the block is executed
         if(age < 18 )
         {
             System.out.println("Youth");
         }
         else if(age >18)
         {
             System.out.println("Adult");
         }
         else {
             System.out.println("Unknown");
         }

    }
}