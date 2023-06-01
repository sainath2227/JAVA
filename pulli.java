import java.util.Scanner;
 class assign extends Thread
{
 public void run(){
try{
Scanner obj=new Scanner(System.in);
System.out.println("Student is ready for taking test");
System.out.println("tell the chapter for the assigment");
int a=obj.nextInt();
System.out.println("Student Started assigment"+a);
{
for(int i=0;i<=a;i++)
{
System.out.println("CBIT");
}}
}
catch(Exception e)
{
e.printStackTrace();
}
}}
 class divi extends Thread
{
 public void run(){
try{
int b=200;
int c=20;
int d=b/c;
System.out.println("division Stated");
System.out.println(d);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
 class multi extends Thread
{
 public void run()
{
try{
int k=20;
int g=30;
int f=k*g;
System.out.println("multiplication started");
System.out.println(f);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
public class pulli extends Thread
{
public static void main(String[] args)
{
assign t=new assign();
divi p=new divi();
multi m=new multi();
t.start();
p.start();
m.start();
}
}

