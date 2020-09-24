public class Product {
    long id;
    String name;
    String supplier;
    int price;

    Product(long id, String name, String supplier, int price) {
        this.id=id;
        this.name=name;
        this.supplier=supplier;
        this.price=price;

    }

    public String getName(){
        return name;
    }

}

class ProductAlreadyExists extends Exception {

    public ProductAlreadyExists(String message) {
        super(message);
    }
}
class ProductNotValid extends Exception {
    public  ProductNotValid() {
    }
    public ProductNotValid(String message) {
        super(message);
    }
}


class ProductNotFound extends RuntimeException {
    public ProductNotFound() {
    }

    public ProductNotFound(String message) {
        super(message);
    }

}
