import Demo.Ebook;

public class Library {
    final int MAX_LIMIT = 1000;
    private EBook[] eBooks = new EBook[MAX_LIMIT];
    private int count =0;
    public int getCount() {
        return count;
    }
    public boolean addEBook(EBook eBook) {
        if (this.count >= MAX_LIMIT)
            return false;
        this.eBooks[count++] = eBook;
        return true;
    }
    public EBook findEbookByCode(String bookCode) {
        for (int i = 0; i < this.count; i++) {
            if (this.eBooks[i].getBookCode().equals(bookCode))
                return this.eBooks[i];
        }
        return null;
    }
    public EBook findEbookByTitle(String bookTitle) {
        for (int i=0; i<this.count; i++) {
            if (this.eBooks[i].getBookTitle().equals(bookTitle))
                return this.eBooks[i];
        }
        return null;
    }
//    public EBook removeEbookByCode(String delBook) {
//        for (int i=0; i<this.count; i++) {
//            if (this.eBooks[i].getBookCode().equalsIgnoreCase(delBook)) {
//
//            }
//        }
//    }
    public void display() {
        for (EBook eBook: eBooks) {
            System.out.println(eBook.toString());
        }
    }
}
