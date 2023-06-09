package sample04_wrapper;

public class WrapperApp1 {
	
	public static void main(String[] args) {
		// 오토박싱
		// 기본자료형 값을 참조자료형 타입의 변수에 대입하면
		// 해당 타입의 Wrapper객체를 생성하고, Wrapper객체에 기본자료형값을 담고,
		// 그 객체의 주소값을 변수에 대입시킨다.
		Boolean a = true;		// Boolean a = new Boolean(true);
		Character b = 'a';
		Integer c = 10;
		Long d = 10000000L;
		Double e = 3.14;

		// 변수의 타입이 Object인 경우에도 해당 타입의 Wrapper객체가 생성되어 대입된다.
		// 참조변수는 실제 생성한 Wrapper객체의 부모객체인 Object객체를 참조한다.
		Object a1 = true;
		Object b1 = 'a';
		Object c1 = 10;
		Object d1 = 10000000L;
		Object e1 = 3.14;
		
		System.out.println(a);	// Boolean에 재정의된 toString() 반환값이 출력된다.
		System.out.println(b);	// ''
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
	}
}
