package Section_9_exercises;

public abstract class ListItem_ex49 {
    protected ListItem_ex49 leftLink, rightLink;
    protected Object value;

    public ListItem_ex49(Object value) {
        this.value = value;
        this.leftLink = null;
        this.rightLink = null;
    }
    abstract ListItem_ex49 next();
    abstract ListItem_ex49 setNext(ListItem_ex49 item);
    abstract ListItem_ex49 setPrevious(ListItem_ex49 item);
    abstract ListItem_ex49 previous();
    abstract int compareTo(ListItem_ex49 item);
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
