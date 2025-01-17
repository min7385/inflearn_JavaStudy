package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        // 더 이상 참조하지 않지만, 메모리는 차지하고 있다.
        // 자바는 이러한 인스턴스를 자동으로 메모리에서 제거해준다.(GC)
    }
}
