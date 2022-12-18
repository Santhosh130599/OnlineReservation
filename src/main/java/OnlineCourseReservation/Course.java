package OnlineCourseReservation;

//Course.java
class Course
{
public static int[] c_id = new int[]{1,2,3} ;
public static String[] c_name = new String[]{"CSE","IT","EIE"};
public static int tot_seats = 20;
public static int[] avail_seats=new int[]{20,20,20};
public void view_cour()
{
System.out.println("Course Name\t Course ID\t Total Seats\t Available Seats \n");
for(int i =0;i<3;i++)
{
System.out.println(c_name[i]+"\t\t "+c_id[i]+"\t\t "+tot_seats+"\t\t"+avail_seats[i]+"\n");
}
}
}
