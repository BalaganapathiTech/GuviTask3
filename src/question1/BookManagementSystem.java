package question1;

import java.util.Scanner;

class Book{

	int bookID;
	String title;
	String author;
	boolean isAvailable;
	
	public Book(int bookID, String title2,String author) {
		this.bookID=bookID;
		this.title=title2;
		this.author=author;
		
		}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

class Library{
	
	private Book[] books;
	public Library() {
		
		this.books=new Book[5];
	}
	
	public void addBook(Book book) {
		
		for(int i=0;i<books.length;i++) {
			if(books[i]==null) {
				books[i]=book;
				System.out.println("Book added succesfully");
				return;
			}
		System.out.println("Library is full.can't add more books");
		}
	}
	public void removeBook(int bookID) {
		for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                books[i] = null;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
		
	}
	
	public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book ID: " + book.getBookID() + ", Title: " +book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }
	
	public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }
	}

public class BookManagementSystem {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); {
			Library library=new Library();
			
			while (true) {
				System.out.println("1.Add Book");
				System.out.println("2.Remove Book");
				System.out.println("3.Search Book");
				System.out.println("4.Display the Boook");
				System.out.println("5.Exite");
				System.out.println("Enter Your Choice");
				int choise=sc.nextInt();
				sc.nextLine();
				
				switch(choise) {
				
				case 1:
					System.out.println("Enter Book Id");
					int bookID =sc.nextInt();
					sc.nextInt();
					System.out.println("Enter book title");
					String title=sc.nextLine();
					sc.nextLine();
					System.out.println("Enter author name");
					String author=sc.nextLine();
			        library.addBook(new Book(bookID,title,author));
			        break;
				case 2:
					System.out.println("Enter Book id to remove Book");
					int removeID=sc.nextInt();
					sc.nextLine();
					library.removeBook(removeID);
					break;
				case 3:
					System.out.println("Enter BookId to search");
					int SearchID=sc.nextInt();
					sc.nextLine();
					Book foundBoook=library.searchBook(SearchID);
					if(foundBoook!=null) {
						System.out.println("Book Found");
						System.out.println("Title"+foundBoook.getTitle());
						System.out.println("Author"+foundBoook.getAuthor());
					}else {
						System.out.println("Book Not Found");
					}
					break;
				case 4:
					library.displayBooks();
					break;
				case 5:
					System.out.println("Exiting...");
					System.exit(0);
					default:
						System.out.println("Invalid Choice");
				}
				
				sc.close();	
			}
		}
	}
}