package hus.oop.mystudentmanager;

public interface MyIterator {
    /**
     * Kiểm tra xem có thể duyệt tiếp hay không.
     * @return true nếu còn duyệt được, false nếu không duyệt được nữa.
     */
    boolean hasNext();

    /**
     * Lấy dữ liệu của phần tử hiện tại, sau đó dịch chuyển bộ duyệt sang phần tử kế tiếp.
     * @return dữ liệu của phần tử hiện tại.
     */
    Object next();
}
