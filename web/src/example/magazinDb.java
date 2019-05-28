package example;

import example.models.Product;
import example.models.ProductInCurrentBox;
import example.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class magazinDb {
    private magazinDb() {
    }

    private static Connection dataBaseConnection;

    public static Connection getDataBaseConnection() {
        dataBaseConnection = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            dataBaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazin?useSSL=false&allowPublicKeyRetrieval=true", "root", "");
        } catch(Exception e){
            e.printStackTrace();
        }
        return dataBaseConnection;
    }

    public static void insertProduct(Product newProduct) {
        try (PreparedStatement Statement = getDataBaseConnection().prepareStatement(magazinDbData.insertProduct)){
            Statement.setInt(1, newProduct.getPid());//newProduct.getPid());
            Statement.setString(2, newProduct.getName());
            Statement.setDouble(3, newProduct.getPrice());//newUser.getEmail());
            Statement.setInt(4, newProduct.getStock());

            Statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    //    public static void insertInCurrentBox(Product newProduct) {
//        try (PreparedStatement Statement = getDataBaseConnection().prepareStatement(magazinDbData.insertProductInCurrentBox)){
//            Statement.setInt(1);
//        }
//    }
    public static void insertUser(User user){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.insertUser)){
            statement.setString(1, user.getUsername());
            statement.setString(4, user.getNume());
            statement.setString(5, user.getPrenume());
            statement.setString(3, user.getEmail());
            statement.setString(2, user.getPassword());
            //statement.setInt(1,user.getId());
            statement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
        close();
    }

    public static User selectUser(String username){
        User user = new User();
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectUserByUsername)){
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                user.setUsername(resultSet.getString("username"));
                user.setNume(resultSet.getString("Nume"));
                user.setPrenume(resultSet.getString("Prenume"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setId(resultSet.getInt("iduser"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    public static ArrayList<String> selectProduct(){
        ArrayList<String> categories = new ArrayList<>();
        try(PreparedStatement statement =getDataBaseConnection().prepareStatement(magazinDbData.selectProdName)){
            ResultSet resultSet =statement.executeQuery();
            while(resultSet.next()){
                String categoryName = resultSet.getString("numeProdus");
                categories.add(categoryName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
    public static ArrayList<String> getAllUsernames(){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectUsernames)){
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String> usernames = new ArrayList<>();
            while(resultSet.next()){
                String username = resultSet.getString("username");
                usernames.add(username);
            }
            resultSet.close();
            close();
            return usernames;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<String> getAllProducts(){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectProducts)){
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String> products = new ArrayList<>();
            while(resultSet.next()){
                String prod = resultSet.getString("numeProdus");
                products.add(prod);
            }
            resultSet.close();
            close();
            return products;
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Product> getAllProductsAllAttributes(){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectProductsAllAttributes)){
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Product> products = new ArrayList<>();
            while(resultSet.next()){
                //models.Product prod = resultSet.getString("numeProdus");
                Integer arg1 = resultSet.getInt("idProduse");
                String arg2 = resultSet.getString("numeProdus");
                Double arg3 = resultSet.getDouble("pretProdus");
                Integer arg4 = resultSet.getInt("stocProdus");
                Product prod = new Product(arg1,arg2,arg3,arg4);
                products.add(prod);
            }
            resultSet.close();
            close();
            return products;
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getPassword(String username){

        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectPassword)){
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            String password = null;
            if(resultSet.next())
                password =  resultSet.getString("password");
            resultSet.close();
            close();
            return password;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void close(){
        try {
            dataBaseConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePass(String newPass,String username) {

        try (PreparedStatement thisStatement = getDataBaseConnection().prepareStatement("UPDATE user SET password = ? WHERE username = ?")) {
            thisStatement.setString(1, newPass);
            thisStatement.setString(2, username);
            thisStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateProduct(Integer stoc,String numeProd){
        try (PreparedStatement thisStatement = getDataBaseConnection().prepareStatement("UPDATE produse SET stocProdus  = ? WHERE numeProdus = ?")) {
            thisStatement.setInt(1,stoc);
            thisStatement.setString(2, numeProd);
            thisStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUserByEmail(String email) {

        try (PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.deleteUserByEmail)) {
            statement.setString(1, email);
            int i = statement.executeUpdate();
            System.out.println(i + "records deleted");
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteProductByName(String nume){
        try (PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.deleteProductByName)) {
            statement.setString(1, nume);
            int i = statement.executeUpdate();
            System.out.println(i + " product deleted");
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertProductInCurrentBox(ProductInCurrentBox prod){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.insertProductInCurrentBox)){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Introduceti cantitate dorita: ");
//            Integer cantDorita = sc.nextInt();
//            if(cantDorita>prod.getCantitate()){
//                System.out.println("Nu avem aceasta cantitate");
//            }
//            else{
            ArrayList<Product> pr = getAllProductsAllAttributes();
            for(int i = 0;i<pr.size();i++){
                if(pr.get(i).getName().equals(prod.getNumeProd()) && pr.get(i).getStock()>prod.getCantitate()){
                    statement.setInt(1, prod.getIdcurrent_box());
                    statement.setString(2, prod.getUser_current());
                    statement.setString(3,prod.getNumeProd());
                    statement.setInt(4,prod.getCantitate());
                    statement.setDouble(5, pr.get(i).getPrice()*prod.getCantitate());
                    statement.executeUpdate();
                    break;
                }
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        close();
    }

    public static void deleteAllProductsFromCurrentBox(){
        try (PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.deleteAllProductsFromCurrentBox)) {
            System.out.println("Idcurrent_box: ");
            Scanner sc = new Scanner(System.in);
            Integer id = sc.nextInt();
            statement.setInt(1, id);
            int i = statement.executeUpdate();
            System.out.println(i + " product deleted");
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteProductFromCurrentBoxByIdBox(Integer id){
        try (PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.deleteProductFromCurrentBoxByIdBox)){
            statement.setInt(1,id);
            int i = statement.executeUpdate();
            System.out.println(i + " product deleted");
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<ProductInCurrentBox> getAllProductsFromCurrentBox(Integer id_box){
        try(PreparedStatement statement = getDataBaseConnection().prepareStatement(magazinDbData.selectAllProductsInCurrentBox)){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Introduceti id_box: ");
//            Integer id_box = sc.nextInt();
            statement.setInt(1,id_box);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<ProductInCurrentBox> products = new ArrayList<>();
            while(resultSet.next() ){
                Integer arg1 = resultSet.getInt("idcurrent_box");
                String arg2 = resultSet.getString("user_current");
                String arg3 = resultSet.getString("produs");
                Integer arg4 = resultSet.getInt("cantitate");
                Double arg5 = resultSet.getDouble("pret");

                ProductInCurrentBox prod= new ProductInCurrentBox(arg1,arg2,arg3,arg4,arg5);
                products.add(prod);
            }
            resultSet.close();
            close();
            return products;
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




}
