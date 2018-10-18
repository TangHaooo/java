package company;

public class manager extends employee {

	int wage=20000;
	public manager(String name, int y, int m, int d) {
		super(name,y,m,d);
		// TODO 自动生成的构造函数存根
	}
	public void getwage() {
		System.out.println("     工资："+this.wage+"元"+"      职位：经理（manager）");
	}

}
