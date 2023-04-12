package sample01_object;

public class SampleApp {

	public static void main(String[] args) {
		
		Sample sample = new Sample(100, "홍길동");
		Sample sample2 = new Sample(200, "김유신");
		
		// toString() 메소드를 실행해서 객체에 대한 간단한 정보를 반환받을 수 있다.
		System.out.println("toString -> "+ sample.toString());
		System.out.println("toString -> "+ sample);
		
		// hashCode() 메소드를 실행해서 객체의 해시코드값을 반환받을 수 있다.
		/*
		 *  해시코드 : 해시 알고리즘에 의해서 생성되는 정수값이다.
		 *  	- 해시 알고리즘에 의해서 생성되는 정수값
		 *  	- 두 객체가 서로 같은 객체면, 두 객체의 해시코드값은 동일하다.
		 *  	- 두 객체가 서로 다른 객체면, 두 객체의 해시코드값은 서로 다른값을 반환하는것이 좋다. (같아도 상관없음.)
		 */
		int hash = sample.hashCode();
		int hash2 = sample2.hashCode();
		System.out.println("해시코드 -> " + hash);
		System.out.println("해시코드 -> " + hash2);
	}
}
