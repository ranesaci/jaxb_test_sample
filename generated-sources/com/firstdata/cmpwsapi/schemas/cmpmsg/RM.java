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
 * <p>Java class for RM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MandateActivity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="U"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="R"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MandateId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
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
@XmlType(name = "RM", propOrder = {
    "mandateActivity",
    "mandateId"
})
public class RM {

    @XmlElement(name = "MandateActivity")
    protected String mandateActivity;
    @XmlElement(name = "MandateId")
    protected String mandateId;

    /**
     * Gets the value of the mandateActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateActivity() {
        return mandateActivity;
    }

    /**
     * Sets the value of the mandateActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateActivity(String value) {
        this.mandateActivity = value;
    }

    /**
     * Gets the value of the mandateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateId() {
        return mandateId;
    }

    /**
     * Sets the value of the mandateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateId(String value) {
        this.mandateId = value;
    }

}
