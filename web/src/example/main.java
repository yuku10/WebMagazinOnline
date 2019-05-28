package example;

import example.*;
import example.models.*;

import java.util.ArrayList;


public class main {
    public static void main(String[] argv) {
//    Object implementor = new HelloWorld ();
//    String address = "http://localhost:9000/HelloWorld";
//    Endpoint.publish(address, implementor);
        //Product p = new Product(15,"Lenovo",245.5,15);
        //AdminFunctions.addNewProduct();
  User u = new User("voinea","alex","va@gmail.com","cisco","vaalkj");
//    magazinDb.insertUser(u);
     //   ArrayList<String> s = magazinDb.getAllUsernames();
//        String st = UI.createAccount(u);
        System.out.println( magazinDb.selectProduct());

    }
}
