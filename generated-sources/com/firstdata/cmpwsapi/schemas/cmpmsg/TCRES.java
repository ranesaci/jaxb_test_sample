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
 * <p>Java class for TCRES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCRES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TraceID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACHStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DenialRecordNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DelayedShipID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrefferedFlag" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DelayedShipDateTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "TCRES", propOrder = {
    "traceID",
    "achStatus",
    "denialRecordNumber",
    "delayedShipID",
    "prefferedFlag",
    "delayedShipDateTime"
})
public class TCRES {

    @XmlElement(name = "TraceID", required = true)
    protected String traceID;
    @XmlElement(name = "ACHStatus", required = true)
    protected String achStatus;
    @XmlElement(name = "DenialRecordNumber")
    protected String denialRecordNumber;
    @XmlElement(name = "DelayedShipID")
    protected String delayedShipID;
    @XmlElement(name = "PrefferedFlag")
    protected String prefferedFlag;
    @XmlElement(name = "DelayedShipDateTime")
    protected String delayedShipDateTime;

    /**
     * Gets the value of the traceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceID() {
        return traceID;
    }

    /**
     * Sets the value of the traceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceID(String value) {
        this.traceID = value;
    }

    /**
     * Gets the value of the achStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACHStatus() {
        return achStatus;
    }

    /**
     * Sets the value of the achStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACHStatus(String value) {
        this.achStatus = value;
    }

    /**
     * Gets the value of the denialRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialRecordNumber() {
        return denialRecordNumber;
    }

    /**
     * Sets the value of the denialRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialRecordNumber(String value) {
        this.denialRecordNumber = value;
    }

    /**
     * Gets the value of the delayedShipID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayedShipID() {
        return delayedShipID;
    }

    /**
     * Sets the value of the delayedShipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayedShipID(String value) {
        this.delayedShipID = value;
    }

    /**
     * Gets the value of the prefferedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefferedFlag() {
        return prefferedFlag;
    }

    /**
     * Sets the value of the prefferedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefferedFlag(String value) {
        this.prefferedFlag = value;
    }

    /**
     * Gets the value of the delayedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayedShipDateTime() {
        return delayedShipDateTime;
    }

    /**
     * Sets the value of the delayedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayedShipDateTime(String value) {
        this.delayedShipDateTime = value;
    }

}
