import java.util.Scanner;
class Program4
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the size:");
int size=scan.nextInt();
for(int i=1;i<=size;i++)
{
for(int j=1;j<=5;j++)
{
if(i%2==0)
System.out.print(0);
else
System.out.print(1);
}
System.out.println();
}
}
}
