public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String t, String a) { this.itemId = id; this.title = t; this.author = a; }

    public abstract int getLoanDuration(); // days

    public void getItemDetails() {
        System.out.println("[" + itemId + "] " + title + " by " + author + " (loan days: " + getLoanDuration() + ")");
    }

    // Encapsulation
    public String getItemId() { return itemId; }
}
