package com.yuanzijian6;

/*
���� ʹ��java������һ���������࣬�������߱�������1�� ������2 ���������������� ������
�����߱�����Ĺ�����Ϊ�� 

Ҫ�� ����ֱ�ӶԲ�����1��������2���������Щ���Խ���ֱ�� �ĸ�ֵ��Ҫ��װ������ (+ - * /  )

���������ṩget����set������

	��Ҫ�ṩset����
*/

class Calculator{
	
	private int num1;
	
	private int num2;
	
	private char option;
	
	public void initCalulator(int n1, int n2, char o){
		num1 = n1;
		num2 = n2;
		
		if (o=='+'||o=='-'||o=='*'||o=='/') {
			option = o;
		} else {
			option = '+';
		}
	}
	
	public void calculate(){
		switch(option){
			case '+':
				System.out.println("���ӷ�����,����ǣ�"+(num1+num2));
				break;
			case '-':
				System.out.println("����������,����ǣ�"+(num1-num2));
				break;
			case '*':
				System.out.println("���˷�����,����ǣ�"+(num1*num2));
				break;
			case '/':
				System.out.println("����������,����ǣ�"+(num1/num2));
				break;
		}
	}
}

public class Demo6 {
	public static void main(String[] args) {
		//������һ������������
		Calculator c = new Calculator();
		//��������ֵ
		c.initCalulator(1,2,'a');
		//���ü������ļ��㹦��
		c.calculate();
	}
}
