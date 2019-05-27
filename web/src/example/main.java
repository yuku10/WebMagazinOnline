package example;

import example.*;
import example.models.*;


public class main {
    public static void main(String[] argv) {
//    Object implementor = new HelloWorld ();
//    String address = "http://localhost:9000/HelloWorld";
//    Endpoint.publish(address, implementor);
        Product p = new Product(15,"Lenovo",245.5,15);
        AdminFunctions.addNewProduct();
    }
}
