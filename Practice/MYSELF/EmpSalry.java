package Practice.MYSELF;

public class EmpSalry {
	public static void main(String[] args) {
		
	
	double grosssalary=100000;
	double incometax=1000;
	double providentfunt=1500;
	double professionaltax=500;
	double netsalary=grosssalary-(incometax+providentfunt+professionaltax);
	System.out.println("Employee netsalary:"+netsalary);

}
}