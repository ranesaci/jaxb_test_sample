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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="B"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="G"/&gt;
 *               &lt;enumeration value="H"/&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="L"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="R"/&gt;
 *               &lt;enumeration value="S"/&gt;
 *               &lt;enumeration value="M"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressSubType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressInformation" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}AddressInformation" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIPAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="45"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerHostName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerEmailAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerANI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerII" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomerBrowserName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeviceID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
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
@XmlType(name = "A", propOrder = {
    "addressType",
    "addressSubType",
    "addressInformation",
    "customerIPAddress",
    "customerHostName",
    "customerEmailAddress",
    "customerANI",
    "customerII",
    "customerBrowserName",
    "deviceID"
})
public class A {

    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "AddressSubType")
    protected String addressSubType;
    @XmlElement(name = "AddressInformation")
    protected AddressInformation addressInformation;
    @XmlElement(name = "CustomerIPAddress")
    protected String customerIPAddress;
    @XmlElement(name = "CustomerHostName")
    protected String customerHostName;
    @XmlElement(name = "CustomerEmailAddress")
    protected String customerEmailAddress;
    @XmlElement(name = "CustomerANI")
    protected String customerANI;
    @XmlElement(name = "CustomerII")
    protected String customerII;
    @XmlElement(name = "CustomerBrowserName")
    protected String customerBrowserName;
    @XmlElement(name = "DeviceID")
    protected String deviceID;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSubType() {
        return addressSubType;
    }

    /**
     * Sets the value of the addressSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSubType(String value) {
        this.addressSubType = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformation }
     *     
     */
    public AddressInformation getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformation }
     *     
     */
    public void setAddressInformation(AddressInformation value) {
        this.addressInformation = value;
    }

    /**
     * Gets the value of the customerIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIPAddress() {
        return customerIPAddress;
    }

    /**
     * Sets the value of the customerIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIPAddress(String value) {
        this.customerIPAddress = value;
    }

    /**
     * Gets the value of the customerHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHostName() {
        return customerHostName;
    }

    /**
     * Sets the value of the customerHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHostName(String value) {
        this.customerHostName = value;
    }

    /**
     * Gets the value of the customerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    /**
     * Sets the value of the customerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmailAddress(String value) {
        this.customerEmailAddress = value;
    }

    /**
     * Gets the value of the customerANI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerANI() {
        return customerANI;
    }

    /**
     * Sets the value of the customerANI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerANI(String value) {
        this.customerANI = value;
    }

    /**
     * Gets the value of the customerII property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerII() {
        return customerII;
    }

    /**
     * Sets the value of the customerII property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerII(String value) {
        this.customerII = value;
    }

    /**
     * Gets the value of the customerBrowserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBrowserName() {
        return customerBrowserName;
    }

    /**
     * Sets the value of the customerBrowserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBrowserName(String value) {
        this.customerBrowserName = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

}
