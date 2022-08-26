package demo.oops;

public class EncapsulationEx
{
    public static void main(String[] args) {
        Product1 product1 = new Product1();
        System.out.println(product1.getProductId());
        product1.setProductId(5);
        System.out.println(product1.getProductId());
    }
}

class Product1 {
    //all the instance variables should be private
    private int productId;
    private String productName;
 // all getters and setters should be public
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
