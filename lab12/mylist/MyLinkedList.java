package lab12.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    private boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("MyLinkedList: Index out of range.");
            return false;
        }
        return true;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (!checkIndex(index)) {
            return null;
        }

        return getNodeByIndex(index).getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (!checkIndex(index)) {
            return;
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode nodeToRemove = previousNode.getNext();
            previousNode.setNext(nodeToRemove.getNext());
        }

        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        insert(payload, size);
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) {
            System.out.println("MyLinkedList: Index out of range for insert.");
            return;
        }

        if (index == 0) {
            head = new MyLinkedListNode(payload, head);
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            previousNode.setNext(new MyLinkedListNode(payload, previousNode.getNext()));
        }

        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode node = head;

        for (int i = 0; i < index; i++) {
            if (node != null) {
                node = node.getNext();
            }
        }
        return node;
    }
}
