package exam_2324_endterm_1.basicstatistics;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        if (head == null) {
            return 0;
        }

        int result = 1;
        MyLinkedListNode currentNode = head;

        while (currentNode.getNext() != null) {
            result++;
            currentNode = currentNode.getNext();
        }

        return result;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        MyLinkedListNode node = getNodeByIndex(index);

        if (node != null) {
            return node.getPayload();
        } else {
            return null;
        }
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (!(index >= 0 && index < size())) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            head = getNodeByIndex(1);
        } else if (index == size() - 1) {
            getNodeByIndex((size() - 1) - 1).setNext(null);
        } else {
            MyLinkedListNode nextNode = getNodeByIndex(index + 1);
            getNodeByIndex(index - 1).setNext(nextNode);
        }
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        insert(payload, size());
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (!(index >= 0 && index <= size())) {
            System.out.println("Invalid index!");
            return;
        }

        MyLinkedListNode newNode;
        if (index == size()) {
            newNode = new MyLinkedListNode(payload);
        } else {
            newNode = new MyLinkedListNode(payload, getNodeByIndex(index));
        }

        if (index == 0) {
            this.head = newNode;
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            previousNode.setNext(newNode);
        }
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
        if (!(index >= 0 && index < size())) {
            System.out.println("Invalid index!");
            return null;
        }

        MyLinkedListNode currentNode = head;

        for (int i = 1; i <= index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    private class MyLinkedListIterator implements MyIterator {
        /*
         * MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
           các phần tử còn lại trong MyLinkedList.
        */
        private MyLinkedListNode currentNode;

        /**
         * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
         * @param node
         */
        public MyLinkedListIterator(MyLinkedListNode node) {
            this.currentNode = node;
        }

        /**
         * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         * @return
         */
        @Override
        public boolean hasNext() {
            return (currentNode.getNext() != null);
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
         * @return payload của phần tử hiện tại.
         */
        @Override
        public Object next() {
            if (!hasNext()) {
                System.out.println("End of list.");
                return null;
            }

            currentNode = currentNode.getNext();
            return currentNode.getPayload();
        }

        @Override
        public void remove() {
            currentNode.setNext(currentNode.getNext().getNext());
        }
    }
}
