package sample07_generic;

public class GenericBoxApp {
	
	public static void main(String[] args) {
		
		GenericBox<String> box1 = new GenericBox<>();
		/*
		 *  class Generic<T>
		 *  	T item;
		 *  	T getItem() { return item; }
		 *  	void setItem(T item) { this.item = item; }
		 *  }
		 *  
		 *  실제 생성한 객체의 코드
		 *  class Generic<T>
		 *  	String item;
		 *  	String getItem() { return item; }
		 *  	void setItem(String item) { this.item = item; }
		 *  }
		 *  
		 */
		box1.setItem("홍길동");
//		box1.setItem(100); 	// 오류, 코딩과정에서 타입검사가 가능해진다. 
							// 지정한 타입에 맞지않는 객체는 저장할 수 없다. (타입 안정성 확보)
		
		String value = box1.getItem();	// 클래스 형변환 연산자가 필요없음
		System.out.println(value);
		
	}
}
