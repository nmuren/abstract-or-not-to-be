package abstract_book;

class BookClass {

    private String title;
    private String author;

    BookClass(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title
                + "\nAuthor: " + author);
    }

    @Override
    public String toString() {
        return ("Title: " + title
                + "\nAuthor: " + author);
    }

}
