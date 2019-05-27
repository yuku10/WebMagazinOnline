package example;

import example.models.Product;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminFunctions {
    public static void addNewProduct(){
        Product prod = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("IdProd: ");
        prod.setPid(sc.nextInt());
        System.out.println("Nume Produs: ");
        prod.setName(sc.next());
        System.out.println("Pret produs: ");
        prod.setPrice(sc.nextDouble());
        System.out.println("Stoc produs: ");
        prod.setStock(sc.nextInt());
        ArrayList<Product> products = magazinDb.getAllProductsAllAttributes();

        if(products.contains(prod)){
            int i = products.indexOf(prod);
            int stoc = products.get(i).getStock()+prod.getStock();
            products.get(i).setStock(stoc);
            magazinDb.updateProduct(stoc,prod.getName());
        }
        else{
            magazinDb.insertProduct(prod);
        }
    }

    public static void updateProductStock(){

    }
    public static void deleteUser(){
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        magazinDb.deleteUserByEmail(email);
        System.out.println("User with email: "+email+" was deleted");

    }



}

