package com.mygate.ce.mgr;

import java.util.List;

import com.mygate.dal.bean.MobileFoodFacilityPermit;

public interface FoodFacilityMgr {

	public List<MobileFoodFacilityPermit> findByfilter(String applicantName, String expiryDate, String streetName);

	public MobileFoodFacilityPermit addOrDelete(MobileFoodFacilityPermit requestObj);
	
}
