public class EBook extends Book {
    private String fileSize;
    private String formatSize;

    public EBook() { }

    public EBook(String bookCode, String bookTitle, String author, String publishingYear, String bookType, String fileSize, String formatSize) {
        super(bookCode, bookTitle, author, publishingYear, bookType);
        this.fileSize = fileSize;
        this.formatSize = formatSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormatSize() {
        return formatSize;
    }

    public void setFormatSize(String formatSize) {
        this.formatSize = formatSize;
    }
    public void setEBook(String bookCode, String bookTitle, String author, String publishingYear, String bookType, String fileSize, String formatSize) {
        setBookCode(bookCode);
        setBookTitle(bookTitle);
        setAuthor(author);
        setPublishingYear(publishingYear);
        setBookType(bookType);
        setFileSize(fileSize);
        setFormatSize(formatSize);
    }
//    public String getEBook() {
//        this.
//    }
    public String toString() {
        return "Book{" +
                "code: " +  getBookCode() +
                ", title: " + getBookTitle() +
                ", author: " + getAuthor() +
                ", publishing year: " + getPublishingYear() +
                ", type: " + getBookType() +
                ", file size: " + fileSize +
                ", format size: " + formatSize + "}";
    }
}
