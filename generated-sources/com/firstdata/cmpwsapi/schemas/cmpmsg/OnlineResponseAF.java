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
 * <p>Java class for OnlineResponseAF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineResponseAF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AB" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ContactAddress" minOccurs="0"/&gt;
 *         &lt;element name="ACResponse" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ACResponse" minOccurs="0"/&gt;
 *         &lt;element name="BM" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}BM" minOccurs="0"/&gt;
 *         &lt;element name="BX" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}BX" minOccurs="0"/&gt;
 *         &lt;element name="DB" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}DB" minOccurs="0"/&gt;
 *         &lt;element name="FC" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}FC" minOccurs="0"/&gt;
 *         &lt;element name="ME" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}ME" minOccurs="0"/&gt;
 *         &lt;element name="PB" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}PBPA" minOccurs="0"/&gt;
 *         &lt;element name="TA" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}TA" minOccurs="0"/&gt;
 *         &lt;element name="VL" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}VL" minOccurs="0"/&gt;
 *         &lt;element name="VD" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}VD" minOccurs="0"/&gt;
 *         &lt;element name="DT" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}DT" minOccurs="0"/&gt;
 *         &lt;element name="TX" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}TX" minOccurs="0"/&gt;
 *         &lt;element name="AF" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}AF" minOccurs="0"/&gt;
 *         &lt;element name="FF" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}FFR" minOccurs="0"/&gt;
 *         &lt;element name="SO" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}SO" minOccurs="0"/&gt;
 *         &lt;element name="CS" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}CS" minOccurs="0"/&gt;
 *         &lt;element name="RR" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}RR" minOccurs="0"/&gt;
 *         &lt;element name="TC" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}TCRES" minOccurs="0"/&gt;
 *         &lt;element name="XA" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}XA" minOccurs="0"/&gt;
 *         &lt;element name="CD" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}CDRES" minOccurs="0"/&gt;
 *         &lt;element name="VM" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}VMRES" minOccurs="0"/&gt;
 *         &lt;element name="CR" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}CRRES" minOccurs="0"/&gt;
 *         &lt;element name="AX" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}AXRES" minOccurs="0"/&gt;
 *         &lt;element name="SD" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}SDRES" minOccurs="0"/&gt;
 *         &lt;element name="VO" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}VO" minOccurs="0"/&gt;
 *         &lt;element name="DO" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}DO" minOccurs="0"/&gt;
 *         &lt;element name="P0" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}P0RES" minOccurs="0"/&gt;
 *         &lt;element name="DS" type="{http://firstdata.com/cmpwsapi/schemas/cmpmsg}DSRES" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineResponseAF", propOrder = {

})
public class OnlineResponseAF {

    @XmlElement(name = "AB")
    protected ContactAddress ab;
    @XmlElement(name = "ACResponse")
    protected ACResponse acResponse;
    @XmlElement(name = "BM")
    protected BM bm;
    @XmlElement(name = "BX")
    protected BX bx;
    @XmlElement(name = "DB")
    protected DB db;
    @XmlElement(name = "FC")
    protected FC fc;
    @XmlElement(name = "ME")
    protected ME me;
    @XmlElement(name = "PB")
    protected PBPA pb;
    @XmlElement(name = "TA")
    protected TA ta;
    @XmlElement(name = "VL")
    protected VL vl;
    @XmlElement(name = "VD")
    protected VD vd;
    @XmlElement(name = "DT")
    protected DT dt;
    @XmlElement(name = "TX")
    protected TX tx;
    @XmlElement(name = "AF")
    protected AF af;
    @XmlElement(name = "FF")
    protected FFR ff;
    @XmlElement(name = "SO")
    protected SO so;
    @XmlElement(name = "CS")
    protected CS cs;
    @XmlElement(name = "RR")
    protected RR rr;
    @XmlElement(name = "TC")
    protected TCRES tc;
    @XmlElement(name = "XA")
    protected XA xa;
    @XmlElement(name = "CD")
    protected CDRES cd;
    @XmlElement(name = "VM")
    protected VMRES vm;
    @XmlElement(name = "CR")
    protected CRRES cr;
    @XmlElement(name = "AX")
    protected AXRES ax;
    @XmlElement(name = "SD")
    protected SDRES sd;
    @XmlElement(name = "VO")
    protected VO vo;
    @XmlElement(name = "DO")
    protected DO _do;
    @XmlElement(name = "P0")
    protected P0RES p0;
    @XmlElement(name = "DS")
    protected DSRES ds;

    /**
     * Gets the value of the ab property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddress }
     *     
     */
    public ContactAddress getAB() {
        return ab;
    }

    /**
     * Sets the value of the ab property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddress }
     *     
     */
    public void setAB(ContactAddress value) {
        this.ab = value;
    }

    /**
     * Gets the value of the acResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ACResponse }
     *     
     */
    public ACResponse getACResponse() {
        return acResponse;
    }

    /**
     * Sets the value of the acResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACResponse }
     *     
     */
    public void setACResponse(ACResponse value) {
        this.acResponse = value;
    }

    /**
     * Gets the value of the bm property.
     * 
     * @return
     *     possible object is
     *     {@link BM }
     *     
     */
    public BM getBM() {
        return bm;
    }

    /**
     * Sets the value of the bm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BM }
     *     
     */
    public void setBM(BM value) {
        this.bm = value;
    }

    /**
     * Gets the value of the bx property.
     * 
     * @return
     *     possible object is
     *     {@link BX }
     *     
     */
    public BX getBX() {
        return bx;
    }

    /**
     * Sets the value of the bx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BX }
     *     
     */
    public void setBX(BX value) {
        this.bx = value;
    }

    /**
     * Gets the value of the db property.
     * 
     * @return
     *     possible object is
     *     {@link DB }
     *     
     */
    public DB getDB() {
        return db;
    }

    /**
     * Sets the value of the db property.
     * 
     * @param value
     *     allowed object is
     *     {@link DB }
     *     
     */
    public void setDB(DB value) {
        this.db = value;
    }

    /**
     * Gets the value of the fc property.
     * 
     * @return
     *     possible object is
     *     {@link FC }
     *     
     */
    public FC getFC() {
        return fc;
    }

    /**
     * Sets the value of the fc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FC }
     *     
     */
    public void setFC(FC value) {
        this.fc = value;
    }

    /**
     * Gets the value of the me property.
     * 
     * @return
     *     possible object is
     *     {@link ME }
     *     
     */
    public ME getME() {
        return me;
    }

    /**
     * Sets the value of the me property.
     * 
     * @param value
     *     allowed object is
     *     {@link ME }
     *     
     */
    public void setME(ME value) {
        this.me = value;
    }

    /**
     * Gets the value of the pb property.
     * 
     * @return
     *     possible object is
     *     {@link PBPA }
     *     
     */
    public PBPA getPB() {
        return pb;
    }

    /**
     * Sets the value of the pb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PBPA }
     *     
     */
    public void setPB(PBPA value) {
        this.pb = value;
    }

    /**
     * Gets the value of the ta property.
     * 
     * @return
     *     possible object is
     *     {@link TA }
     *     
     */
    public TA getTA() {
        return ta;
    }

    /**
     * Sets the value of the ta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TA }
     *     
     */
    public void setTA(TA value) {
        this.ta = value;
    }

    /**
     * Gets the value of the vl property.
     * 
     * @return
     *     possible object is
     *     {@link VL }
     *     
     */
    public VL getVL() {
        return vl;
    }

    /**
     * Sets the value of the vl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VL }
     *     
     */
    public void setVL(VL value) {
        this.vl = value;
    }

    /**
     * Gets the value of the vd property.
     * 
     * @return
     *     possible object is
     *     {@link VD }
     *     
     */
    public VD getVD() {
        return vd;
    }

    /**
     * Sets the value of the vd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VD }
     *     
     */
    public void setVD(VD value) {
        this.vd = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DT }
     *     
     */
    public DT getDT() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DT }
     *     
     */
    public void setDT(DT value) {
        this.dt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TX }
     *     
     */
    public TX getTX() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TX }
     *     
     */
    public void setTX(TX value) {
        this.tx = value;
    }

    /**
     * Gets the value of the af property.
     * 
     * @return
     *     possible object is
     *     {@link AF }
     *     
     */
    public AF getAF() {
        return af;
    }

    /**
     * Sets the value of the af property.
     * 
     * @param value
     *     allowed object is
     *     {@link AF }
     *     
     */
    public void setAF(AF value) {
        this.af = value;
    }

    /**
     * Gets the value of the ff property.
     * 
     * @return
     *     possible object is
     *     {@link FFR }
     *     
     */
    public FFR getFF() {
        return ff;
    }

    /**
     * Sets the value of the ff property.
     * 
     * @param value
     *     allowed object is
     *     {@link FFR }
     *     
     */
    public void setFF(FFR value) {
        this.ff = value;
    }

    /**
     * Gets the value of the so property.
     * 
     * @return
     *     possible object is
     *     {@link SO }
     *     
     */
    public SO getSO() {
        return so;
    }

    /**
     * Sets the value of the so property.
     * 
     * @param value
     *     allowed object is
     *     {@link SO }
     *     
     */
    public void setSO(SO value) {
        this.so = value;
    }

    /**
     * Gets the value of the cs property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getCS() {
        return cs;
    }

    /**
     * Sets the value of the cs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setCS(CS value) {
        this.cs = value;
    }

    /**
     * Gets the value of the rr property.
     * 
     * @return
     *     possible object is
     *     {@link RR }
     *     
     */
    public RR getRR() {
        return rr;
    }

    /**
     * Sets the value of the rr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RR }
     *     
     */
    public void setRR(RR value) {
        this.rr = value;
    }

    /**
     * Gets the value of the tc property.
     * 
     * @return
     *     possible object is
     *     {@link TCRES }
     *     
     */
    public TCRES getTC() {
        return tc;
    }

    /**
     * Sets the value of the tc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRES }
     *     
     */
    public void setTC(TCRES value) {
        this.tc = value;
    }

    /**
     * Gets the value of the xa property.
     * 
     * @return
     *     possible object is
     *     {@link XA }
     *     
     */
    public XA getXA() {
        return xa;
    }

    /**
     * Sets the value of the xa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XA }
     *     
     */
    public void setXA(XA value) {
        this.xa = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link CDRES }
     *     
     */
    public CDRES getCD() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDRES }
     *     
     */
    public void setCD(CDRES value) {
        this.cd = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link VMRES }
     *     
     */
    public VMRES getVM() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMRES }
     *     
     */
    public void setVM(VMRES value) {
        this.vm = value;
    }

    /**
     * Gets the value of the cr property.
     * 
     * @return
     *     possible object is
     *     {@link CRRES }
     *     
     */
    public CRRES getCR() {
        return cr;
    }

    /**
     * Sets the value of the cr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRRES }
     *     
     */
    public void setCR(CRRES value) {
        this.cr = value;
    }

    /**
     * Gets the value of the ax property.
     * 
     * @return
     *     possible object is
     *     {@link AXRES }
     *     
     */
    public AXRES getAX() {
        return ax;
    }

    /**
     * Sets the value of the ax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AXRES }
     *     
     */
    public void setAX(AXRES value) {
        this.ax = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link SDRES }
     *     
     */
    public SDRES getSD() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDRES }
     *     
     */
    public void setSD(SDRES value) {
        this.sd = value;
    }

    /**
     * Gets the value of the vo property.
     * 
     * @return
     *     possible object is
     *     {@link VO }
     *     
     */
    public VO getVO() {
        return vo;
    }

    /**
     * Sets the value of the vo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VO }
     *     
     */
    public void setVO(VO value) {
        this.vo = value;
    }

    /**
     * Gets the value of the do property.
     * 
     * @return
     *     possible object is
     *     {@link DO }
     *     
     */
    public DO getDO() {
        return _do;
    }

    /**
     * Sets the value of the do property.
     * 
     * @param value
     *     allowed object is
     *     {@link DO }
     *     
     */
    public void setDO(DO value) {
        this._do = value;
    }

    /**
     * Gets the value of the p0 property.
     * 
     * @return
     *     possible object is
     *     {@link P0RES }
     *     
     */
    public P0RES getP0() {
        return p0;
    }

    /**
     * Sets the value of the p0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link P0RES }
     *     
     */
    public void setP0(P0RES value) {
        this.p0 = value;
    }

    /**
     * Gets the value of the ds property.
     * 
     * @return
     *     possible object is
     *     {@link DSRES }
     *     
     */
    public DSRES getDS() {
        return ds;
    }

    /**
     * Sets the value of the ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSRES }
     *     
     */
    public void setDS(DSRES value) {
        this.ds = value;
    }

}
