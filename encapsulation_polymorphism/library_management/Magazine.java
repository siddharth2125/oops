public class Magazine extends LibraryItem {
    public Magazine(String id, String t, String a) { super(id, t, a); }
    @Override public int getLoanDuration() { return 7; }
}
