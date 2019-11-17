package abstract_book;

class MyAbsBook extends AbsBookClass {

    private double price;

    MyAbsBook(String title, String author, double price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title
                + "\nAuthor: " + author
                + "\nPrice: " + price);
    }

}

class MyBook extends BookClass {

    private double price;

    MyBook(String title, String author, double price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println(super.toString() + "\nPrice: " + price);
    }

}

public class Abstract_Book {

    public static void main(String[] args) {

        AbsBookClass newAbsBook = new MyAbsBook(
                "Hamlet",
                "William Shakespeare",
                10.0);
        newAbsBook.display();

        System.out.println("");

        BookClass newBook = new MyBook(
                "Much Ado About Nothing",
                "William Shakespeare",
                12.5);
        newBook.display();
    }

}
