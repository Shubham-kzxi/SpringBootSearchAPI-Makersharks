package com.codewithshubham.MarkerSharks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.codewithshubham.MarkerSharks.Dto.SupplierDTO;
import com.codewithshubham.MarkerSharks.Entity.Supplier;
import com.codewithshubham.MarkerSharks.Service.SupplierService;
import com.codewithshubham.MarkerSharks.request.SupplierQueryRequest;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	// add new supplier
	@PostMapping("/add")
	public Supplier addSupplier(@RequestBody Supplier supplier) {
		return supplierService.addSupplier(supplier);
	}

	//search without pagination
	// search supplier by location,natureofbusiness, manufacturingprocesses
//    @PostMapping("/query")
//    public ResponseEntity<List<Supplier>> querySuppliers(@RequestBody SupplierQueryRequest request) {
//        List<Supplier> suppliers = supplierService.searchSuppliers(
//                request.getLocation(),
//                request.getNatureOfBusiness(),
//                request.getManufacturingProcesses()
//        );
//        return ResponseEntity.ok(suppliers);
//    }
	
	//search with pagination
	@PostMapping("/query")
	public ResponseEntity<Page<Supplier>> querySuppliers(@RequestBody SupplierQueryRequest request,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Supplier> suppliers = supplierService.searchSuppliers(request.getLocation(), request.getNatureOfBusiness(),
				request.getManufacturingProcesses(), pageable);
		return ResponseEntity.ok(suppliers);
	}
}
