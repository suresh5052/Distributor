package com.example.taskproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="distributor")
public class Distributor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long DistributorId;
	
	private String distributorName;

	private String DOB;

	private String Gender;

	private String CommunicationAddress;

	private String PermanentAddress;

	private String Email;

	private String PhoneNumber;

	private String GSTN;

	private String Aadhaar;

	private String PAN;

	private String BankAcctProof;

	private String Status;

	private String CreatedBy;

	private String LastUpdatedBy;

	private String CreatedDate;

	private String LastUpdateDate;
	
	
}
