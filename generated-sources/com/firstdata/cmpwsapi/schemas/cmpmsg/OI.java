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
 * <p>Java class for OI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductDeliveryTypeIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="CNC"/&gt;
 *               &lt;enumeration value="DIG"/&gt;
 *               &lt;enumeration value="PHY"/&gt;
 *               &lt;enumeration value="SVC"/&gt;
 *               &lt;enumeration value="TBD"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingCarrier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="DH"/&gt;
 *               &lt;enumeration value="FE"/&gt;
 *               &lt;enumeration value="GH"/&gt;
 *               &lt;enumeration value="OH"/&gt;
 *               &lt;enumeration value="PL"/&gt;
 *               &lt;enumeration value="PS"/&gt;
 *               &lt;enumeration value="UP"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="G"/&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="M"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="O"/&gt;
 *               &lt;enumeration value="P"/&gt;
 *               &lt;enumeration value="S"/&gt;
 *               &lt;enumeration value="T"/&gt;
 *               &lt;enumeration value="W"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{6}"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{6}"/&gt;
 *               &lt;maxLength value="6"/&gt;
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
@XmlType(name = "OI", propOrder = {
    "productDeliveryTypeIndicator",
    "shippingCarrier",
    "shippingMethod",
    "orderDate",
    "orderTime"
})
public class OI {

    @XmlElement(name = "ProductDeliveryTypeIndicator")
    protected String productDeliveryTypeIndicator;
    @XmlElement(name = "ShippingCarrier")
    protected String shippingCarrier;
    @XmlElement(name = "ShippingMethod")
    protected String shippingMethod;
    @XmlElement(name = "OrderDate")
    protected String orderDate;
    @XmlElement(name = "OrderTime")
    protected String orderTime;

    /**
     * Gets the value of the productDeliveryTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDeliveryTypeIndicator() {
        return productDeliveryTypeIndicator;
    }

    /**
     * Sets the value of the productDeliveryTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDeliveryTypeIndicator(String value) {
        this.productDeliveryTypeIndicator = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * Sets the value of the shippingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCarrier(String value) {
        this.shippingCarrier = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * Sets the value of the orderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTime(String value) {
        this.orderTime = value;
    }

}