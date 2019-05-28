package example;

public interface magazinDbData {
    // public static Object insertUser;
    String selectUsernames = "SELECT username from user";
    String insertUser = "INSERT INTO user(username,password,email,Nume,Prenume) VALUES(?, ?, ?, ?, ?)";
    String selectPassword = "SELECT password FROM user where username = ?";
    String insertProduct = "INSERT INTO produse(idproduse,numeProdus,pretProdus,stocProdus) VALUES(?,?,?,?)";
    //String selectUserByUserId = "SELECT * FROM user WHERE iduser = ?";
    String selectUserByUsername = "SELECT * FROM user WHERE username = ?";
    String selectProducts = "SELECT numeProdus FROM produse";
    String selectProductsAllAttributes = "SELECT * FROM produse";
    String selectAllProductsInCurrentBox = "SELECT * FROM current_box WHERE idcurrent_box =?";
    String insertProductInCurrentBox = "INSERT INTO current_box(idcurrent_box,user_current,produs,cantitate,pret) VALUES(?,?,?,?,?)";
    String deleteUserByEmail="DELETE FROM user WHERE email = ?";
    String deleteProductByName="DELETE from produse WHERE numeProdus =?";
    String deleteAllProductsFromCurrentBox = "DELETE FROM current_box where idcurrent_box =?";
    String deleteProductFromCurrentBoxByIdBox = "DELETE FROM current_box WHERE idcurrent_box =?";
    String selectProdName = "SELECT numeProdus FROM produse";
}


