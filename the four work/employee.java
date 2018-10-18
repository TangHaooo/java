package company;

public class employee {
	String name;
	int years,month,day;
	int wage=10000;
	public employee(String name,int y,int m,int d) {
		this.name=name;
		years=y;
		month=m;
		day=d;
	}
	public void getnamebirthday() {
		System.out.print("姓名："+name);
		System.out.print("     生日："+month+"月"+day+"日     "+years+"出生");
	}	
	public void getwage() {
		System.out.println("     工资："+wage+"元"+"      职位：员工（employee）");
	}
}
