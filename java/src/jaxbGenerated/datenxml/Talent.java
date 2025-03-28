//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.26 at 12:11:01 PM CET 
//


package jaxbGenerated.datenxml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}meisterhandwerk"/>
 *         &lt;element ref="{}leittalent"/>
 *         &lt;element ref="{}basis"/>
 *         &lt;element ref="{}nameausfuehrlich"/>
 *         &lt;element ref="{}wert"/>
 *         &lt;element ref="{}probe"/>
 *         &lt;element ref="{}probenwerte"/>
 *         &lt;element ref="{}nameausfuehrlichmitprobe"/>
 *         &lt;element ref="{}at" minOccurs="0"/>
 *         &lt;element ref="{}pa" minOccurs="0"/>
 *         &lt;element ref="{}sprachkomplexität" minOccurs="0"/>
 *         &lt;element ref="{}muttersprache" minOccurs="0"/>
 *         &lt;element ref="{}schriftmuttersprache" minOccurs="0"/>
 *         &lt;element ref="{}zweitlehrsprache" minOccurs="0"/>
 *         &lt;element ref="{}behinderung"/>
 *         &lt;element ref="{}mirakelplus"/>
 *         &lt;element ref="{}mirakelminus"/>
 *         &lt;element ref="{}metatalent"/>
 *         &lt;element ref="{}bereich"/>
 *         &lt;element ref="{}komplexität"/>
 *         &lt;element ref="{}lernkomplexität"/>
 *         &lt;element ref="{}spezialisierungen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "meisterhandwerk",
    "leittalent",
    "basis",
    "nameausfuehrlich",
    "wert",
    "probe",
    "probenwerte",
    "nameausfuehrlichmitprobe",
    "at",
    "pa",
    "sprachkomplexit\u00e4t",
    "muttersprache",
    "schriftmuttersprache",
    "zweitlehrsprache",
    "behinderung",
    "mirakelplus",
    "mirakelminus",
    "metatalent",
    "bereich",
    "komplexit\u00e4t",
    "lernkomplexit\u00e4t",
    "spezialisierungen"
})
@XmlRootElement(name = "talent")
public class Talent {

    @XmlElement(required = true)
    protected String name;
    protected boolean meisterhandwerk;
    protected boolean leittalent;
    protected boolean basis;
    @XmlElement(required = true)
    protected String nameausfuehrlich;
    @XmlElement(required = true)
    protected BigInteger wert;
    @XmlElement(required = true)
    protected String probe;
    @XmlElement(required = true)
    protected String probenwerte;
    @XmlElement(required = true)
    protected String nameausfuehrlichmitprobe;
    protected String at;
    protected String pa;
    protected BigInteger sprachkomplexität;
    protected Boolean muttersprache;
    protected Boolean schriftmuttersprache;
    protected Boolean zweitlehrsprache;
    @XmlElement(required = true)
    protected String behinderung;
    protected boolean mirakelplus;
    protected boolean mirakelminus;
    protected boolean metatalent;
    @XmlElement(required = true)
    protected String bereich;
    @XmlElement(required = true)
    protected String komplexität;
    @XmlElement(required = true)
    protected String lernkomplexität;
    @XmlElement(required = true)
    protected String spezialisierungen;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the meisterhandwerk property.
     * 
     */
    public boolean isMeisterhandwerk() {
        return meisterhandwerk;
    }

    /**
     * Sets the value of the meisterhandwerk property.
     * 
     */
    public void setMeisterhandwerk(boolean value) {
        this.meisterhandwerk = value;
    }

    /**
     * Gets the value of the leittalent property.
     * 
     */
    public boolean isLeittalent() {
        return leittalent;
    }

    /**
     * Sets the value of the leittalent property.
     * 
     */
    public void setLeittalent(boolean value) {
        this.leittalent = value;
    }

    /**
     * Gets the value of the basis property.
     * 
     */
    public boolean isBasis() {
        return basis;
    }

    /**
     * Sets the value of the basis property.
     * 
     */
    public void setBasis(boolean value) {
        this.basis = value;
    }

    /**
     * Gets the value of the nameausfuehrlich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameausfuehrlich() {
        return nameausfuehrlich;
    }

    /**
     * Sets the value of the nameausfuehrlich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameausfuehrlich(String value) {
        this.nameausfuehrlich = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWert(BigInteger value) {
        this.wert = value;
    }

    /**
     * Gets the value of the probe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbe() {
        return probe;
    }

    /**
     * Sets the value of the probe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbe(String value) {
        this.probe = value;
    }

    /**
     * Gets the value of the probenwerte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbenwerte() {
        return probenwerte;
    }

    /**
     * Sets the value of the probenwerte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbenwerte(String value) {
        this.probenwerte = value;
    }

    /**
     * Gets the value of the nameausfuehrlichmitprobe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameausfuehrlichmitprobe() {
        return nameausfuehrlichmitprobe;
    }

    /**
     * Sets the value of the nameausfuehrlichmitprobe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameausfuehrlichmitprobe(String value) {
        this.nameausfuehrlichmitprobe = value;
    }

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAt() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAt(String value) {
        this.at = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPa() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPa(String value) {
        this.pa = value;
    }

    /**
     * Gets the value of the sprachkomplexität property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSprachkomplexität() {
        return sprachkomplexität;
    }

    /**
     * Sets the value of the sprachkomplexität property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSprachkomplexität(BigInteger value) {
        this.sprachkomplexität = value;
    }

    /**
     * Gets the value of the muttersprache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMuttersprache() {
        return muttersprache;
    }

    /**
     * Sets the value of the muttersprache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMuttersprache(Boolean value) {
        this.muttersprache = value;
    }

    /**
     * Gets the value of the schriftmuttersprache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchriftmuttersprache() {
        return schriftmuttersprache;
    }

    /**
     * Sets the value of the schriftmuttersprache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchriftmuttersprache(Boolean value) {
        this.schriftmuttersprache = value;
    }

    /**
     * Gets the value of the zweitlehrsprache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZweitlehrsprache() {
        return zweitlehrsprache;
    }

    /**
     * Sets the value of the zweitlehrsprache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZweitlehrsprache(Boolean value) {
        this.zweitlehrsprache = value;
    }

    /**
     * Gets the value of the behinderung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehinderung() {
        return behinderung;
    }

    /**
     * Sets the value of the behinderung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehinderung(String value) {
        this.behinderung = value;
    }

    /**
     * Gets the value of the mirakelplus property.
     * 
     */
    public boolean isMirakelplus() {
        return mirakelplus;
    }

    /**
     * Sets the value of the mirakelplus property.
     * 
     */
    public void setMirakelplus(boolean value) {
        this.mirakelplus = value;
    }

    /**
     * Gets the value of the mirakelminus property.
     * 
     */
    public boolean isMirakelminus() {
        return mirakelminus;
    }

    /**
     * Sets the value of the mirakelminus property.
     * 
     */
    public void setMirakelminus(boolean value) {
        this.mirakelminus = value;
    }

    /**
     * Gets the value of the metatalent property.
     * 
     */
    public boolean isMetatalent() {
        return metatalent;
    }

    /**
     * Sets the value of the metatalent property.
     * 
     */
    public void setMetatalent(boolean value) {
        this.metatalent = value;
    }

    /**
     * Gets the value of the bereich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBereich() {
        return bereich;
    }

    /**
     * Sets the value of the bereich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBereich(String value) {
        this.bereich = value;
    }

    /**
     * Gets the value of the komplexität property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKomplexität() {
        return komplexität;
    }

    /**
     * Sets the value of the komplexität property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKomplexität(String value) {
        this.komplexität = value;
    }

    /**
     * Gets the value of the lernkomplexität property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLernkomplexität() {
        return lernkomplexität;
    }

    /**
     * Sets the value of the lernkomplexität property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLernkomplexität(String value) {
        this.lernkomplexität = value;
    }

    /**
     * Gets the value of the spezialisierungen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpezialisierungen() {
        return spezialisierungen;
    }

    /**
     * Sets the value of the spezialisierungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpezialisierungen(String value) {
        this.spezialisierungen = value;
    }

}
