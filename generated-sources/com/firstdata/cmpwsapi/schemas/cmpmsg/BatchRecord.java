//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.04 at 05:39:40 AM UTC 
//


package com.firstdata.cmpwsapi.schemas.cmpmsg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}MRecord" minOccurs="0"/&gt;
 *         &lt;element name="SRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}S"/&gt;
 *         &lt;element name="ERecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ExtensionRecords" minOccurs="0"/&gt;
 *         &lt;element name="IRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}InformationRecords" minOccurs="0"/&gt;
 *         &lt;element name="PRecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ProductRecords" minOccurs="0"/&gt;
 *         &lt;element name="FARecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}FormattedAddressRecords" minOccurs="0"/&gt;
 *         &lt;element name="ARecord" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}AddressRecords" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchRecord", propOrder = {
    "mRecord",
    "sRecord",
    "eRecord",
    "iRecord",
    "pRecord",
    "faRecord",
    "aRecord"
})
public class BatchRecord {

    @XmlElement(name = "MRecord")
    protected MRecord mRecord;
    @XmlElement(name = "SRecord", required = true)
    protected S sRecord;
    @XmlElement(name = "ERecord")
    protected ExtensionRecords eRecord;
    @XmlElement(name = "IRecord")
    protected InformationRecords iRecord;
    @XmlElement(name = "PRecord")
    protected ProductRecords pRecord;
    @XmlElement(name = "FARecord")
    protected FormattedAddressRecords faRecord;
    @XmlElement(name = "ARecord")
    protected List<AddressRecords> aRecord;

    /**
     * Gets the value of the mRecord property.
     * 
     * @return
     *     possible object is
     *     {@link MRecord }
     *     
     */
    public MRecord getMRecord() {
        return mRecord;
    }

    /**
     * Sets the value of the mRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link MRecord }
     *     
     */
    public void setMRecord(MRecord value) {
        this.mRecord = value;
    }

    /**
     * Gets the value of the sRecord property.
     * 
     * @return
     *     possible object is
     *     {@link S }
     *     
     */
    public S getSRecord() {
        return sRecord;
    }

    /**
     * Sets the value of the sRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link S }
     *     
     */
    public void setSRecord(S value) {
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

    /**
     * Gets the value of the faRecord property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedAddressRecords }
     *     
     */
    public FormattedAddressRecords getFARecord() {
        return faRecord;
    }

    /**
     * Sets the value of the faRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedAddressRecords }
     *     
     */
    public void setFARecord(FormattedAddressRecords value) {
        this.faRecord = value;
    }

    /**
     * Gets the value of the aRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressRecords }
     * 
     * 
     */
    public List<AddressRecords> getARecord() {
        if (aRecord == null) {
            aRecord = new ArrayList<AddressRecords>();
        }
        return this.aRecord;
    }

}
