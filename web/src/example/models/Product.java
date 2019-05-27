package example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

    private Integer pid;
    private String name;
    private Double price;
    private Integer stock;

    public Product(Integer pid, String nume, Double pret, Integer cantitate) {
        this.pid = pid;
        this.name = nume;
        this.price = pret;
        this.stock = cantitate;
    }

    @Override
    public String toString() {
        return "models.Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", products=" + products +
                '}';
    }

    public Product() {

    }

    public Integer getPid() {
        return pid;
    }

    public Double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public Integer getStock()
    {
        return stock;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setName(String nume) {
        this.name = nume;
    }

    public void setPrice(Double pret) {
        this.price = pret;
    }

    public void setStock(Integer cantitate) {
        this.stock = cantitate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.pid);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.price);
        hash = 29 * hash + Objects.hashCode(this.stock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.pid, other.pid)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        /*if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }*/
        return true;
    }

    private List<Product> products = new ArrayList<Product>();


    public List<Product> getProducts() {
        return products;
    }
}
