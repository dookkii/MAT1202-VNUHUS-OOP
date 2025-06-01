package hus.oop.mystudentmanager;

public interface MyList extends MyIterable {
    /**
     * Lấy kích thước mẫu.
     * @return kích thước mẫu.
     */
    int size();

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    void set(Object data, int index);

    /**
     * Thêm dữ liệu vào đầu tập dữ liệu.
     * @param data
     */
    void insertAtStart(Object data);

    /**
     * Thêm dữ liệu vào cuối tập dữ liệu.
     * @param data
     */
    void insertAtEnd(Object data);

    /**
     * Thêm dữ liệu data vào vị trí index của tập dữ liệu.
     * @param data
     * @param index
     */
    void insertAtPosition(Object data, int index);

    /**
     * Xóa phần tử dũ liệu tại vị trí index.
     * @param index
     */
    void remove(int index);
}
