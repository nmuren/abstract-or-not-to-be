package abstract_book;

abstract class AbsBookClass {

    String title;
    String author;

    AbsBookClass(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

}
