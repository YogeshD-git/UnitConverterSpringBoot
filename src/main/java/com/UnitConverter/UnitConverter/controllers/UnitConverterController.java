package com.UnitConverter.UnitConverter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UnitConverter.UnitConverter.Enumeration.Quantities;
import com.UnitConverter.UnitConverter.Enumeration.SubQuantities;
import com.UnitConverter.UnitConverter.dto.ConvertDTO;
import com.UnitConverter.UnitConverter.dto.ResponseDTO;
import com.UnitConverter.UnitConverter.service.impl.UnitConversionServiceImpl;

@RestController
@RequestMapping("/api/converter")
public class UnitConverterController {
	 	@Autowired
	    private UnitConversionServiceImpl unitConversionService;

	    @GetMapping("/main-quantities")
	    public Quantities[] getAllMainQuantities() {
	        return unitConversionService.getAllMainUnits();
	    }

	    @GetMapping("/sub-quantities/{mainQuantity}")
	    public List<SubQuantities> getAllSubQuantities(@PathVariable Quantities mainQuantity) {
	        return unitConversionService.getAllSubUnits(mainQuantity);
	    }

	    @PostMapping("/convert")
	    public ResponseDTO convert(@RequestBody ConvertDTO convertDTO) {
	        try {
	            Double result = unitConversionService.getConvertedValueOfUnit(convertDTO);
	            return new ResponseDTO(result, "Conversion successful", 200);
	        } catch (IllegalArgumentException e) {
	            return new ResponseDTO(null, e.getMessage(), 400);
	        }
	    }
}
