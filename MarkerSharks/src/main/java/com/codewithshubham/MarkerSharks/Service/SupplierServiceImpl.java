package com.codewithshubham.MarkerSharks.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.codewithshubham.MarkerSharks.Dto.SupplierDTO;
import com.codewithshubham.MarkerSharks.Entity.Supplier;
import com.codewithshubham.MarkerSharks.Repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;
		
	//add supplier
	public Supplier addSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
	
	//search supplier
//	public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses) {
//        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
//                location, natureOfBusiness, manufacturingProcesses);
//    }
	public Page<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                location, natureOfBusiness, manufacturingProcesses, pageable);
    }


}
