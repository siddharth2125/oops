public class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(String id, String t, String a) { super(id, t, a); }
    @Override public int getLoanDuration() { return 21; }
    @Override public boolean reserveItem(String userId) { if (available) { available = false; return true; } return false; }
    @Override public boolean checkAvailability() { return available; }
}
