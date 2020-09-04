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
 * <p>Java class for BatchTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchTotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountTotals" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{0,14}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AmountSales" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{0,14}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AmountRefunds" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{0,14}"/&gt;
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
@XmlType(name = "BatchTotals", propOrder = {
    "amountTotals",
    "amountSales",
    "amountRefunds"
})
public class BatchTotals {

    @XmlElement(name = "AmountTotals")
    protected String amountTotals;
    @XmlElement(name = "AmountSales")
    protected String amountSales;
    @XmlElement(name = "AmountRefunds")
    protected String amountRefunds;

    /**
     * Gets the value of the amountTotals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountTotals() {
        return amountTotals;
    }

    /**
     * Sets the value of the amountTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountTotals(String value) {
        this.amountTotals = value;
    }

    /**
     * Gets the value of the amountSales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSales() {
        return amountSales;
    }

    /**
     * Sets the value of the amountSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSales(String value) {
        this.amountSales = value;
    }

    /**
     * Gets the value of the amountRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountRefunds() {
        return amountRefunds;
    }

    /**
     * Sets the value of the amountRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountRefunds(String value) {
        this.amountRefunds = value;
    }

}