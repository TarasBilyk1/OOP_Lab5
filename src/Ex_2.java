/*----------------------------------------------------
                        Завдання 2
-----------------------------------------------------*/
import java.util.Scanner;
public class Ex_2
{
    public static int  Number (int  x, int y ,int z )
    {
        int min ;
        min = x ;

        if ( y < min )
        {
            min = y;
        }
        if ( z < min )
        {
            min = z;
        }

        return min;

    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextByte();
        int num2 = scn.nextByte();
        int num3 = scn.nextByte();

        int res = Number(  num1, num2 , num3 );
        System.out.println("Найменше число, що повернув метод: " + res);
    }
}
