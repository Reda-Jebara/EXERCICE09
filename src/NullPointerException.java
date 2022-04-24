public class NullPointerException
{
    public static void MyMethod (String str)
    {
        System.out.println(str.length());
    }


    public static void main(String[] arg)
    {
        try
        {
            String EX = null;
            MyMethod(EX);
        }


        catch (java.lang.NullPointerException e)
        {
            System.out.println("ERROR");
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

}
