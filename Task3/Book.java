package Task3;

public class Book {

    private String title;

    private String author;

    private Boolean available;

    public Book(String title, String author, Boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public Book() {
        this("","",false);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название: \"").append(title)
            .append("\", автор ").append(author);
        if (available) sb.append(", книга доступна");
        else sb.append(", книга не доступна");
        System.out.println(sb.toString());
    }

}
