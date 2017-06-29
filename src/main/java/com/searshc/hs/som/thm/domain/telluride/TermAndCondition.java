
package com.searshc.hs.som.thm.domain.telluride;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermAndCondition", propOrder = {
    "tnCStatus",
    "version",
    "date",
    "time",
    "storeNumber",
    "registerNumber",
    "associateID",
    "prompt",
    "latestVersion"
})

public class TermAndCondition {
	
	 @XmlElement(name = "TnCStatus")
	    protected String tnCStatus;
	    @XmlElement(name = "Version")
	    protected String version;
	    @XmlElement(name = "Date")
	    protected XMLGregorianCalendar date;
	    @XmlElement(name = "Time")
	    protected XMLGregorianCalendar time;
	    @XmlElement(name = "StoreNumber")
	    protected String storeNumber;
	    @XmlElement(name = "RegisterNumber")
	    protected String registerNumber;
	    @XmlElement(name = "AssociateID")
	    protected String associateID;
	    @XmlElement(name = "Prompt")
	    protected String prompt;
	    @XmlElement(name = "LatestVersion")
	    protected String latestVersion;
	    
		public String getTnCStatus() {
			return tnCStatus;
		}
		public void setTnCStatus(String tnCStatus) {
			this.tnCStatus = tnCStatus;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		public XMLGregorianCalendar getDate() {
			return date;
		}
		public void setDate(XMLGregorianCalendar date) {
			this.date = date;
		}
		public XMLGregorianCalendar getTime() {
			return time;
		}
		public void setTime(XMLGregorianCalendar time) {
			this.time = time;
		}
		public String getStoreNumber() {
			return storeNumber;
		}
		public void setStoreNumber(String storeNumber) {
			this.storeNumber = storeNumber;
		}
		public String getRegisterNumber() {
			return registerNumber;
		}
		public void setRegisterNumber(String registerNumber) {
			this.registerNumber = registerNumber;
		}
		public String getAssociateID() {
			return associateID;
		}
		public void setAssociateID(String associateID) {
			this.associateID = associateID;
		}
		public String getPrompt() {
			return prompt;
		}
		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}
		public String getLatestVersion() {
			return latestVersion;
		}
		public void setLatestVersion(String latestVersion) {
			this.latestVersion = latestVersion;
		}

	    
	    
}
