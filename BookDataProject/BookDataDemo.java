package BookDataProject;

import java.io.IOException;

public class BookDataDemo {
    public static void main(String[] args) throws IOException {
        BookRepo repo = new BookRepo("C:\\Users\\user\\OneDrive\\Desktop\\JavaCodes\\BookDataProject\\bestsellers with categories.csv");
        repo.printTitlesOfAllBooks();
    }
}
