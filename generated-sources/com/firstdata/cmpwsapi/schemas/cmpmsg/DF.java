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
 * <p>Java class for DF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisteredUserIndicator"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Y"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LastRegisteredUserProfileChangeDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{8}"/&gt;
 *               &lt;maxLength value="8"/&gt;
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
@XmlType(name = "DF", propOrder = {
    "registeredUserIndicator",
    "lastRegisteredUserProfileChangeDate"
})
public class DF {

    @XmlElement(name = "RegisteredUserIndicator", required = true)
    protected String registeredUserIndicator;
    @XmlElement(name = "LastRegisteredUserProfileChangeDate")
    protected String lastRegisteredUserProfileChangeDate;

    /**
     * Gets the value of the registeredUserIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredUserIndicator() {
        return registeredUserIndicator;
    }

    /**
     * Sets the value of the registeredUserIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredUserIndicator(String value) {
        this.registeredUserIndicator = value;
    }

    /**
     * Gets the value of the lastRegisteredUserProfileChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRegisteredUserProfileChangeDate() {
        return lastRegisteredUserProfileChangeDate;
    }

    /**
     * Sets the value of the lastRegisteredUserProfileChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRegisteredUserProfileChangeDate(String value) {
        this.lastRegisteredUserProfileChangeDate = value;
    }

}
