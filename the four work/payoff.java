package company;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class payoff {

	 static int a=0;
	 static int b=0;
	 static int c=0;
	 
	 static employee [] employeeArray = new employee[25];               //定义员工25个
     static manager [] managerArray = new manager[5];                   //定义经理5个
     static shareholder [] shareholderArray = new shareholder[5];      //定义股东5个
     
     static int s=10000000+(int)(Math.random()*(20000000-10000000));  //随机生成公司营业额（范围1000万至2000万）\
 	 static int bouns=s/5000;//经理奖金
 	 static int profit=s-25*10000-5*20000-5*30000;//利润
     
	public static void main(String[] args) {				
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null; 
		try {
			   	String str = "";
			   	fis = new FileInputStream("C:\\Users\\汤浩\\Desktop\\公司名单.txt");
			    isr = new InputStreamReader(fis); 
			    br = new BufferedReader(isr);
			    
			    //一行一行读取
			    while ((str = br.readLine()) != null) {
			    String[] str2=str.split("\\s+");    //对空格进行字符串分割,并获取各个部分
			    //分割的进行复制
			    String position=str2[0];
			    String name=str2[1];
			    int years=Integer.parseInt(str2[2]);
			    int month=Integer.parseInt(str2[3]);
			    int day=Integer.parseInt(str2[4]);
			    int stock=Integer.parseInt(str2[5]);
			    //判断职位，进行对象创建,并向相应数组中添加
			    	if(position.equals("employee")) //雇员
			    	{
			    		employeeArray[a]=new employee( name, years, month, day);
			    		a=a+1;
			    	}
			    	if(position.equals("manager"))//经理
			    	{		    	
			   			managerArray[b]=new manager( name, years, month, day);
			    		b=b+1;
			    	}
			   		if(position.equals("shareholder"))//股东
			    	{	
			   			shareholderArray[c]=new shareholder( name, years, month, day,stock);
			   			c=c+1;
			    	}			  
			   }			                                           
			  } catch (FileNotFoundException e) {
			   System.out.println("找不到指定文件");
			  } catch (IOException e) {
			   System.out.println("读取文件失败");
			  } finally {
			   try {
			     br.close();
			     isr.close();
			     fis.close();
			                       // 关闭的时候最好按照先后顺序关闭最后开的先关闭所以先关s,再关n,最后关m
			   } catch (IOException e) {
			    e.printStackTrace();
			   }
			  }
		////////////////////////////////////////////////////////////////////////////////////
		/////////////////////对各个职位工资股份所得进行输出
			   System.out.println("宇宙第一公司这个月公司营业额："+s+"元");
			   System.out.println("宇宙第一公司这个月公司利润："+profit+"元");
			   System.out.println("employee(雇员)：");
			   for(int i=0;i<(employeeArray.length-1);i++) {
				   System.out.print("编号："+(i+1)+"   ");
			   		employeeArray[i].getnamebirthday();
			   		employeeArray[i].getwage();
			   }
			   System.out.println("manage(经理)：");
			   for(int i=0;i<managerArray.length;i++) {
				   System.out.print("编号："+(i+1)+"   ");
				   managerArray[i].getnamebirthday();
				   System.out.print("奖金："+bouns);
				   managerArray[i].getwage();
			   }
			   System.out.println("shareholde(股东)：");
			   for(int i=0;i<shareholderArray.length;i++) {
				   System.out.print("编号："+(i+1)+"   ");
				   shareholderArray[i].getnamebirthday();
				   System.out.print("分红："+(profit*shareholderArray[i].stock/100));
				   shareholderArray[i].getwage();
			   }
	}
}
