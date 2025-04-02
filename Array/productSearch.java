public class productSearch {
public static int linearSearch(String[] product, String key){
    for(int i =0; i<product.length; i++){
        if(product[i].equals(key)){
            return 1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor"};
        String key = "Mouse";

        int index = linearSearch(products, key);
        if(index==-1){
            System.out.println("'"+ key + "' Not found int product list");
        }else{
            System.out.println("'" + key + "' found in the product list");
        }
    }
}
