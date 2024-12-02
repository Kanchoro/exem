package library;

import enums.LibraryType;

public class library {
    private String name;
    private String address;
    private int numberOfBook;
    private String librarian;
    private LibraryType libraryType;
    private long id;

    private static long id2=0;

    public library() {
        this.id=++id2;
    }

    public library(String name, String librarian, int numberOfBook, String address, LibraryType libraryType) {
        this.id=++id2;
        this.name = name;
        this.librarian = librarian;
        this.numberOfBook = numberOfBook;
        this.address = address;
        this.libraryType = libraryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public LibraryType getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(LibraryType libraryType) {
        this.libraryType = libraryType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "library" +
                "\nid: "+ id+
                "\nname: " + name +
                "\naddress: " + address +
                "\nnumberOfBook: " + numberOfBook +
                "\nlibrarian: " + librarian +
                "\nlibraryType: " + libraryType
                ;
    }
}
