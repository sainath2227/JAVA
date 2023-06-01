class sai
{
void run(){
for(int i=0;i<=5;i++)
{
System.out.println("Single Thread");
}}

public class single extends sai
{
public static void main(String[] args)
{
Thread t=Thread.currentThread();
t.start();
}
}
}
//for(int i=0;i<=5;i++)
//{
//System.out.println("Single Thread");
//}
//}
//}