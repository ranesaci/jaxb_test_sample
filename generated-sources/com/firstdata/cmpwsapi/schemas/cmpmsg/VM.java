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
 * <p>Java class for VM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VMResponseRequested" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Y"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value=" "/&gt;
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
@XmlType(name = "VM", propOrder = {
    "postDate",
    "vmResponseRequested"
})
public class VM {

    @XmlElement(name = "PostDate")
    protected String postDate;
    @XmlElement(name = "VMResponseRequested")
    protected String vmResponseRequested;

    /**
     * Gets the value of the postDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDate(String value) {
        this.postDate = value;
    }

    /**
     * Gets the value of the vmResponseRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMResponseRequested() {
        return vmResponseRequested;
    }

    /**
     * Sets the value of the vmResponseRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMResponseRequested(String value) {
        this.vmResponseRequested = value;
    }

}
