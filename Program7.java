import java.util.Scanner;
class Program7
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the size:");
int size=scan.nextInt();
int count;
for(int i=1;i<=size;i++)
{
 count=i;
for(int j=1;j<=size;j++)
{
System.out.print(" " +count);
count=count+5;
}
System.out.println();
}
}
}
