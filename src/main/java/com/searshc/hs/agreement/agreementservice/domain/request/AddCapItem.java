package com.searshc.hs.agreement.agreementservice.domain.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddCapItem")
public class AddCapItem {
	private String itemSfx = "";
	private String mdseCd = "";
	private String svcLoc = "";
	private String inOutInd = "";
	private String taxInd = "";
	private String updateInd = "";
	private String obligorCd = "";
	private String discOverFl = "";

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddCapItem [itemSfx=");
		builder.append(itemSfx);
		builder.append(", mdseCd=");
		builder.append(mdseCd);
		builder.append(", svcLoc=");
		builder.append(svcLoc);
		builder.append(", inOutInd=");
		builder.append(inOutInd);
		builder.append(", taxInd=");
		builder.append(taxInd);
		builder.append(", updateInd=");
		builder.append(updateInd);
		builder.append(", obligorCd=");
		builder.append(obligorCd);
		builder.append(", discOverFl=");
		builder.append(discOverFl);
		builder.append("]");
		return builder.toString();
	}

	public String getDiscOverFl() {
		return discOverFl;
	}

	public void setDiscOverFl(String discOverFl) {
		this.discOverFl = discOverFl;
	}

	public String getInOutInd() {
		return inOutInd;
	}

	public void setInOutInd(String inOutInd) {
		this.inOutInd = inOutInd;
	}

	public String getItemSfx() {
		return itemSfx;
	}

	public void setItemSfx(String itemSfx) {
		this.itemSfx = itemSfx;
	}

	public String getMdseCd() {
		return mdseCd;
	}

	public void setMdseCd(String mdseCd) {
		this.mdseCd = mdseCd;
	}

	public String getObligorCd() {
		return obligorCd;
	}

	public void setObligorCd(String obligorCd) {
		this.obligorCd = obligorCd;
	}

	public String getSvcLoc() {
		return svcLoc;
	}

	public void setSvcLoc(String svcLoc) {
		this.svcLoc = svcLoc;
	}

	public String getTaxInd() {
		return taxInd;
	}

	public void setTaxInd(String taxInd) {
		this.taxInd = taxInd;
	}

	public String getUpdateInd() {
		return updateInd;
	}

	public void setUpdateInd(String updateInd) {
		this.updateInd = updateInd;
	}
	
	
}
