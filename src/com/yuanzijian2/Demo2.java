package com.yuanzijian2;

/*
���� ʹ��java����һ�������޳���������� ���߱��Ĺ�������:�������� ���֡� ��ɫ ����
�߱��ܵĹ�����Ϊ����֮ǰҪ��������Ƿ�������4�������������4������ôҪ�͵��޳�������
�޳�������֮�󣬳���������Ҫ������4���� Ȼ�󳵾ͼ�������������

�޳����� �߱��������ԣ� ���֡� ��ַ�� �绰��
		 ��������Ϊ�� �޳���
��ѧ�ߵľ������
	1. ������ͬһ��������(������)���ǿ���ֱ�ӷ��ʵġ�
	2. ���һ����Ҫ��������һ�������ʱ����ô��ʱ���ֻ��ͨ������������з��ʡ���������Ŀǰ��ȷ��
*/

class Car{
	
	String name;
	
	String Color;
	
	int wheel;
	
	public void run(){
		if (wheel >= 4) {
			System.out.println(name + wheel + "�������ӷɿ�������");
		} else {
			System.out.println("�����ĸ������ˣ��Ͽ�ȥ����");
		}
	}
}
class CarFactory{
	
	String name;
	
	String color;
	
	String tel;
	
	public void repair(Car c){
		if (c.wheel >= 4) {
			System.out.println("�����㣬���˺ܴ�����������");
		} else {
			c.wheel = 4;
			System.out.println("�޺���");
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "lufeng";
		c.Color = "��ɫ";
		c.wheel = 8;
//		for(int i = 0 ; i<100 ; i++){
//			c.run();
//		}
		c.run();
	}
}
