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
 * <p>Java class for AddressRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="A" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}A"/&gt;
 *         &lt;element name="AddressExtensions" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}AddressExtensions" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressRecords", propOrder = {

})
public class AddressRecords {

    @XmlElement(name = "A", required = true)
    protected A a;
    @XmlElement(name = "AddressExtensions")
    protected AddressExtensions addressExtensions;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link A }
     *     
     */
    public A getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link A }
     *     
     */
    public void setA(A value) {
        this.a = value;
    }

    /**
     * Gets the value of the addressExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link AddressExtensions }
     *     
     */
    public AddressExtensions getAddressExtensions() {
        return addressExtensions;
    }

    /**
     * Sets the value of the addressExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressExtensions }
     *     
     */
    public void setAddressExtensions(AddressExtensions value) {
        this.addressExtensions = value;
    }

}