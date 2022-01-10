package data.models;

import lombok.Data;

@Data
public class UserDetails {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String pinCode;
}