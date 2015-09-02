import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator= new Random();
       int dieValue =generator.nextInt(6);
       dieValue += 1
       System.out.println(dieValue);
    }
}
        