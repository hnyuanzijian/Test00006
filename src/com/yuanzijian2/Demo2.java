package com.yuanzijian2;

/*
需求： 使用java描述一个车与修车厂两个事物， 车具备的公共属性:轮子数、 名字、 颜色 ，还
具备跑的功能行为。跑之前要检测轮子是否少于了4个，如果少于了4个，那么要送到修车厂修理，
修车厂修理之后，车的轮子数要补回来4个。 然后车就继续的跑起来。

修车厂： 具备公共属性： 名字、 地址、 电话。
		 公共的行为： 修车。
初学者的经典错误：
	1. 变量在同一个作用域(大括号)上是可以直接访问的。
	2. 如果一个类要访问另外一个类变量时，那么这时候就只能通过创建对象进行访问。（仅对于目前正确）
*/

class Car{
	
	String name;
	
	String Color;
	
	int wheel;
	
	public void run(){
		if (wheel >= 4) {
			System.out.println(name + wheel + "各类轮子飞快跑起来");
		} else {
			System.out.println("不够四个轮子了，赶快去修理");
		}
	}
}
class CarFactory{
	
	String name;
	
	String color;
	
	String tel;
	
	public void repair(Car c){
		if (c.wheel >= 4) {
			System.out.println("告诉你，费了很大力气，给我");
		} else {
			c.wheel = 4;
			System.out.println("修好了");
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "lufeng";
		c.Color = "黑色";
		c.wheel = 8;
//		for(int i = 0 ; i<100 ; i++){
//			c.run();
//		}
		c.run();
	}
}
