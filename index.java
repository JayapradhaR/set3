import java.io.*;
class index
{
    public static void main(String args[])throws IOException
    {
        int n,i;
        DataInputStream dis=new DataInputStream(System.in);
        n=Integer.parseInt(dis.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(dis.readLine());
            System.out.println(a[i]);
            System.out.println("Index:"+ i);

        }
    }
}
