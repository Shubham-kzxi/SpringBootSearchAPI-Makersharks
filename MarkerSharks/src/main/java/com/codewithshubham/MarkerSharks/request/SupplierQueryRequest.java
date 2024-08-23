package com.codewithshubham.MarkerSharks.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@Data
public class SupplierQueryRequest {

    @NotEmpty(message = "Location is required")
    private String location;
    
    @NotEmpty(message = "NatureofBusiness is required")
    private String natureOfBusiness;
    
    @NotEmpty(message = "manufacturingProcesses is required")
    private String manufacturingProcesses;
  
    
}

