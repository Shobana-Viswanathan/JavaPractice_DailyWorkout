/*
 * Employee Attendance Management System
 * This system records and manages employee check-in and check-out activities.
 * It ensures secure handling of attendance data and prevents invalid operations.
 */

package hands_on_oops;
import java.time.LocalTime;

class Employee{
	private int empid;
	private String empname;
	Employee(int empid,String empname){
	   this.empid=empid;
	   this.empname=empname;
	}
	public void  markCheckIn(Attendance attendance){
		 attendance.markCheckIn();
	}
	public void markCheckOut(Attendance attendance) {
		 attendance.markCheckOut();
	}
	
}


class Attendance{
	private int empid;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	Attendance(int empid){
		this.empid=empid;
		
	}
	public void  markCheckIn() {
		 if (!isCheckedIn) {
	            checkInTime = LocalTime.now();
	            isCheckedIn = true;
	            System.out.println("Checked in at: " + checkInTime);
	        } else {
	            System.out.println("Already checked in!");
	        }
	}
	public void markCheckOut() {
		 if (isCheckedIn && !isCheckedOut) {
	            checkOutTime = LocalTime.now();
	            isCheckedOut = true;
	            System.out.println("Checked out at: " + checkOutTime);
	        } else if (!isCheckedIn) {
	            System.out.println("Cannot check out without checking in!");
	        } else {
	            System.out.println("Already checked out!");
	        }
	}
	public void getAttendanceDetails() {
		System.out.println("Employee ID:"+empid);
		String empname = null;
		System.out.println("Employee Name:"+ empname);
	}
	
	
}
		
public class EmployeeAttendanceManagement {
	public static void main(String[] args) {
    Employee emp1=new Employee(101,"Shobana");
    Attendance attendance1=new Attendance(101);
    emp1.markCheckIn(attendance1);
    emp1.markCheckOut(attendance1);

	}

}
