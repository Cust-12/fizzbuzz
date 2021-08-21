public class fizzbuzz 
{
    public static void main(String[] args) 
    {
        fizzbuzzMethod(100);    //call the method
    }
 
    private static void fizzbuzzMethod(int num) 
    {
        for (int i = 1; i <= num; i++) 
        {
            if ((i % 3 == 0) && (i % 5 == 0)) //if the number is divisible by 3 and 5
                System.out.println("fizzbuzz");
            else if (i % 3 == 0) //if the number is divisible by 3
                System.out.println("fizz");
            else if (i % 5 == 0) //if the number is divisble by 5
                System.out.println("buzz");
            else
                System.out.println(i); //else output the original number
        }
    }
}