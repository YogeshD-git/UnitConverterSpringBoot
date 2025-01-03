package com.UnitConverter.UnitConverter.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.UnitConverter.UnitConverter.Enumeration.Quantities;
import com.UnitConverter.UnitConverter.Enumeration.SubQuantities;
import com.UnitConverter.UnitConverter.dto.ConvertDTO;
import com.UnitConverter.UnitConverter.service.UnitConverterService;

@Service
public class UnitConversionServiceImpl implements UnitConverterService{

	    @Override
	    public Quantities[] getAllMainUnits() {
	        return Quantities.values();
	    }

	    @Override
	    public List<SubQuantities> getAllSubUnits(Quantities unit) {
	        return Arrays.stream(SubQuantities.values())
	                .filter(units -> units.mainQuantityType.equals(unit))
	                .collect(Collectors.toList());
	    }

	    @Override
	    public Double getConvertedValueOfUnit(ConvertDTO convertDTO) {
	        if (convertDTO.baseUnit.mainQuantityType.equals(Quantities.TEMPERATURE)) {
	            return conversionForTemperatureUnits(convertDTO);
	        }
	        return (convertDTO.valueOfInitialUnit * convertDTO.baseUnit.conversionFactor) / convertDTO.targetUnit.conversionFactor;
	    }

	    public Double conversionForTemperatureUnits(ConvertDTO convertDTO) {
	        if (convertDTO.baseUnit == SubQuantities.CELSIUS && convertDTO.targetUnit == SubQuantities.FAHRENHEIT)
	            return (convertDTO.valueOfInitialUnit * convertDTO.baseUnit.conversionFactor) + 32;
	        return (convertDTO.valueOfInitialUnit - 32) * convertDTO.baseUnit.conversionFactor;
	    }
}
