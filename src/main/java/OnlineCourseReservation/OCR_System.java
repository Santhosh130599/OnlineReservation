package OnlineCourseReservation;

//OCR_System.java
import java.util.Scanner;
public class OCR_System extends Reservation
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Student st = new Student();

int a;
do
{ st.view_cour();
System.out.println("1.Register\n2.Cancel\n3.Exit\n");
System.out.println("Enter your choice : ");
a=sc.nextInt();
switch(a)
{
case 1:
st.reg_course();
break;
case 2:
Reservation res=new Reservation();
res.cancel();
break;
}
}while(a!=3);
}
}
