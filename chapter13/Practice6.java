package chapter13;

public class Practice6 {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(5);
		ComparableCircle c2 = new ComparableCircle(10);
		
		ComparableCircle circle3 = (ComparableCircle)Max.max(c1, c2); //ʹ����ǿ������ת��
	    System.out.println("The max circle's radius is " + circle3.getRadius());
	    System.out.println(circle3);
	}
}

class Circle {
	public double radius;
	public String color;
	public boolean filled;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	
	public double getArea(double radius) {
		return Math.PI * radius * radius;
	}
}

/* 
 * java�Ѿ��ṩ��Comparable�ӿ�
 * 
 * public interface Comparable<E> {
 * 		public int compareTo(E o);
 * }
 * 
 */

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	// <T> ��T�͡�,��ȡ����<>��ʵ��������ߵ�types
	// ArrayList<Integer>,��Integer��ArrayList
	
	// ���Ǹ����췽��
	public ComparableCircle(double radius) {
	    super(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public int compareTo(ComparableCircle o) {
		if (getRadius() > o.getRadius())
			return 1;
		else if (getRadius() < o.getRadius())
			return -1;
		else
			return 0;
	}
}

class Max {
	// ComparableCircle�Ƿ������ͣ�max�Ƿ�����
	public static ComparableCircle max (ComparableCircle o1, ComparableCircle o2) {
		if (o1.compareTo(o2) > 0)  //to get o1's radius and compare to o2's radius
			return o1;
		else
			return o2;
	}
}