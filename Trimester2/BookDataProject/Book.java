package BookDataProject;

public class Book {
    String title;
    String author;
    double ratings;
    int reviews;
    int price;
    int year;
    String genre;

    // right click, source action, generate constructor ==> generates the constructor on its own
    public Book(String title, String author, double ratings, int reviews, int price, int year, String genre) {
        this.title = title;
        this.author = author;
        this.ratings = ratings;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }
    // order of the constructor attribute is important, easier way to pass orders in the correct order
}

// read data from the file
// load the data of the books
// implement the given functions

// open the file and load the list of books
/*
 * file path
 * open the file present at the location
 * read the file line by line
 * line: "Self Discovery, Ms. Div, 4.2, 119, 899, philosophy"
 * String[] val: ["Self Discovery", "Ms. Div", "4.2", "119", "899", "philosophy"]
 * title = val[0];
 * author = val[1];
 * .
 * .
 * Book b = new Book (title, author, .....);
 * list.add(b);
 */
// implement the functions
// ArrayList<Book> list : <<book1>, <book2>, .....>



