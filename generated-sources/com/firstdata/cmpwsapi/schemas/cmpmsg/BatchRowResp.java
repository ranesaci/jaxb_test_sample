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
 * <p>Java class for BatchRowResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchRowResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}SRecordOutput"/&gt;
 *         &lt;element name="ERecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ExtensionRecords" minOccurs="0"/&gt;
 *         &lt;element name="IRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}InformationRecords" minOccurs="0"/&gt;
 *         &lt;element name="PRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ProductRecords" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchRowResp", propOrder = {

})
public class BatchRowResp {

    @XmlElement(name = "SRecord", required = true)
    protected SRecordOutput sRecord;
    @XmlElement(name = "ERecord")
    protected ExtensionRecords eRecord;
    @XmlElement(name = "IRecord")
    protected InformationRecords iRecord;
    @XmlElement(name = "PRecord")
    protected ProductRecords pRecord;

    /**
     * Gets the value of the sRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SRecordOutput }
     *     
     */
    public SRecordOutput getSRecord() {
        return sRecord;
    }

    /**
     * Sets the value of the sRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SRecordOutput }
     *     
     */
    public void setSRecord(SRecordOutput value) {
        this.sRecord = value;
    }

    /**
     * Gets the value of the eRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionRecords }
     *     
     */
    public ExtensionRecords getERecord() {
        return eRecord;
    }

    /**
     * Sets the value of the eRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionRecords }
     *     
     */
    public void setERecord(ExtensionRecords value) {
        this.eRecord = value;
    }

    /**
     * Gets the value of the iRecord property.
     * 
     * @return
     *     possible object is
     *     {@link InformationRecords }
     *     
     */
    public InformationRecords getIRecord() {
        return iRecord;
    }

    /**
     * Sets the value of the iRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationRecords }
     *     
     */
    public void setIRecord(InformationRecords value) {
        this.iRecord = value;
    }

    /**
     * Gets the value of the pRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRecords }
     *     
     */
    public ProductRecords getPRecord() {
        return pRecord;
    }

    /**
     * Sets the value of the pRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRecords }
     *     
     */
    public void setPRecord(ProductRecords value) {
        this.pRecord = value;
    }

}
