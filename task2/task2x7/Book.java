package task2x7;

public class Book {
    private String author;
    private String name;
    private int year;
    private int cnt; //количество страниц

    public Book(String author, String name, int year, int cnt) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.cnt = cnt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "Book {Author=" + author + ", Name=" + name + ", Year=" + year + ", Cnt=" + cnt + "}";
    }
}