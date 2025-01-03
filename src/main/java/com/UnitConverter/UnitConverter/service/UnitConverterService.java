package com.UnitConverter.UnitConverter.service;

import java.util.List;

import com.UnitConverter.UnitConverter.Enumeration.Quantities;
import com.UnitConverter.UnitConverter.Enumeration.SubQuantities;
import com.UnitConverter.UnitConverter.dto.ConvertDTO;

public interface  UnitConverterService {
	Quantities[] getAllMainUnits();

    List<SubQuantities> getAllSubUnits(Quantities mainQuantity);

    Double getConvertedValueOfUnit(ConvertDTO convertDTO);

}
