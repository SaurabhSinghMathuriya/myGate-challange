package com.mygate.validator;

public class FoodFacilityValidator {

	private FoodFacilityValidator(){
		
	}
	
	private static FoodFacilityValidator commonValidator;
	
	public static FoodFacilityValidator getInstance(){
		if(null == commonValidator){
			commonValidator = new FoodFacilityValidator();
		}
		return commonValidator;
	}
	
	
	
}
