public class Product {
    long id;
    String name;
    String supplier;
    int price;


}

class ProductAlreadyExists extends Exception {

}

class ProductNotFound extends Exception {

}
