package data.clients;

import com.testvagrant.ekam.commons.data.DataSetsClient;
import data.models.Product;

import java.lang.reflect.Type;

public class ProductDetails extends DataSetsClient {
    public Product getProductSivaJuliet() {
        return (Product) getDetails(DataKeys.PRODUCT_SivaJuliet);
    }
    public Product getProductLeaceCuff(){
        return (Product) getDetails(DataKeys.PRODUCT_LeaceCuff);
    }
    public Product getProductJean(){
        return (Product) getDetails(DataKeys.PRODUCT_Jean);
    }
    public Product getProductShirts(){
        return (Product) getDetails(DataKeys.PRODUCT_Shirts);
    }

    private static class DataKeys {
        public static final String PRODUCT_SivaJuliet = "productSivaJuliet";
        public static final String PRODUCT_LeaceCuff  = "productLeaceCuff";
        public static final String PRODUCT_Jean = "productJean";
        public static final String PRODUCT_Shirts  = "productShirts";
    }
    private Object getDetails(String key) {
        return getValue(key, (Type) Product.class);
    }

}