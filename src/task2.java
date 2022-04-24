public class task2
{
    public static void main(String[]args)
    {
        MethodArith();
        System.out.println("@@@@@@@@########");
    }

    static void MethodArith()
    {
        try
        {
            int no = 1/0;
            System.out.println(no);
        }

        catch(ArithmeticException e)
        {
            System.out.println("U can't divide number / by zero ");
            System.out.println(e.toString());

        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No suck index in the array");
            System.out.println(e.toString());
        }

        finally
        {
            System.out.println("DONE");
        }
    }
}
