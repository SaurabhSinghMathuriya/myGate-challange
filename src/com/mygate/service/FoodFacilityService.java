package com.mygate.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
import com.mygate.ce.mgr.FoodFacilityMgr;
import com.mygate.ce.util.ServiceFinder;
import com.mygate.dal.bean.MobileFoodFacilityPermit;

@Path("/mob-food-permit")
public class FoodFacilityService {

	private static final Logger LOGGER = Logger.getLogger(FoodFacilityService.class);
	
	
	/** 
	 * @param applicantName
	 * @param expiryDate
	 * @param streetName
	 */
	
	@POST
	@Path("/find")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<MobileFoodFacilityPermit> getDetailsByApplicantName(@FormParam("name") String applicantName, @FormParam("expiryDate") String expiryDate,
			@FormParam("streetName") String streetName, @Context HttpServletRequest request){
		List<MobileFoodFacilityPermit> responseBean = null;
		FoodFacilityMgr foodFacilityMgr = null;
		try{
			LOGGER.info("Get Details Service By Applicant Name Started");
			foodFacilityMgr = (FoodFacilityMgr) ServiceFinder.getBean("iAddressMgrImpl", request);
			responseBean = foodFacilityMgr.findByfilter(applicantName, expiryDate, streetName);
			LOGGER.info("Get Details Service By Applicant Name Success");
		}catch(Exception e){
			LOGGER.info("Get Details Service By Applicant Name Failed");
			e.printStackTrace();
		}finally{
			LOGGER.info("Get Details Service By Applicant Name Finished");
		}
		return responseBean;
	}
	
	
	/** 
	 * @param applicantName
	 * @param expiryDate
	 * @param streetName
	 */
	
	@POST
	@Path("/add-del")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public MobileFoodFacilityPermit addOrDelete(MobileFoodFacilityPermit requestObj, @Context HttpServletRequest request){
		MobileFoodFacilityPermit responseBean = null;
		FoodFacilityMgr foodFacilityMgr = null;
		try{
			LOGGER.info("Add Or Delete The Food Truck Entry Started");
			foodFacilityMgr = (FoodFacilityMgr) ServiceFinder.getBean("iAddressMgrImpl", request);
			responseBean = foodFacilityMgr.addOrDelete(requestObj);
			LOGGER.info("Add Or Delete The Food Truck Entry Success");
		}catch(Exception e){
			LOGGER.info("Add Or Delete The Food Truck Entry Failed");
			e.printStackTrace();
		}finally{
			LOGGER.info("Add Or Delete The Food Truck Entry Finished");
		}
		return responseBean;
	}
}
