package sample03_string;

import java.util.StringTokenizer;

public class StringTokenizerApp2 {

	public static void main(String[] args) {
		
		// String의 split메소드와 StringTokenizer의 차이점
		
		String text1 = "김유신, 영업2팀, 과장, 010-1111-1111";
		String text2 = "강감찬,,인턴,010-2222-2222";
		
		// spilt method
		System.out.println("### split method로 문자열 자르기");
		String[] value1 = text1.split(",");
		String[] value2 = text2.split(",");
		System.out.println("첫번째 문자열의 토큰갯수 -> " + value1.length);
		System.out.println("두번째 문자열의 토큰갯수 -> " + value2.length);
		
		// StringTokenizer 
		System.out.println("### StringTokenizer로 문자열 자르기");
		StringTokenizer tokenizer1 = new StringTokenizer(text1,",");
		StringTokenizer tokenizer2 = new StringTokenizer(text2,",");
		System.out.println("첫번째 문자열의 토큰갯수 -> " + tokenizer1.countTokens());
		// StringTokenizer는 구분기호로 값이 나누어져 있더라도 값이 없다면 토큰으로 생성하지 않는다.(해당문자만)
		System.out.println("두번째 문자열의 토큰갯수 -> " + tokenizer2.countTokens());
		
		
	}
}
