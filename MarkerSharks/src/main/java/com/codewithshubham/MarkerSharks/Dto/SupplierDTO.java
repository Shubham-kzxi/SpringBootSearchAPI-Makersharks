package com.codewithshubham.MarkerSharks.Dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SupplierDTO {
	private Long supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcesses;

}
