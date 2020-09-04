//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.04 at 05:39:40 AM UTC 
//


package com.firstdata.cmpwsapi.schemas.cmpmsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingCost" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{0,8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TCVersion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{1,5}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerRegistrationDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{8}"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerTypeFlag" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemCategory"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{1,4}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAInvitationNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MerchantPromotionalCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerPassword" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChangeCustomerBillingAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChangeCustomerEmailChange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerHomePhoneChange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BL", propOrder = {
    "shippingCost",
    "tcVersion",
    "customerRegistrationDate",
    "customerTypeFlag",
    "itemCategory",
    "paInvitationNumber",
    "merchantPromotionalCode",
    "customerPassword",
    "changeCustomerBillingAddress",
    "changeCustomerEmailChange",
    "customerHomePhoneChange"
})
@XmlSeeAlso({
    EBL001 .class
})
public class BL {

    @XmlElement(name = "ShippingCost")
    protected String shippingCost;
    @XmlElement(name = "TCVersion", required = true)
    protected String tcVersion;
    @XmlElement(name = "CustomerRegistrationDate")
    protected String customerRegistrationDate;
    @XmlElement(name = "CustomerTypeFlag")
    protected String customerTypeFlag;
    @XmlElement(name = "ItemCategory", required = true)
    protected String itemCategory;
    @XmlElement(name = "PAInvitationNumber")
    protected String paInvitationNumber;
    @XmlElement(name = "MerchantPromotionalCode")
    protected String merchantPromotionalCode;
    @XmlElement(name = "CustomerPassword")
    protected String customerPassword;
    @XmlElement(name = "ChangeCustomerBillingAddress")
    protected String changeCustomerBillingAddress;
    @XmlElement(name = "ChangeCustomerEmailChange")
    protected String changeCustomerEmailChange;
    @XmlElement(name = "CustomerHomePhoneChange")
    protected String customerHomePhoneChange;

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCost(String value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the tcVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCVersion() {
        return tcVersion;
    }

    /**
     * Sets the value of the tcVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCVersion(String value) {
        this.tcVersion = value;
    }

    /**
     * Gets the value of the customerRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRegistrationDate() {
        return customerRegistrationDate;
    }

    /**
     * Sets the value of the customerRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRegistrationDate(String value) {
        this.customerRegistrationDate = value;
    }

    /**
     * Gets the value of the customerTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeFlag() {
        return customerTypeFlag;
    }

    /**
     * Sets the value of the customerTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeFlag(String value) {
        this.customerTypeFlag = value;
    }

    /**
     * Gets the value of the itemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategory() {
        return itemCategory;
    }

    /**
     * Sets the value of the itemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategory(String value) {
        this.itemCategory = value;
    }

    /**
     * Gets the value of the paInvitationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAInvitationNumber() {
        return paInvitationNumber;
    }

    /**
     * Sets the value of the paInvitationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAInvitationNumber(String value) {
        this.paInvitationNumber = value;
    }

    /**
     * Gets the value of the merchantPromotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPromotionalCode() {
        return merchantPromotionalCode;
    }

    /**
     * Sets the value of the merchantPromotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPromotionalCode(String value) {
        this.merchantPromotionalCode = value;
    }

    /**
     * Gets the value of the customerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Sets the value of the customerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Gets the value of the changeCustomerBillingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeCustomerBillingAddress() {
        return changeCustomerBillingAddress;
    }

    /**
     * Sets the value of the changeCustomerBillingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeCustomerBillingAddress(String value) {
        this.changeCustomerBillingAddress = value;
    }

    /**
     * Gets the value of the changeCustomerEmailChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeCustomerEmailChange() {
        return changeCustomerEmailChange;
    }

    /**
     * Sets the value of the changeCustomerEmailChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeCustomerEmailChange(String value) {
        this.changeCustomerEmailChange = value;
    }

    /**
     * Gets the value of the customerHomePhoneChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHomePhoneChange() {
        return customerHomePhoneChange;
    }

    /**
     * Sets the value of the customerHomePhoneChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHomePhoneChange(String value) {
        this.customerHomePhoneChange = value;
    }

}
