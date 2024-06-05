public class Book {
    private String bookCode;
    private String bookTitle;
    private String author;
    private String publishingYear;
    private String bookType;

    public Book() { }

    public Book(String bookCode, String bookTitle, String author, String publishingYear, String bookType) {
        this.bookCode = bookCode;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
        this.bookType = bookType;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String toString() {
        return "Book{" +
                "code: " + bookCode +
                ", title: " + bookTitle +
                ", author: " + author +
                ", publishing year: " + publishingYear +
                ", type: " + bookType + "}" ;
    }
}

