class Book1 extends Document {
    private String isbn;

    public Book(String id, String title, String author, String isbn) {
        super(id, title, author);
        this.isbn = isbn;
    }
    @Override
    public void printInfo() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", ISBN: " + isbn +
                ", Available: " + isAvailable());
    }
}
