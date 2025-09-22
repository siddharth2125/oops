public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[] {
            new Book("B1", "Intro to Java", "Author A"),
            new Magazine("M1", "Science Monthly", "Editor B"),
            new DVD("D1", "Movie X", "Director Y")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}
