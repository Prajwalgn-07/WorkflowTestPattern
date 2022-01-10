package data.clients;

import data.models.UserDetails;
import com.testvagrant.ekam.commons.data.DataSetsClient;

import java.lang.reflect.Type;

public class CustomerDetails extends DataSetsClient {

    public UserDetails getCustomerWithAccountDetails(){
        return (UserDetails) getDetails(DataKeys.WithAccount_USER_DETAILS);
    }
    public UserDetails getCustomerWithoutAccountDetails(){
        return (UserDetails) getDetails(DataKeys.WithoutAccount_USER_DETAILS);
    }
    private Object getDetails(String key) {
        return getValue(key, (Type) UserDetails.class);
    }
    private static class DataKeys {
        public static final String WithAccount_USER_DETAILS = "CustomerWithAccount";
        public static final String WithoutAccount_USER_DETAILS  = "CustomerWithoutAccount";
    }
}