package pak.test;

import java.util.Scanner;

public class BissextileJudge {
	//�������
	//static int year = 2020; //��̬��������ͨ���������ʣ�ʵ������ֻ��ͨ������������

	public static boolean isBissextile(int year) {
		if ((year%4==0)&&(year%100!=0)||(year%400==0))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		//Ҳ����������ķ�ʽ��ȡ���
		System.out.println("Enter a year:");
		Scanner input = new Scanner(System.in); //����һ��scanner����input.�������ֻ��Ҫ����һ��
		int year = input.nextInt(); //���ö�������ķ���nextInt����ȡһ����ֵ������year
		//int year2 = input.nextInt();
		//int year3 = input.nextInt();
		
		if (isBissextile(year))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
