public class Book {
    private final String title;
    private final int pageNumber;
    private final int publicationYear;

    public Book(String title, int pageNumber, int publicationYear) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return title + ", " + pageNumber + " pages, " + publicationYear;
    }
}
