import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.booksByGenre = new HashMap<>();
    }

    public int countBooks(){
        return books.size();
    };

    public int totalCapacity(){
        return capacity;
    }

    public void addBook(Book book) {
        if (books.size() < capacity) {
            books.add(book);
            if (booksByGenre.containsKey(book.getGenre())){
                String genre = book.getGenre();
                booksByGenre.replace(genre, booksByGenre.get(genre) + 1);
            } else {
                String genre = book.getGenre();
                booksByGenre.put(genre, 1);
            }
        }
    }

    public int numberOfBooksByGenre(String genre){
        if (booksByGenre.containsKey(genre)) {
            return booksByGenre.get(genre);
        }
        return 0;
    }


    public Book removeBook(){
        return books.remove(0);
    };


}
