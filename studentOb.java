public class studentOb{
private String name;
private int age;
private String department;
public studentOb(String studentname,int studentage,String studentdepartment);
{
name=studentname;
age=studentage;
department=studentdepartment;
}

public String getname(){
return name;}
public int getage(){
return age;}
public String getdepartment(){
return department;
}
public static void main(string[] args)
{
studentOb ob1=new studentOb("sai",20,"cse");
studentOb ob2=new studentOb("nath",20,"bipc");
{
System.out.println("studentname:"+ob1.getname());
System.out.println("studentage:"+ob1.getage());
System.out.println("studentdepartment:"+ob1.getdepartment());
}
}
}
