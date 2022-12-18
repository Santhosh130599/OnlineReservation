package OnlineCourseReservation;

//Reservation.java
import java.util.Random;
class Reservation extends Student
{
public int i;
public int check_avail(int ci)
{
for(i = 0;i<3;i++)
{
if(ci==c_id[i])
{
if(avail_seats[i]>0)
{
return i ;
}
else

{
return -1;
}
}
}
return -1;
}
public void reg_confirm()
{
System.out.println("Enter the course id to register:");
int ci = s.nextInt();
int b=check_avail(ci);
if(b!=-1)
{
Random ran= new Random();
avail_seats[b]--;
System.out.println("Your Registration id :"+ran.nextInt(100));
System.out.println("Registration successfull");
}
}
public void cancel()
{
System.out.println("Enter course id:");
int cc = s.nextInt();
System.out.println("Enter your registration id:");
int rid=s.nextInt();
for(int j=0;j<3;j++)
{
if(cc == c_id[j])
{
avail_seats[j]++;
System.out.println("Cancellation successfull");
}
}
}
}
