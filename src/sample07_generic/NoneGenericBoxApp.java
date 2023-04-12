package sample07_generic;

public class NoneGenericBoxApp {

	public static void main(String[] args) {
		NoneGenericBox box1 = new NoneGenericBox();
		
		box1.setItem("홍길동");
		
		String value = (String) box1.getItem();

		System.out.println(value);
	}
}
