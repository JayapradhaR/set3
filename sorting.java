import java.io.*;
class sorting
{
    public static void main(String args[])throws IOException
    {
        int n,i,j,temp;
        DataInputStream dis=new DataInputStream(System.in);
        n=Integer.parseInt(dis.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(dis.readLine());
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
