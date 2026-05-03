
class LibraryItem {
    private String title;
    private boolean isAvailable;

    public LibraryItem(String title) {
        this.title = title;
        this.isAvailable = true;
    }


    public String getTitle() {
        return title;
    }


    public void displayDetails() {
        System.out.println("Item: " + title + " | Available: " + isAvailable);
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title); 
        this.author = author;
    }
    @Override
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " by " + author);
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem generic = new LibraryItem("Generic Magazine");
        
        Book myBook = new Book("Java Programming", "BITS Faculty");

        System.out.println("--- Library Inventory ---");
        generic.displayDetails();
        myBook.displayDetails();
    }
}