package com.codewithshubham.MarkerSharks.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.codewithshubham.MarkerSharks.Dto.SupplierDTO;
import com.codewithshubham.MarkerSharks.Entity.Supplier;

public interface SupplierService {
	
	Supplier addSupplier(Supplier supplier);
	
	public Page<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable);
//	public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses) ;
}
