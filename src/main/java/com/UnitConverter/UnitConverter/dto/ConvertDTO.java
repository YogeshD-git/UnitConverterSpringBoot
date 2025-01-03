package com.UnitConverter.UnitConverter.dto;

import com.UnitConverter.UnitConverter.Enumeration.SubQuantities;

public class ConvertDTO {
		public Double valueOfInitialUnit;
	    public SubQuantities baseUnit;
	    public SubQuantities targetUnit;

	    public ConvertDTO(Double valueOfInitialUnit, SubQuantities baseUnit, SubQuantities targetUnit) {
	        this.valueOfInitialUnit = valueOfInitialUnit;
	        this.baseUnit = baseUnit;
	        this.targetUnit = targetUnit;
	    }

	    public Double getValueOfInitialUnit() {
	        return valueOfInitialUnit;
	    }

	    public SubQuantities getBaseUnit() {
	        return baseUnit;
	    }

	    public SubQuantities getTargetUnit() {
	        return targetUnit;
	    }
}
