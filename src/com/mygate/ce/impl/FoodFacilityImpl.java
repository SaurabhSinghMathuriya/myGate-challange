package com.mygate.ce.impl;

import java.util.List;

import com.mygate.ce.mgr.FoodFacilityMgr;
import com.mygate.dal.bean.MobileFoodFacilityPermit;
import com.mygate.dal.dao.MobileFoodFacilityPermitDAO;

public class FoodFacilityImpl implements FoodFacilityMgr{

	private MobileFoodFacilityPermitDAO mobileFoodFacilityPermitDAO;
	
	public MobileFoodFacilityPermitDAO getMobileFoodFacilityPermitDAO() {
		return mobileFoodFacilityPermitDAO;
	}

	public void setMobileFoodFacilityPermitDAO(MobileFoodFacilityPermitDAO mobileFoodFacilityPermitDAO) {
		this.mobileFoodFacilityPermitDAO = mobileFoodFacilityPermitDAO;
	}
	
	@Override
	public List<MobileFoodFacilityPermit> findByfilter(String applicantName, String expiryDate, String streetName) {
		String query = "from MobileFoodFacilityPermit mfp where 1=1";
		if(null != applicantName && applicantName.trim().length()>0){
			query += " and mfp.applicant like :applicantName";
		}if(null != expiryDate && expiryDate.trim().length()>0){
			query += " and mfp.applicant = :expiryDate";
		}if(null != streetName && streetName.trim().length()>0){
			query += "and mfp.streetName like :streetName";
		}
		List<MobileFoodFacilityPermit> responseBean = null;
		responseBean = mobileFoodFacilityPermitDAO.findByFilter(applicantName, expiryDate, streetName, query);
		return responseBean;
	}

	@Override
	public MobileFoodFacilityPermit addOrDelete(MobileFoodFacilityPermit requestObj) {
		MobileFoodFacilityPermit response = null;
		if(null != requestObj.getId() && String.valueOf(requestObj.getId()).trim().length()>0){
			response = mobileFoodFacilityPermitDAO.findById(requestObj.getId());
			if(null == response){
				//TODO Already Deleted
				response = null;
			}else{
				mobileFoodFacilityPermitDAO.deleteById(requestObj.getId());
				//TODO Deleted SuccessFully
				response = null;
			}	
		}else{
			response = mobileFoodFacilityPermitDAO.merge(requestObj);
		}
		return response;
	}

}
