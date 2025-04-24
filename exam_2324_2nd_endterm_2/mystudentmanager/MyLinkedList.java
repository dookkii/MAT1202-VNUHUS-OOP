package exam_2324_2nd_endterm_2.mystudentmanager;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            this.currentPosition = start;
        }

        @Override
        public boolean hasNext() {
            return (currentPosition < size);
        }

        @Override
        public Object next() {
            return getNodeByIndex(currentPosition++).data;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        if (!checkBoundaries(index, size - 1)) {
            return;
        }

        getNodeByIndex(index).data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        if (head == null) {
            insertAtStart(value);
            return;
        }

        Node lastNode = getNodeByIndex(size - 1);
        lastNode.next = new Node(value);
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        if (!checkBoundaries(index, size)) {
            return;
        }

        if (index == 0) {
            insertAtStart(value);
            return;
        }

        if (index == size) {
            insertAtEnd(value);
            return;
        }

        Node previousNode = getNodeByIndex(index - 1);
        Node newNode = new Node(value);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        if (checkBoundaries(index, size - 1)) {
            if (index == 0) {
                head = head.next;
            } else {
                Node previousNode = getNodeByIndex(index - 1);
                previousNode.next = previousNode.next.next;
            }
            size--;
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        if (!checkBoundaries(index, size - 1)) {
            return null;
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(0);
    }
}
