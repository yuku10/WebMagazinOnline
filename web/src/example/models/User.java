package example.models;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.Integer;

public class User {
    private String Nume;
    private String Prenume;
    private String email;
    private String password;
    private String username;
    private Integer id;

    public User(String nume, String prenume, String email, String password, String username) {
        Nume = nume;
        Prenume = prenume;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "models.User{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }

    public User(Integer id, String username, String password, String email, String nume, String prenume) {
        Nume = nume;
        Prenume = prenume;
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public String getNume() {
        return Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Integer getId() {
        return id;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //    List<models.Product> cartItems=new ArrayList<models.Product>();
//    List<models.Product> userItems=new ArrayList<models.Product>();
//
//    public void addProductToCartByPID(Integer pid) {
//        models.Product product = getProductByProductID(pid);
//        addToCart(product);
//        product.setStock(product.getStock()+1);
//    }
//
//    public void addInBoxByPID(Integer pid) {
//        models.Product product = getProductByProductID(pid);
//        buyProduct(product);
//        int count=1;
//        product.setStock(count);
//        count++;
//    }
//    private models.Product getProductByProductID(Integer pid) {
//        models.Product product = null;
//        for (models.Product prod: cartItems) {
//            if (prod.getPid() == pid) {
//                product = prod;
//                break;
//            }
//        }
//       // System.out.println("sters");
//        return product;
//    }
//
//    private void addToCart(models.Product product) {
//        cartItems.add(product);
//    }
//    private void buyProduct(models.Product product) {
//        userItems.add(product);
//    }
//
//    public void removeProductByPID(models.Product product) {
//        //models.Product prod = getProductByProductID(pid);
//        cartItems.remove(product);
//    }
//
//    void printUserItems() {
//        for(models.Product prod: userItems) {
//            System.out.println(prod.getName()+" "+prod.getStock()+" ");
//
//        }
//    }
//
//    void printCartItems() {
//        for (models.Product prod: cartItems) {
//            System.out.println(prod.getPid()+" "+prod.getName()+" "+prod.getStock()+" ");
//        }
//    }
//
//    void addAdminObject() {
//
//        Scanner sc = new Scanner(System.in);
//        models.Product s = new models.Product(cartItems.size() + 1, sc.next(), sc.nextDouble(), sc.nextInt());
//        for (models.Product prod : cartItems) {
//            if (s.equals(prod)) {
//                s.setStock(prod.getStock() + s.getStock());
//            }
//        }
//        cartItems.add(s);
//
//    }
//
//
//    void removeAdminObject(int pid) {
//        models.Product prod = getProductByProductID(pid);
//        cartItems.remove(prod);
//        //System.out.println(" Sters");
//    }
//


}
