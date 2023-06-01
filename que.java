import java.util.ArrayList;
public class que
{
public static void main(String[] args)
{
ArrayList obj=new ArrayList();
obj.add("arpita");
obj.add("tejashwini");
obj.add("vinod");
obj.add("kiran");
obj.add("rajeshwari");
System.out.println(obj);
System.out.println(obj.indexOf("vinod"));
obj.remove("vinod");
System.out.println(obj);

}
}