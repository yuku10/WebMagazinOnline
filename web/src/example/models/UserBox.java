package example.models;

import example.models.User;

import java.util.ArrayList;

public class UserBox {
    private User user;
    private double sumaCos;
    private int idbox;
    private ArrayList<Product> cartItems=new ArrayList<Product>();

    public User getUser() {
        return user;
    }

    public int getIdbox() {
        return idbox;
    }

    public void setIdbox(int idbox) {
        this.idbox = idbox;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSumaCos() {
        return sumaCos;
    }

    public void setSumaCos(double sumaCos) {
        this.sumaCos = sumaCos;
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<Product> cartItems) {
        this.cartItems = cartItems;
    }

}
