package com.yuanzijian1;

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

//����
class Car2{
	
	//����Ĺ�������ʹ�ó�Ա��������	
	String name ; // ����

	String color; //����

	int wheel; //������
	
	//����Ĺ�����Ϊʹ�ú�������
	public void run(){
		if(wheel>=4){
			System.out.println(name+wheel+"�����ӷɿ�������..");
		}else{
			System.out.println(name+"����4�������ˣ��Ͽ�ȥ����");
		}
	}
}

//�޳���
class CarFactory{
	
	String name;//����
	
	String address ;	//��ַ
	
	String tel;	//�绰

	//�޳�������Ϊ ------ ����ֵ���͡� δ֪�Ĳ���
	public void repair(Car2 c){
		if(c.wheel>=4){
			System.out.println("�����㣬���˺ܴ������޺��ˣ���Ǯ");
		}else{
			c.wheel = 4;
			System.out.println("�޺��ˣ���Ǯ!!");	
		}
	}
}

class Demo2 
{
	public static void main(String[] args) 
	{	
		/*
		//0x98
		Car c = new Car();
		//��������������ֵ
		c.name = "½��";
		c.color = "��ɫ";
		c.wheel = 4;
		
		for(int i = 0 ; i<100 ; i++){
			c.run();
		}
		c.wheel = 3;
		c.run();

		//�����޳�������
		CarFactory f = new CarFactory();
		//���޳�����������ֵ
		f.name = "��Ⱥ���޳���";
		f.address = "��̩��ҵ�㳡һ¥";
		f.tel = "020-1234567";

		//�����޳����޳�
		f.repair(c);//0x98
		//
		c.run();
		*/

		//���� ����һ��repair������  ǰ�᣺ �ö��������һ������֮���������Ͳ���ʹ���ˡ�
		
	}
}
