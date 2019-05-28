package example.models;

import java.util.ArrayList;

public class ShowProductServices {
//    public static StringBuffer categoryArrayToString(ArrayList<Product> categories){
//        StringBuffer stringBuffer = new StringBuffer();
//        for(Product category : categories)
//            stringBuffer.append("Category Id: " + category.getPid() + "    " +
//                    "Category name: " + category.getName() + "\n        ");
//        return stringBuffer;
//    }

    public static StringBuffer namesArrayToString(ArrayList<String> prodNames){
        StringBuffer stringBuffer = new StringBuffer();
        for(String name : prodNames)
            stringBuffer.append(name + "\n                ");
        return stringBuffer;
    }
}
