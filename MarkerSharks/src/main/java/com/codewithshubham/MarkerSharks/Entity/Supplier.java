package com.codewithshubham.MarkerSharks.Entity;

import java.util.Set;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long supplierId;

	@Column(nullable = false)
	private String companyName;
	
	@Column(nullable = false)
	private String website;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private String natureOfBusiness;
	
	@Column(nullable = false)
	private String manufacturingProcesses;

}
