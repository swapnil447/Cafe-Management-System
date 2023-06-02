package com.inn.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserWrapper {
	
	public Integer id;
	public String name;
	public String email;
	public String contactNumber;
	public String status;
	
	public UserWrapper(Integer id, String name, String email, String contactNumber, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.status = status;
	}
	
	
}
