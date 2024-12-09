package BookDataProject;

import java.io.IOException;
import java.util.ArrayList;

public class BookRepo {
    ArrayList<Book> bookList;

    public BookRepo (String filePath) throws IOException{
        CSVDataLoader dl = new CSVDataLoader(filePath);
        bookList = dl.loadBookList();
    }
    public void printTitlesOfAllBooks(){
        for (int i = 0; i<bookList.size(); i++){
            System.out.println(bookList.get(i).title);
        }
    }
}
