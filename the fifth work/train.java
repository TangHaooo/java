package traffic;

public class train extends vehicle {

	@Override
	void TimePrice() {
		// TODO 自动生成的方法存根
		this.price=0.45;
		this.speed=300;
		time=distance/speed;
		money=price*distance;
	}
	void put() {
		TimePrice();
		System.out.println("火车：所需时间："+String.format("%.2f",time)+"小时  价格："+String.format("%.2f",money));
	}


}
