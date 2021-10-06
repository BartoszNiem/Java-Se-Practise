package Section_9_exercises;

public class SearchTree_ex49 implements NodeList_ex49{
    private ListItem_ex49 root;

    public SearchTree_ex49(ListItem_ex49 root) {
        this.root = root;
    }


    @Override
    public ListItem_ex49 getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem_ex49 item) {
        ListItem_ex49 iterator = root;
        while(iterator != null){
            if((int)item.getValue() < (int)iterator.getValue()){
                if(iterator.previous() == null){
                    iterator.setPrevious(item);
                    return true;
                }
                iterator = iterator.previous();
            }
            else if((int)item.getValue() > (int)iterator.getValue()){
                if(iterator.next() == null){
                    iterator.setNext(item);
                    return true;
                }
                iterator = iterator.next();
            }
        }
        /*
        if((int)item.getValue() < (int)iterator.getValue()){
            iterator = iterator.previous();
        }
        else if((int)item.getValue() > (int)iterator.getValue()){
            iterator = iterator.next();
        }

         */
        return false;
    }

    @Override
    public boolean removeItem(ListItem_ex49 item) {
        if(item.next() == null && item.previous() == null){
            ListItem_ex49 iterator = root;
            while(iterator != null){
                if((int)item.getValue() < (int)iterator.getValue()){
                    if(iterator.previous() == item){
                        iterator.setPrevious(null);
                        return true;
                    }
                    iterator = iterator.previous();
                }
                else if((int)item.getValue() > (int)iterator.getValue()){
                    if(iterator.next() == item){
                        iterator.setNext(null);
                        return true;
                    }
                    iterator = iterator.next();
                }
            }
        }
        else if((item.previous() != null && item.next() == null) || (item.previous() == null && item.next() != null)){
            ListItem_ex49 iterator = root;
            while(iterator != null){
                if((int)item.getValue() < (int)iterator.getValue()){
                    if(iterator.previous() == item){
                        iterator.setPrevious((item.previous() != null)? item.previous() : item.next());
                        return true;
                    }
                    iterator = iterator.previous();
                }
                else if((int)item.getValue() > (int)iterator.getValue()){
                    if(iterator.next() == item){
                        iterator.setNext((item.previous() != null)? item.previous() : item.next());
                        return true;
                    }
                    iterator = iterator.next();
                }
            }
        }
        else if(item.previous() != null && item.next() != null){
            ListItem_ex49 itemToReplaceRemovedItem = item.next();
            while(true){
                if(itemToReplaceRemovedItem.previous() != null){
                    itemToReplaceRemovedItem = itemToReplaceRemovedItem.previous();
                }else{
                    break;
                }
            }
            ListItem_ex49 iterator = root;
            while(iterator != null){
                if((int)item.getValue() < (int)iterator.getValue()){
                    if(iterator.previous() == item){
                        iterator.setPrevious(itemToReplaceRemovedItem);
                        itemToReplaceRemovedItem.setPrevious(item.previous());

                        return true;
                    }
                    iterator = iterator.previous();
                }
                else if((int)item.getValue() > (int)iterator.getValue()){
                    if(iterator.next() == item){
                        iterator.setNext(itemToReplaceRemovedItem);
                        itemToReplaceRemovedItem.setPrevious(item.previous());

                        return true;
                    }
                    iterator = iterator.next();
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem_ex49 root) {
        if(root!=null){
            traverse(root.previous());
            System.out.print(root.getValue() + ", ");
            traverse(root.next());
        }

    }

    public static void main(String[] args) {
//        Node_ex49 node1 = new Node_ex49(5);
//        Node_ex49 node2 = new Node_ex49(13);
//        Node_ex49 node3 = new Node_ex49(77);
//        Node_ex49 node4 = new Node_ex49(-9);
//        Node_ex49 node5 = new Node_ex49(3);
        Node_ex49 node1 = new Node_ex49(6);
        Node_ex49 node2 = new Node_ex49(4);
        Node_ex49 node3 = new Node_ex49(8);
        Node_ex49 node4 = new Node_ex49(3);
        Node_ex49 node5 = new Node_ex49(5);
        Node_ex49 node6 = new Node_ex49(7);
        Node_ex49 node7 = new Node_ex49(9);
//        System.out.println("--------------------Operations on binary tree: --------------------");
//        SearchTree_ex49 tree = new SearchTree_ex49(node1);
//        tree.addItem(node2);
//        tree.addItem(node3);
//        tree.addItem(node4);
//        tree.addItem(node5);
//        tree.addItem(node6);
//        tree.addItem(node7);
//        tree.traverse(tree.getRoot());
//        tree.removeItem(node3);
//        System.out.println("");
//        tree.traverse(tree.getRoot());
//        tree.removeItem(node7);
//        System.out.println("");
//        tree.traverse(tree.getRoot());
        System.out.println("\n-------------------- Operations on linked list: --------------------");
        MyLinkedList_ex49 list = new MyLinkedList_ex49();
        list.addItem(node1);
        list.addItem(node2);
        list.addItem(node3);
        list.addItem(node4);
        list.addItem(node5);
        list.addItem(node6);
        list.addItem(node7);
        list.traverse(list.getRoot());
        list.removeItem(node4);
        System.out.println("------------------------after deletion-------------------------------");
        list.traverse(list.getRoot());
    }

}
