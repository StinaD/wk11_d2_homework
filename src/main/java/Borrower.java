import java.util.ArrayList;

public class Borrower {

    private int borrowerCapacity;
    private ArrayList<Book> bookCollection;

    public Borrower(int borrowerCapacity){
        this.borrowerCapacity = borrowerCapacity;
        this.bookCollection = new ArrayList<>();
    }

    public int numberOfBooksOnLoan(){
        return bookCollection.size();
    }

    public void borrowBookFromLibrary(Library library){
        if (bookCollection.size() < borrowerCapacity) {
            Book bookToBorrow = library.removeBook();
            bookCollection.add(bookToBorrow);
        }
    }


}
