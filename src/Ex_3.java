/*----------------------------------------------------
                        Завдання 3
-----------------------------------------------------*/
import java.util.Scanner;
public class Ex_3
{
    public static void prtArr (int [] arr)
    {
        System.out.print(" Масив - [ ");
        for (int i = 0 ; i < arr.length;i++)
        {
            System.out.print(arr[i] );
            if (i < arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(" ] ");
    }


    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int[] arry = { 1 , 2 , 3 , 4 , 5 } ;
        prtArr(arry);

    }
}

