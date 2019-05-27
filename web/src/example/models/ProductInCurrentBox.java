package example.models;

public class ProductInCurrentBox {
    Integer idcurrent_box;
    String user_current;
    String numeProd;
    Integer cantitate;
    Double pret;

    public ProductInCurrentBox() {
    }

    public ProductInCurrentBox(Integer idcurrent_box, String user_current, String numeProd, Integer cantitate) {
        this.idcurrent_box = idcurrent_box;
        this.user_current = user_current;
        this.numeProd = numeProd;
        this.cantitate = cantitate;
    }

    public ProductInCurrentBox(Integer idcurrent_box, String user_current, String numeProd, Integer cantitate, Double pret) {
        this.idcurrent_box = idcurrent_box;
        this.user_current = user_current;
        this.numeProd = numeProd;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Integer getIdcurrent_box() {
        return idcurrent_box;
    }

    public void setIdcurrent_box(Integer idcurrent_box) {
        this.idcurrent_box = idcurrent_box;
    }

    public String getUser_current() {
        return user_current;
    }

    public void setUser_current(String user_current) {
        this.user_current = user_current;
    }

    public String getNumeProd() {
        return numeProd;
    }

    public void setNumeProd(String numeProd) {
        this.numeProd = numeProd;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "ProductInCurrentBox{" +
                "idcurrent_box=" + idcurrent_box +
                ", user_current='" + user_current + '\'' +
                ", numeProd='" + numeProd + '\'' +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}';
    }
}


