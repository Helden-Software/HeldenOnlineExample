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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eigenschaftswerte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eigenschaftswerte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}akt"/>
 *         &lt;element ref="{}start"/>
 *         &lt;element ref="{}modi"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}bereich"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eigenschaftswerte", propOrder = {
    "akt",
    "start",
    "modi",
    "name",
    "bereich"
})
@XmlSeeAlso({
    Eigenschaftswertezukaufbar.class
})
public class Eigenschaftswerte {

    @XmlElement(required = true)
    protected BigInteger akt;
    @XmlElement(required = true)
    protected BigInteger start;
    @XmlElement(required = true)
    protected BigInteger modi;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String bereich;

    /**
     * Gets the value of the akt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAkt() {
        return akt;
    }

    /**
     * Sets the value of the akt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAkt(BigInteger value) {
        this.akt = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the modi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModi() {
        return modi;
    }

    /**
     * Sets the value of the modi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModi(BigInteger value) {
        this.modi = value;
    }

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

}
