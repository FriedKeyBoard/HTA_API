package sample07_generic;

public class GenericWildCardApp {
	
	public static void main(String[] args) {
		/*
		 *  제네릭 와일드카드
		 *  <?>
		 *  <? extends 타입>
		 *  <? super 타입>
		 *  - 제네릭 와일드카드는 메소드의 매개변수, 메소드의 반환타입에 사용한다.
		 *  - 클래스나 인터페이스의 타입 파라미터로 사용할 수 없다.
		 *  	public class Box<?>{
		 *  	
		 *  	}
		 *  	public class Box<? extends type> {
		 *  		
		 *  	}
		 *  	public class Box<? super type> {
		 *  	
		 *  	} 
		 *  	위 세가지 경우 모두 오류
		 *
		 *  <?>
		 *  	비한정 와일드 카드
		 *  	모든 타입이 가능하다.
		 *  <? extends 타입>
		 *  	상한 경계 와일드 카드
		 *		상위 클래스를 제한한다.(타입과 그 하위타입만 가능)  
		 *  
		 *  <? super 타입>
		 *  	하한 경계 와일드 카드
		 *		하위 클래스를 제한한다.(타입과 그 상위타입만 가능)  
		 */
		
		// 배열
//		Object[] arr1 = new Integer[10];
		
		// 제네릭클래스
//		GenericBox<Object> box1 = new GenericBox<Integer>();
		
		test4(new GenericBox<Phone>());
		test1(new GenericBox<SmartPhone>());
//		test2(new GenericBox<String>());
		test3(new GenericBox<Integer>());
		test4(new GenericBox<FeaturePhone>());
		
		
	}
	
	// GenericBox객체의 타입 파라미터가 무엇이든 상관없다.
	public static void test1(GenericBox<?> box) {
		
	}
	// GenericBOx 객체의 타입파라미터가 Phone이거나 Phone의 하위타입인 것만 전달받을 수 있다.
	public static void test2(GenericBox<? extends Phone> box) {
		// 상한제한
	}
	// GenericBox 객체의 타입 파라미터가 Number거나 Number의 하위타입인것만 전달받을 수 있다.
	public static void test3(GenericBox<? extends Number> box) {
		
	}
	// GenericBox객체의 타입 파라미터가 FeatruePhone이거나 FeaturePhone 상위타입인 것만 전달받을 수 있다.
	public static void test4(GenericBox<? super FeaturePhone> box) {
		
	}
}
