package telran.data;

public class CustomLinkedList<E> implements CustomList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    private static class Node<E>{
        E value;
        Node next;
        Node prev;

        public Node(Node prev, Node next, E value) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E o) {
        if(size > 0){
            Node newNode = new Node(last, null, o);
            last.next = newNode;
            last = newNode;
        }else {
            Node newNode = new Node(null, null, o);
            first = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node ret = getNode(index);
        return (E)ret.value;
    }

    private Node getNode(int index){
        Node res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    @Override
    public E removeByIndex(int index) {
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node nodeToRemove = first;
        if (index == 0) {
            first = first.next;
            first.prev = null;
            size--;
            return (E)nodeToRemove.value;
        } else if (index == size - 1){
            nodeToRemove = last;
            last.next = null;
            size--;
            return (E)nodeToRemove.value;
        }
        // can be used array or use method getNode (as below)
//        for (int i = 0; i < index; i++) {
//            nodeToRemove = nodeToRemove.next;
//        }
        nodeToRemove = getNode(index);
        nodeToRemove.prev.next = nodeToRemove.next;
        nodeToRemove.next.prev = nodeToRemove.prev;
        size--;
        return (E) nodeToRemove.value;
    }

    public void print(){
        Node node = first;
        for (int i = 0; i < size; i++) {
            System.out.println(" node: " + i + " = " + node.value);
            node = node.next;
        }
    }

    @Override
    public boolean remove(E o) {
        if(o.equals((first.value))){
            first = first.next;
            first.prev = null;
            size--;
            return true;
        } else if(o.equals(last.value)){
            last = last.prev;
            last.next = null;
            size--;
            return true;
        }
        for (int i = 1; i < size - 1; i++) { // (Node node = first.next; node.next != null; node = node.next)
            Node node = getNode(i);
            if(o.equals(getNode(i).value)){
               node.prev.next = node.next;
               node.next.prev = node.prev;
               size--;
               return true;
            }
        }
        return false;
    }
}
