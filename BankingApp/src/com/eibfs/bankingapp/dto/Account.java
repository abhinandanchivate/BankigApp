package com.eibfs.bankingapp.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants.Exclude;
@Data
//@ToString(exclude ="accountCreated" )
public class Account {

	// we will have all props in private mode.
	
	private String accountHolderName;
	private String accountNumber;
	private float balance;
	
	private String accountType;
	private String contactNumber;
	private String address;
	// in  a datetime format
	// don't want setter method.
	@Getter(value=AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private LocalDateTime accountCreated = LocalDateTime.now();
	private boolean isActive;
	//any boolean field will start with is.
	
	// toString method is overridden 
	// 
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", accountType=" + accountType + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", accountCreated="
				+ accountCreated.format
				(DateTimeFormatter.ofPattern
						("D dd-MM-YYYY HH:mm:SS")) + "]";
	}
}
