package setterandgetter;

public class Book {
	String BookName;
	String AuthorName;
	double price;
	

	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public String getAuthorName() {
		return AuthorName;
	}


	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static void main(String[] args) {
		Book b=new Book();
		b.setAuthorName("Abdul Kalam");
		b.setBookName("Wings of Fire");
		b.setPrice(180);
		
		System.out.println(b.getBookName());
		System.out.println(b.getAuthorName());
		System.out.println(b.getPrice());
		
		// TODO Auto-generated method stub

	}

}
