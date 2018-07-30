package algorithm.linkedListPackage;

public class ListItem<T> {

    ListItem nextItem;
    T itemData;

    public ListItem(T data){
        this.itemData = data;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    @Override
    public String toString() {
        return "ListItem{ itemData=" + itemData.toString() +
                '}';
    }
}
