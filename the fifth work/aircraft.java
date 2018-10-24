package traffic;

public class aircraft extends vehicle {

	@Override
	void TimePrice() {
		// TODO 自动生成的方法存根
		this.price=0.75;
		this.speed=600;
		this.time=distance/speed;
		this.money=price*distance;
	}
	void put() {
		TimePrice();
		System.out.println("飞机：所需时间："+String.format("%.2f",time)+"小时  价格："+String.format("%.2f",money));
	}

}
