package company;

public class shareholder extends employee {
	int wage=30000;
	int stock;
	public shareholder(String name, int y, int m, int d,int stock) {
		super(name,y,m,d);
		this.stock=stock;
		// TODO 自动生成的构造函数存根
	}
	public void getwage() {
		System.out.println("     工资："+this.wage+"元"+"      职位：股东（shareholder）");
	}
}
