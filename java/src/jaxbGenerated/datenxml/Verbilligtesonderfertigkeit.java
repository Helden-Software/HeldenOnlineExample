//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.26 at 12:11:01 PM CET 
//


package jaxbGenerated.datenxml;

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
 *         &lt;element ref="{}nameausfuehrlich"/>
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
    "nameausfuehrlich"
})
@XmlRootElement(name = "verbilligtesonderfertigkeit")
public class Verbilligtesonderfertigkeit {

    @XmlElement(required = true)
    protected String nameausfuehrlich;

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

}
