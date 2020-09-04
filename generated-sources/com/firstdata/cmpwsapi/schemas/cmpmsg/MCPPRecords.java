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
 * <p>Java class for MCPPRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCPPRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PP0001" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}MCPP0001"/&gt;
 *         &lt;element name="LineItems" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}MCProcurementLevelData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCPPRecords", propOrder = {
    "pp0001",
    "lineItems"
})
public class MCPPRecords {

    @XmlElement(name = "PP0001", required = true)
    protected MCPP0001 pp0001;
    @XmlElement(name = "LineItems", required = true)
    protected MCProcurementLevelData lineItems;

    /**
     * Gets the value of the pp0001 property.
     * 
     * @return
     *     possible object is
     *     {@link MCPP0001 }
     *     
     */
    public MCPP0001 getPP0001() {
        return pp0001;
    }

    /**
     * Sets the value of the pp0001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCPP0001 }
     *     
     */
    public void setPP0001(MCPP0001 value) {
        this.pp0001 = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link MCProcurementLevelData }
     *     
     */
    public MCProcurementLevelData getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCProcurementLevelData }
     *     
     */
    public void setLineItems(MCProcurementLevelData value) {
        this.lineItems = value;
    }

}
