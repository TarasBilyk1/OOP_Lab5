/*----------------------------------------------------
                        Завдання 4
-----------------------------------------------------*/
public class Ex_4
{
    public static void prtArr (int [] arr)
    {
        System.out.print("Масив - [ ");
        for (int i = 0 ; i < arr.length;i++)
        {
            System.out.print(arr[i] );
            if (i < arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ] ");

        int max = 0;

        for (int i = max ; i < arr.length;i++)
        {

            if (arr[i] > max )
            {
               max = arr[i] ;
            }
        }
        System.out.print("Максимальне значення масиву = " + max);
    }
    public static void main(String[] args)
    {
        int[] arry = { 1 , 8 , 388 , 4 , 5 } ;
        prtArr(arry);
    }
}

