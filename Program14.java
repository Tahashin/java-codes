class Program14
{
 public static void main(String args[])
 {
  int sum=1;
  for(int i=1;i<=5;i++)
  {			
   for(int j=1;j<=5;j++)
    {
      if(sum<10)
      {
       System.out.print("0");
       System.out.print(sum);
      sum++;
      }
     else
      {
       System.out.print(sum);
       sum++;
      }
    }
   System.out.println();
 } 
}
}   