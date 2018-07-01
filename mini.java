import java.util.Scanner;
public class mini
{
    public static void main(String[] args) 
    {
        int n, min;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        min = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
