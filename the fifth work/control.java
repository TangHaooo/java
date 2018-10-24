package traffic;

import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		
		//用户输入相关数据
		System.out.println("请输入出发地，目的地和距离（公里）：（例如： 北京，上海，1226.2）");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine().toString().trim();
		
		try {
			String[] str = s.split("，");  //对字符串进行“，”的分割
		//赋值
		vehicle.startplace=str[0];
		vehicle.endplace=str[1];
		vehicle.distance=Double.valueOf(str[2]); 
		//检查距离输入是否为整数
		while(vehicle.distance<0){
			System.out.println("距离不对，退出程序，请重新输入距离：");
			Scanner sc1 = new Scanner(System.in);
			vehicle.distance=sc1.nextDouble();
			}		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("字符串输入格式不对(注意：使用中文逗号)");
		}
		
 		try  
  		{ 
  			//创建三个实例 
 			car carcase = new car(); 
  			aircraft airplanecase = new aircraft(); 
  			train traincase = new train(); 
  			//输出结果 
  			carcase.put(); 
  			airplanecase.put(); 
  			traincase.put(); 
  		} 
  		catch(Exception e) 
  		{ 
  			System.out.println(e.getMessage()); 
  		} 

	}

}
