package abstract_book;

abstract class AbsBookClass {

    private final String title;
    private final String author;

    AbsBookClass(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    abstract void display();

}
