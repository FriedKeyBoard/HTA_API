package sample08_list;

import java.util.*;

public class BookApp2 {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		// 동일한 책번호를 가진 책정보는 같은 객체로 보고 저장되지 않게 하자.
		// Book 클래스에서 hashCode()와 equals(Object o)메소드를 재정의한다.
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(104, "혼자 공부하는 파이썬", "윤인성", 35000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		books.add(new Book(103, "Do it! 점프 투 파이썬", "박응용", 18000));
		books.add(new Book(105, "모던 자바 스크립트", "이웅모", 42000));
		
		// List객체에 저장된 책정보를 제목을 기준으로 정렬 
//		Collections.sort(books);
		// List객체에 저장된 책정보를 가격을 기준으로 정렬
//		Collections.sort(books, (b1,b2) -> b1.getPrice() - b2.getPrice());
		// List객체에 저장된 책정보를 저자명을 기준으로 정렬시키기
//		Collections.sort(books, (b1,b2) -> b1.getWriter().compareTo(b2.getWriter()));
		// List객체에 저장된 책정보를 가격순을 기준으로 정렬시키고, 가격이 동일하면 제목순으로 정렬
		Collections.sort(books, (b1,b2) ->{
			int gap = b1.getPrice() - b2.getPrice();
			if(gap == 0) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
			return gap;
		});
//		Collections.sort(books, new Comparator<Book>() {
//			public int compare(Book o1, Book o2) {
//				int gap = o1.getPrice() - o2.getPrice();
//				if(gap == 0) {
//					return o1.getTitle().compareTo(o2.getTitle());
//				}
//				return gap;
//			}
//		});
		
		for (Book book : books) {
			System.out.println(book.getNo());
			System.out.println(book.getTitle());
			System.out.println(book.getWriter());
			System.out.println(book.getPrice());
			System.out.println();
			
		}
	}
}
