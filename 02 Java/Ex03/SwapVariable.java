class SwapVariable
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
