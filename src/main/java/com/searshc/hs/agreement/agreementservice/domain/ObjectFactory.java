package com.searshc.hs.agreement.agreementservice.domain;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.sears.hs.agreement.domain package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.sears.hs.agreement.domain
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ItemDetail }
	 * 
	 */
	public ItemDetail createItemDetail() {
		return new ItemDetail();
	}

	/**
	 * Create an instance of {@link QueueCancel }
	 * 
	 */
	public QueueCancel createQueueCancel() {
		return new QueueCancel();
	}

	/**
	 * Create an instance of {@link UpdateDetail }
	 * 
	 */
	public UpdateDetail createUpdateDetail() {
		return new UpdateDetail();
	}

	/**
	 * Create an instance of {@link SettlementItem }
	 * 
	 */
	public SettlementItem createSettlementItem() {
		return new SettlementItem();
	}

	/**
	 * Create an instance of {@link Agreement }
	 * 
	 */
	public Agreement createAgreement() {
		return new Agreement();
	}

	/**
	 * Create an instance of {@link AgreementDetail }
	 * 
	 */
	public AgreementDetail createAgreementDetail() {
		return new AgreementDetail();
	}

	/**
	 * Create an instance of {@link CancelItem }
	 * 
	 */
	public CancelItem createCancelItem() {
		return new CancelItem();
	}

	/**
	 * Create an instance of {@link Customer }
	 * 
	 */
	public Customer createCustomer() {
		return new Customer();
	}

	/**
	 * Create an instance of {@link AddItem }
	 * 
	 */
	public AddItem createAddItem() {
		return new AddItem();
	}

	/**
	 * Create an instance of {@link AddStatus }
	 * 
	 */
	public AddStatus createAddStatus() {
		return new AddStatus();
	}

	/**
	 * Create an instance of {@link AddItemStatus }
	 * 
	 */
	public AddItemStatus createAddItemStatus() {
		return new AddItemStatus();
	}

	/**
	 * Create an instance of {@link SettlementPayment }
	 * 
	 */
	public SettlementPayment createSettlementPayment() {
		return new SettlementPayment();
	}

}
