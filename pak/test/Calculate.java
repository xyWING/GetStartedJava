package pak.test;

public class Calculate {
	//��Ա�����͹��춼������������洴���ģ����챾�����һ�֡���������
	double output; //��Ա������������ԣ�
	//���죨Ҳ���ڡ�����Methods����һ�֡��д������Ͳ����������ֹ��췽ʽ��ע�����ﻹ���Ƕ��󣬻�û��ʵ������
	//����������C�����нṹ��(struct)����Ĺ���
	//����������ͨ��newʵ�ֵģ���������ʱ����ù��췽��
	public Calculate(double output) {
		this.output = output;
	}
	
	//����һ���������������㡱��һ������
	public static double calculate(double input1, double input2, char opt){
		double result = 0; 
		switch (opt) { 
			case '+': result = input1 + input2; break;  //break��Ҫ��
			case '-': result = input1 - input2; break;
			case '*': result = input1 * input2; break;
			case '/': result = input1 / input2; break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		double input1 = 2;  //�ֲ����������ʼ������ʹ��
		double input2 = 0.5;
		char opt = '+';
		/*
		Calculate ca = new Calculate(0);
		ca.output = calculate(input1, input2, opt);
		System.out.println(ca.output);
		*/
		//��һ�ַ��������ö���
		System.out.println(calculate(input1, input2, opt));
	}
}
