package sample05_math;

// static import를 사용할 경우 앞에 클래스를 붙이지 않고서도 메소드를 사용할 수 있다.
// 예시) Math.abs() --> abs()
/*
 *	정적 import 구문 (java 5버전 부터 지원)
 *		- static 변수, static 메소드, static 내부 클래스를 import 시킨다.
 *		- static import 구문으로 포함시킨 변수, 메소드, 내부클래스는 클래스이름 없이 사용할 수 있따.
 *		- 예시
 *			* Math 클래스의 정적메소드 abs를 import
 *				import static java.lnag.Math.abs;
 *				수행문에서 사용하기
 *					int a = abs(-100);
 *			* Math 클래스의 모든 정적 구성요소를 import한다.
 *				import static java.lang.Math.*;
 *				수행문에서 사용
 *					int a = abs(-100);
 *					int m = max(100, 90);				
 */
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.random;

public class MathApp1 {

	public static void main(String[] args) {
		// Math클래스의 주요 메소드
		
		// 절대값을 반환하는 메소드
//		Math.abs(double value), Math.abs(int value), Math.abs(long value)
		int value1 = abs(100);
		int value2 = abs(-100);
		double value3 = abs(3.14);
		double value4 = abs(-3.14);
		System.out.println("절대값1 -> " + value1);
		System.out.println("절대값2 -> " + value2);
		System.out.println("절대값3 -> " + value3);
		System.out.println("절대값4 -> " + value4);
		
		// 큰 값을 반환하는 메소드
		int value5 = max (100, 20);
		double value6 = max (2.145, 10.4);
		double value7 = max (10.4, 20);
		
		System.out.println("큰값1 -> " + value5);
		System.out.println("큰값2 -> " + value6);
		System.out.println("큰값3 -> " + value7);
		
		
		// 작은 값을 반환하는 메소드
		int value8 = min (100, 20);
		double value9 = min (2.145, 10.4);
		double value10 = min (10.4, 20);
		
		System.out.println("작은값1 -> " + value8);
		System.out.println("작은값2 -> " + value9);
		System.out.println("작은값3 -> " + value10);
		
		// 반올림된 값을 반환하는 메소드
		long value11 = round (3.14);
		long value12 = round (10.5);
		
		System.out.println("반올림값1 -> " + value11);
		System.out.println("반올림값2 -> " + value12);
		
		// 천장값을 반환하는 메소드
		double value13 = ceil(3.0);
		double value14 = ceil(3.2);
		double value15 = ceil(3.5);
		double value16 = ceil(3.6);
		
		System.out.println("ceil값 -> " + value13);
		System.out.println("ceil값 -> " + value14);
		System.out.println("ceil값 -> " + value15);
		System.out.println("ceil값 -> " + value16);
		
		
		
		// 바닥값을 반환하는 메소드
		double value17 = floor(3.0);
		double value18 = floor(3.2);
		double value19 = floor(3.5);
		double value20 = floor(3.6);
		
		System.out.println("floor값 -> " + value17);
		System.out.println("floor값 -> " + value18);
		System.out.println("floor값 -> " + value19);
		System.out.println("floor값 -> " + value20);
		
		// 난수(0 <= X < 1)를 반환하는 메소드
		// (int) (random()*N) : 0보다 크거나 같고 N보다 작은 정수를 반환한다.
		// (int) (random()*N) + 1 : 1보다 크거나 같고 N보다 작거나 같은 정수를 반환한다.
		System.out.println("난수 -> " + (int)(random()*10));
		System.out.println("난수 -> " + random()*100);
		System.out.println("난수 -> " + random()*1000);
	}
}
