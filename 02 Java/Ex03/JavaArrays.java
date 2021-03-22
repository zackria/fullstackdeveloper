class JavaArrays
{
    public static void main(String[] args) {
       String [] cars = {"Suzuki", "Audi"};
       int [] myArray = {10, 20};

       System.out.println(cars[1]);
       System.out.println(myArray[1]);

       String newCars[] = new String[2];
       newCars [0] = "Suzuki";
       newCars [1] =  "Audi";

       System.out.println(newCars[0]);

       Integer myArrayInt[] = new Integer[2];
       myArrayInt [0] = 10;
       myArrayInt [1] = 20;

       System.out.println(myArrayInt[0]);
    }
}
