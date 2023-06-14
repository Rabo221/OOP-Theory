package Cls_Obj;

public class Department {

	private String deptName;
	private int deptCode;
	private String faculty;
	
	public static void main(String[] args)
	{
		Department x1=new Department();
		x1.deptCode=15;
		x1.deptName="CSE";
		x1.faculty="FIST";
		System.out.print("Dept name : " +x1.deptName+ "; Dept code : " +x1.deptCode+ "; Faculty : " +x1.faculty);
	}
}
