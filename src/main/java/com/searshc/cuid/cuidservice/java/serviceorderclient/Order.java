package com.searshc.cuid.cuidservice.java.serviceorderclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
	public Id id;
	public boolean canceled;
	public boolean closed;
	public boolean techEnRoute;
	public boolean techArrived;
	public String serviceEta;
	public String scheduleDate;
	public String timeWindow;
	public String closedCallCode;
	public String orderPostalCode;
	public String timeZonePostalCode;
	public String locationDeviceId;
	public double created;
	public double modified;
	
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public boolean isCanceled() {
		return canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public boolean isTechEnRoute() {
		return techEnRoute;
	}
	public void setTechEnRoute(boolean techEnRoute) {
		this.techEnRoute = techEnRoute;
	}
	public boolean isTechArrived() {
		return techArrived;
	}
	public void setTechArrived(boolean techArrived) {
		this.techArrived = techArrived;
	}
	public String getServiceEta() {
		return serviceEta;
	}
	public void setServiceEta(String serviceEta) {
		this.serviceEta = serviceEta;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getTimeWindow() {
		return timeWindow;
	}
	public void setTimeWindow(String timeWindow) {
		this.timeWindow = timeWindow;
	}
	public String getClosedCallCode() {
		return closedCallCode;
	}
	public void setClosedCallCode(String closedCallCode) {
		this.closedCallCode = closedCallCode;
	}
	public String getOrderPostalCode() {
		return orderPostalCode;
	}
	public void setOrderPostalCode(String orderPostalCode) {
		this.orderPostalCode = orderPostalCode;
	}
	public String getTimeZonePostalCode() {
		return timeZonePostalCode;
	}
	public void setTimeZonePostalCode(String timeZonePostalCode) {
		this.timeZonePostalCode = timeZonePostalCode;
	}
	public String getLocationDeviceId() {
		return locationDeviceId;
	}
	public void setLocationDeviceId(String locationDeviceId) {
		this.locationDeviceId = locationDeviceId;
	}
	public double getCreated() {
		return created;
	}
	public void setCreated(double created) {
		this.created = created;
	}
	public double getModified() {
		return modified;
	}
	public void setModified(double modified) {
		this.modified = modified;
	}
}
