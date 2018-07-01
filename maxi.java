import java.util.Scanner;
public class maxi
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
