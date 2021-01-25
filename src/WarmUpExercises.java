public class WarmUpExercises
{
    public static void main(String[]args)
    {
        /*for(int i=100;i>=0;i=i-5)
        {
            System.out.println(i);
        }*/
        /*for(int i=0;i<=100;i=i+10)
        {
            System.out.println(i);
        }*/
        for(int i=0;i<=100;i=i+10)
        {
            if(i%20==0)
            {
                System.out.println(i + " - Java");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
