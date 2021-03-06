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
 * <p>Java class for DP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PacketType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PacketLength"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{4}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DataPacket"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4095"/&gt;
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
@XmlType(name = "DP", propOrder = {
    "packetType",
    "packetLength",
    "dataPacket"
})
public class DP {

    @XmlElement(name = "PacketType", required = true)
    protected String packetType;
    @XmlElement(name = "PacketLength", required = true)
    protected String packetLength;
    @XmlElement(name = "DataPacket", required = true)
    protected String dataPacket;

    /**
     * Gets the value of the packetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketType() {
        return packetType;
    }

    /**
     * Sets the value of the packetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketType(String value) {
        this.packetType = value;
    }

    /**
     * Gets the value of the packetLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketLength() {
        return packetLength;
    }

    /**
     * Sets the value of the packetLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketLength(String value) {
        this.packetLength = value;
    }

    /**
     * Gets the value of the dataPacket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPacket() {
        return dataPacket;
    }

    /**
     * Sets the value of the dataPacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPacket(String value) {
        this.dataPacket = value;
    }

}
