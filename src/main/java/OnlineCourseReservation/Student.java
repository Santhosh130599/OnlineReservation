package OnlineCourseReservation;

//Student.java
import java.util.Scanner;
class Student extends Course
{
public String st_name;
public String addr,email;
public long mob;
Scanner s = new Scanner(System.in);

public void reg_course()
{
System.out.println("Enter Name : ");
st_name = s.nextLine();
System.out.println("Enter Address : ");
addr=s.next();
System.out.println("Enter Email : ");
email=s.next();
System.out.println("Enter Mobile number : ");
mob=s.nextLong();
Reservation r = new Reservation();
r.reg_confirm();
}
}
