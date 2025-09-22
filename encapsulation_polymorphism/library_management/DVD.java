public class DVD extends LibraryItem {
    public DVD(String id, String t, String a) { super(id, t, a); }
    @Override public int getLoanDuration() { return 3; }
}
