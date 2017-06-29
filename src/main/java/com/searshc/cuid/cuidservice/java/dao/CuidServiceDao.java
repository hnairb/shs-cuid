package com.searshc.cuid.cuidservice.java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.searshc.cuid.cuidservice.java.model.CustomerDetails;
import com.searshc.cuid.cuidservice.java.model.OriginationDTO;

@Repository
public class CuidServiceDao extends BaseDao {
	
	private static final Logger logger = LoggerFactory.getLogger(CuidServiceDao.class);

	@Value("${custDetailsById}")
	String custDetailsById;
	
	@Value("${custDetailsInBulk}")
	String custDetailsInBulk;
	
	@Value("${allHouseholdMembers}")
	String allHouseholdMembers;
	
	@Value("${retrieveCustomerAllAddresses}")
	String retrieveCustomerAllAddresses;
	
	@Value("${retrieveByWildcard}")
	String retrieveByWildcard;
	
	@Value("${fetchOriginationData}")
	String fetchOriginationData;
	
	public List<CustomerDetails>  retrieveCustomerDetailsById(String customerId) throws Exception {
		List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
		CustomerDetails customerDetails;
		List<Map<String,Object>> rawObjectList = jdbcTemplate.queryForList(custDetailsById, customerId);
		logger.info("In retrieveCustomerDetailsById Dao method");
		for(Map<String,Object> values : rawObjectList) {
			customerDetails = new CustomerDetails ();
			customerDetails.setNpjAddress(String.valueOf(values.get("NPJ_Address")));
			customerDetails.setCust_no(String.valueOf(values.get("Cust_no")));
			customerDetails.setNamePrefix(String.valueOf(values.get("Name_prefix")));
			customerDetails.setNameLast(String.valueOf(values.get("Name_last")));
			customerDetails.setNameFirst(String.valueOf(values.get("Name_first")));
			customerDetails.setNameSuffix(String.valueOf(values.get("Name_suffix")));
			customerDetails.setAddressNumber(String.valueOf(values.get("Address_number")));
			customerDetails.setAddressStreetPrefix(String.valueOf(values.get("Address_Street_Prefix")));
			customerDetails.setAddressStreetName(String.valueOf(values.get("Address_Street_Name")));
			customerDetails.setAddressStreetSuffix(String.valueOf(values.get("Address_Street_Suffix")));
			customerDetails.setAddressStreetModifier(String.valueOf(values.get("Address_Street_Modifier")));
			customerDetails.setAddressBoxNubmer(String.valueOf(values.get("Address_BoxNubmer")));
			customerDetails.setAddressUnitNumber(String.valueOf(values.get("Address_UnitNumber")));
			customerDetails.setAddressLine2(String.valueOf(values.get("Address_Line2")));
			customerDetails.setAddressCity(String.valueOf(values.get("Address_City")));
			customerDetails.setAddressState(String.valueOf(values.get("Address_State")));
			customerDetails.setAddressZIP1(String.valueOf(values.get("Address_ZIP_1")));
			customerDetails.setAddressZIP2(String.valueOf(values.get("Address_ZIP_2")));
			customerDetails.setEmailPrimary(String.valueOf(values.get("Email_Primary")));
			customerDetails.setEmailSecondary(String.valueOf(values.get("Email_Secondary")));
			customerDetails.setPhonePrimary(String.valueOf(values.get("Phone_Primary")));
			customerDetails.setPhoneSecondary(String.valueOf(values.get("Phone_Secondary")));
			customerDetails.setAddressLine2(String.valueOf(values.get("address_line2")));
			customerList.add(customerDetails);
		}
		logger.info("Leaving retrieveCustomerDetailsById Dao method");
		return customerList;
	}
	
	public List<CustomerDetails> retrieveBulkCustomerDetails(List<String> customerIdList) throws Exception{
		logger.info("In retrieveBulkCustomerDetails Dao method");
		List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("ids", customerIdList);
		CustomerDetails customerDetails;
		NamedParameterJdbcTemplate template = 
			    new NamedParameterJdbcTemplate(jdbcTemplate.getDataSource());
		List<Map<String,Object>> rawObjectList = template.queryForList(custDetailsInBulk,parameters);
		for(Map<String,Object> values : rawObjectList) {
			customerDetails = new CustomerDetails ();
			customerDetails.setNpjAddress(String.valueOf(values.get("NPJ_Address")));
			customerDetails.setCust_no(String.valueOf(values.get("Cust_no")));
			customerDetails.setNamePrefix(String.valueOf(values.get("Name_prefix")));
			customerDetails.setNameLast(String.valueOf(values.get("Name_last")));
			customerDetails.setNameFirst(String.valueOf(values.get("Name_first")));
			customerDetails.setNameSuffix(String.valueOf(values.get("Name_suffix")));
			customerDetails.setAddressNumber(String.valueOf(values.get("Address_number")));
			customerDetails.setAddressStreetPrefix(String.valueOf(values.get("Address_Street_Prefix")));
			customerDetails.setAddressStreetName(String.valueOf(values.get("Address_Street_Name")));
			customerDetails.setAddressStreetSuffix(String.valueOf(values.get("Address_Street_Suffix")));
			customerDetails.setAddressStreetModifier(String.valueOf(values.get("Address_Street_Modifier")));
			customerDetails.setAddressBoxNubmer(String.valueOf(values.get("Address_BoxNubmer")));
			customerDetails.setAddressUnitNumber(String.valueOf(values.get("Address_UnitNumber")));
			customerDetails.setAddressLine2(String.valueOf(values.get("Address_Line2")));
			customerDetails.setAddressCity(String.valueOf(values.get("Address_City")));
			customerDetails.setAddressState(String.valueOf(values.get("Address_State")));
			customerDetails.setAddressZIP1(String.valueOf(values.get("Address_ZIP_1")));
			customerDetails.setAddressZIP2(String.valueOf(values.get("Address_ZIP_2")));
			customerDetails.setEmailPrimary(String.valueOf(values.get("Email_Primary")));
			customerDetails.setEmailSecondary(String.valueOf(values.get("Email_Secondary")));
			customerDetails.setPhonePrimary(String.valueOf(values.get("Phone_Primary")));
			customerDetails.setPhoneSecondary(String.valueOf(values.get("Phone_Secondary")));
			customerDetails.setAddressLine2(String.valueOf(values.get("address_line2")));
			customerList.add(customerDetails);
		}
		logger.info("Leaving retrieveBulkCustomerDetails Dao method");
		return customerList;
	}
	
	public List<CustomerDetails> retrieveAllHouseholdMembers(String customerId) throws Exception {
		logger.info("In retrieveAllHouseholdMembers Dao method");
		List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
		CustomerDetails customerDetails;
		List<Map<String,Object>> rawObjectList = jdbcTemplate.queryForList(allHouseholdMembers,customerId);
		for(Map<String,Object> values : rawObjectList) {
			customerDetails = new CustomerDetails ();
			customerDetails.setNpjAddress(String.valueOf(values.get("NPJ_Address")));
			customerDetails.setCust_no(String.valueOf(values.get("Cust_no")));
			customerDetails.setNamePrefix(String.valueOf(values.get("Name_prefix")));
			customerDetails.setNameLast(String.valueOf(values.get("Name_last")));
			customerDetails.setNameFirst(String.valueOf(values.get("Name_first")));
			customerDetails.setNameSuffix(String.valueOf(values.get("Name_suffix")));
			customerDetails.setAddressNumber(String.valueOf(values.get("Address_number")));
			customerDetails.setAddressStreetPrefix(String.valueOf(values.get("Address_Street_Prefix")));
			customerDetails.setAddressStreetName(String.valueOf(values.get("Address_Street_Name")));
			customerDetails.setAddressStreetSuffix(String.valueOf(values.get("Address_Street_Suffix")));
			customerDetails.setAddressStreetModifier(String.valueOf(values.get("Address_Street_Modifier")));
			customerDetails.setAddressBoxNubmer(String.valueOf(values.get("Address_BoxNubmer")));
			customerDetails.setAddressUnitNumber(String.valueOf(values.get("Address_UnitNumber")));
			customerDetails.setAddressLine2(String.valueOf(values.get("Address_Line2")));
			customerDetails.setAddressCity(String.valueOf(values.get("Address_City")));
			customerDetails.setAddressState(String.valueOf(values.get("Address_State")));
			customerDetails.setAddressZIP1(String.valueOf(values.get("Address_ZIP_1")));
			customerDetails.setAddressZIP2(String.valueOf(values.get("Address_ZIP_2")));
			customerDetails.setEmailPrimary(String.valueOf(values.get("Email_Primary")));
			customerDetails.setEmailSecondary(String.valueOf(values.get("Email_Secondary")));
			customerDetails.setPhonePrimary(String.valueOf(values.get("Phone_Primary")));
			customerDetails.setPhoneSecondary(String.valueOf(values.get("Phone_Secondary")));
			customerDetails.setAddressLine2(String.valueOf(values.get("address_line2")));
			customerList.add(customerDetails);
		}
		logger.info("Leaving retrieveAllHouseholdMembers Dao method");
		return customerList;
	}
	
	public List<CustomerDetails> retrieveCustomerAllAddresses(String customerId) throws Exception {
		logger.info("In retrieveCustomerAllAddresses Dao method");
		List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
		CustomerDetails customerDetails;
		List<Map<String,Object>> rawObjectList = jdbcTemplate.queryForList(retrieveCustomerAllAddresses,customerId);
		for(Map<String,Object> values : rawObjectList) {
			customerDetails = new CustomerDetails ();
			customerDetails.setNpjAddress(String.valueOf(values.get("NPJ_Address")));
			customerDetails.setCust_no(String.valueOf(values.get("Cust_no")));
			customerDetails.setNamePrefix(String.valueOf(values.get("Name_prefix")));
			customerDetails.setNameLast(String.valueOf(values.get("Name_last")));
			customerDetails.setNameFirst(String.valueOf(values.get("Name_first")));
			customerDetails.setNameSuffix(String.valueOf(values.get("Name_suffix")));
			customerDetails.setAddressNumber(String.valueOf(values.get("Address_number")));
			customerDetails.setAddressStreetPrefix(String.valueOf(values.get("Address_Street_Prefix")));
			customerDetails.setAddressStreetName(String.valueOf(values.get("Address_Street_Name")));
			customerDetails.setAddressStreetSuffix(String.valueOf(values.get("Address_Street_Suffix")));
			customerDetails.setAddressStreetModifier(String.valueOf(values.get("Address_Street_Modifier")));
			customerDetails.setAddressBoxNubmer(String.valueOf(values.get("Address_BoxNubmer")));
			customerDetails.setAddressUnitNumber(String.valueOf(values.get("Address_UnitNumber")));
			customerDetails.setAddressLine2(String.valueOf(values.get("Address_Line2")));
			customerDetails.setAddressCity(String.valueOf(values.get("Address_City")));
			customerDetails.setAddressState(String.valueOf(values.get("Address_State")));
			customerDetails.setAddressZIP1(String.valueOf(values.get("Address_ZIP_1")));
			customerDetails.setAddressZIP2(String.valueOf(values.get("Address_ZIP_2")));
			customerDetails.setEmailPrimary(String.valueOf(values.get("Email_Primary")));
			customerDetails.setEmailSecondary(String.valueOf(values.get("Email_Secondary")));
			customerDetails.setPhonePrimary(String.valueOf(values.get("Phone_Primary")));
			customerDetails.setPhoneSecondary(String.valueOf(values.get("Phone_Secondary")));
			customerDetails.setAddressLine2(String.valueOf(values.get("address_line2")));
			customerList.add(customerDetails);
		}
		logger.info("Leaving retrieveCustomerAllAddresses Dao method");
		return customerList;
	}
	
	public List<CustomerDetails> retrieveByWildcardMatch(List<String> fieldName, List<String> fieldValues) throws Exception {
		logger.info("In retrieveByWildcardMatch Dao method");
		List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
		CustomerDetails customerDetails;
		StringBuilder queryBody = new StringBuilder();
		for (int i = 0; i < fieldName.size() ; i++){
			if(i > 0){
				queryBody.append("and ");
			}
			if("phone".equalsIgnoreCase(fieldName.get(i))) {
				queryBody.append("( Phone_Primary");
				queryBody.append(" = ");
				queryBody.append("'");
				queryBody.append(fieldValues.get(i));
				queryBody.append("' ");
				queryBody.append("or ");
				queryBody.append("Phone_Secondary");
				queryBody.append(" = ");
				queryBody.append("'");
				queryBody.append(fieldValues.get(i));
				queryBody.append("' )");
			} else {
				queryBody.append(fieldName.get(i));
				queryBody.append(" = ");
				queryBody.append("'");
				queryBody.append(fieldValues.get(i));
				queryBody.append("' ");
			}
		}
		String finalQuery = retrieveByWildcard+" "+queryBody;
		List<Map<String,Object>> rawObjectList = jdbcTemplate.queryForList(finalQuery);
		for(Map<String,Object> values : rawObjectList) {
			customerDetails = new CustomerDetails ();
			customerDetails.setNpjAddress(String.valueOf(values.get("NPJ_Address")));
			customerDetails.setCust_no(String.valueOf(values.get("Cust_no")));
			customerDetails.setNamePrefix(String.valueOf(values.get("Name_prefix")));
			customerDetails.setNameLast(String.valueOf(values.get("Name_last")));
			customerDetails.setNameFirst(String.valueOf(values.get("Name_first")));
			customerDetails.setNameSuffix(String.valueOf(values.get("Name_suffix")));
			customerDetails.setAddressNumber(String.valueOf(values.get("Address_number")));
			customerDetails.setAddressStreetPrefix(String.valueOf(values.get("Address_Street_Prefix")));
			customerDetails.setAddressStreetName(String.valueOf(values.get("Address_Street_Name")));
			customerDetails.setAddressStreetSuffix(String.valueOf(values.get("Address_Street_Suffix")));
			customerDetails.setAddressStreetModifier(String.valueOf(values.get("Address_Street_Modifier")));
			customerDetails.setAddressBoxNubmer(String.valueOf(values.get("Address_BoxNubmer")));
			customerDetails.setAddressUnitNumber(String.valueOf(values.get("Address_UnitNumber")));
			customerDetails.setAddressLine2(String.valueOf(values.get("Address_Line2")));
			customerDetails.setAddressCity(String.valueOf(values.get("Address_City")));
			customerDetails.setAddressState(String.valueOf(values.get("Address_State")));
			customerDetails.setAddressZIP1(String.valueOf(values.get("Address_ZIP_1")));
			customerDetails.setAddressZIP2(String.valueOf(values.get("Address_ZIP_2")));
			customerDetails.setEmailPrimary(String.valueOf(values.get("Email_Primary")));
			customerDetails.setEmailSecondary(String.valueOf(values.get("Email_Secondary")));
			customerDetails.setPhonePrimary(String.valueOf(values.get("Phone_Primary")));
			customerDetails.setPhoneSecondary(String.valueOf(values.get("Phone_Secondary")));
			customerDetails.setAddressLine2(String.valueOf(values.get("address_line2")));
			customerList.add(customerDetails);
		}
		logger.info("Leaving retrieveByWildcardMatch Dao method");
		return customerList;
	}
	
	public OriginationDTO fetchOriginationData(String customerId) throws Exception {
		OriginationDTO originationDTO = null;
		List<OriginationDTO> originationDTOList = new ArrayList<OriginationDTO>();
		List<Map<String,Object>> rawObjectList = jdbcTemplate2.queryForList(fetchOriginationData, customerId);
		logger.info("In retrieveCustomerDetailsById Dao method");
		if(rawObjectList.size()>0){
			for(Map<String,Object> values : rawObjectList) {
				originationDTO = new OriginationDTO();
				originationDTO.setCustomerId(customerId);
				originationDTO.setLocationSuffix(String.valueOf(values.get("loc_suf_no")));
				originationDTO.setOptype(String.valueOf(values.get("optype")));
				originationDTO.setOriginationCode(String.valueOf(values.get("ori_cd")));
				originationDTO.setTimestamp(String.valueOf(values.get("ori_ts")));
				originationDTOList.add(originationDTO);
			}
			return originationDTOList.get(0);
		}
		return null;
	}
}
