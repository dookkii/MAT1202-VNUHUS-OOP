package exam_2324_2nd_endterm_2.mystudentmanager;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        return (0 <= index && index <= limit);
    }
}
