package Section_9_exercises;

public class Node_ex49 extends ListItem_ex49 {
    public Node_ex49(Object value) {
        super(value);
    }



    @Override
    ListItem_ex49 next() {
        return this.rightLink;
    }

    @Override
    ListItem_ex49 setNext(ListItem_ex49 item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem_ex49 setPrevious(ListItem_ex49 item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    ListItem_ex49 previous() {
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem_ex49 item) {
        if((int)this.value > (int)item.value)
            return 1;
        else if ((int)this.value == (int)item.value)
            return 0;
        else
            return -1;
    }
}
