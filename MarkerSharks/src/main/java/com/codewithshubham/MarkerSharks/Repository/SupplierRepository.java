package com.codewithshubham.MarkerSharks.Repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.codewithshubham.MarkerSharks.Entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

	Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable);
}
	
//	List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
//            String location, String natureOfBusiness, String manufacturingProcesses);

	//Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable);


