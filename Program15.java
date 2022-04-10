import java.util.Scanner;
class Program15
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the size:");
int size=scan.nextInt();
int count=size*size;
for(int i=1;i<=size;i++)
{
for(int j=1;j<=size;j++)
{
System.out.print(count);
count--;
}
System.out.println();
}
}
}
