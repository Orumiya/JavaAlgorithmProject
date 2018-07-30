package algorithm.linkedListPackage;

public class CustomLinkedList<T> {

    ListItem<T> head;

    public void insert(T data){

        ListItem<T> newItem = new ListItem<>(data);
        if(head == null){
            head = newItem;
        }else{
            ListItem<T> currentItem = head;
            while (currentItem.nextItem != null){
                currentItem = currentItem.nextItem;
            }
            currentItem.nextItem = newItem;
        }
    }

    public void display(){

        if(head != null){
            ListItem<T> currentItem = head;
            System.out.println(currentItem.toString());
            while (currentItem.nextItem != null){

                currentItem = currentItem.nextItem;
                System.out.println(currentItem.toString());
            }
        }


    }
    public void delete(T data){

        if(head!= null){
            if(!head.itemData.equals(data)){
                ListItem<T> current = head;
                while (current.nextItem != null && !current.nextItem.itemData.equals(data)){
                    current = current.nextItem;
                }
                if(current.nextItem == null){
                    return;
                }else{
                    current.nextItem = current.nextItem.nextItem;
                }
            }else{
                head = head.nextItem;
            }
        }
        else{
            return;
        }

    }

    public void deleteAll(){

        head = null;
    }

    public ListItem<T> search(T data){

        if(head!= null){
            if(!head.itemData.equals(data)){
                ListItem<T> current = head;
                while (current.nextItem != null && !current.nextItem.itemData.equals(data)){
                    current = current.nextItem;
                }
                if(current.nextItem == null){
                    return null;
                }else{
                    return current.nextItem;
                }
            }else{
                return head;
            }
        }
        else{
            return null;
        }
    }
}
