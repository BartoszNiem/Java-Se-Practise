package Section_9_exercises;

public class MyLinkedList_ex49 implements NodeList_ex49{
    private ListItem_ex49 root;

    public MyLinkedList_ex49() {
        this.root = null;
    }

    @Override
    public ListItem_ex49 getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem_ex49 item) {
        if(this.root == null) {
            root = item;
            root.setNext(null);
            root.setPrevious(null);
            return true;
        }
        else {
            ListItem_ex49 iterator = root;
            while (iterator != null) {
                if (iterator.compareTo(item) == 0) {
                    return false;
                } else if (iterator.compareTo(item) > 0) {
                    if(iterator == root){
                        ListItem_ex49 helper = root;
                        helper.setPrevious(item);
                        root = item;
                        root.setNext(helper);
                        return true;
                    }
                    else{
                        ListItem_ex49 helper = iterator.previous();
                        helper.setNext(item);
                        item.setNext(iterator);
                        item.setPrevious(helper);
                        return true;
                        }
                    }
                else if(iterator.compareTo(item) < 0){
                    if(iterator.next() != null) {
                        iterator = iterator.next();
                    }
                    else {
                        iterator.setNext(item);
                        item.setPrevious(iterator);
                        return true;
                    }
                }
            }
            return true;
        }
    }

    @Override
    public boolean removeItem(ListItem_ex49 item) {
        ListItem_ex49 iterator = root;
        if(root.compareTo(item) == 0){
            root = iterator.next();
            root.setPrevious(null);
            return true;
        }
        while(iterator != null){
            if(iterator.compareTo(item) == 0){
                if(iterator.next() == null){
                    iterator.previous().setNext(null);
                    return true;
                }
                else {
                    iterator.previous().setNext(iterator.next());
                    iterator.next().setPrevious(iterator.previous());

                    System.out.println(iterator.previous().getValue() + "   " + iterator.next().getValue());
                    return true;
                }
            }
            iterator = iterator.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem_ex49 root) {
        if(this.root == null){
            System.out.println("The list is empty");
        }
        else{
            ListItem_ex49 iterator = root;
            while(iterator != null){
                System.out.println("Objects value:" + iterator.getValue());
                iterator = iterator.next();
            }

        }
    }

}
