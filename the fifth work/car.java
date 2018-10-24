package traffic;

public class car extends vehicle {
	
	@Override
	void TimePrice() {
		// TODO 自动生成的方法存根
		this.price=0.32;
		this.speed=100;
		time=distance/speed;
		money=price*distance;
	}
	void put() {
		TimePrice();
		System.out.println("汽车：所需时间："+String.format("%.2f",time)+"小时  价格："+String.format("%.2f",money));
	}

}
