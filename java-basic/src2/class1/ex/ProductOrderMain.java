package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        int totalAmount = 0;
        for(int i=0; i<orders.length; i++){
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
            totalAmount += orders[i].price * orders[i].quantity;
        }

        System.out.println("총 결제금액은? " + totalAmount);
    }
}
