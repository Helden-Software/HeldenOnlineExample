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
 *         &lt;element ref="{}config"/>
 *         &lt;element ref="{}angaben"/>
 *         &lt;element ref="{}eigenschaften"/>
 *         &lt;element ref="{}münzen"/>
 *         &lt;element ref="{}vorteile"/>
 *         &lt;element ref="{}sonderfertigkeiten"/>
 *         &lt;element ref="{}verbilligtesonderfertigkeiten"/>
 *         &lt;element ref="{}talentliste"/>
 *         &lt;element ref="{}zauberliste"/>
 *         &lt;element ref="{}gegenstaende"/>
 *         &lt;element ref="{}verbindungen"/>
 *         &lt;element ref="{}kampfsets"/>
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
    "config",
    "angaben",
    "eigenschaften",
    "m\u00fcnzen",
    "vorteile",
    "sonderfertigkeiten",
    "verbilligtesonderfertigkeiten",
    "talentliste",
    "zauberliste",
    "gegenstaende",
    "verbindungen",
    "kampfsets"
})
@XmlRootElement(name = "daten")
public class Daten {

    @XmlElement(required = true)
    protected Config config;
    @XmlElement(required = true)
    protected Angaben angaben;
    @XmlElement(required = true)
    protected Eigenschaften eigenschaften;
    @XmlElement(required = true)
    protected Münzen münzen;
    @XmlElement(required = true)
    protected Vorteile vorteile;
    @XmlElement(required = true)
    protected Sonderfertigkeiten sonderfertigkeiten;
    @XmlElement(required = true)
    protected Verbilligtesonderfertigkeiten verbilligtesonderfertigkeiten;
    @XmlElement(required = true)
    protected Talentliste talentliste;
    @XmlElement(required = true)
    protected Zauberliste zauberliste;
    @XmlElement(required = true)
    protected Gegenstaende gegenstaende;
    @XmlElement(required = true)
    protected Verbindungen verbindungen;
    @XmlElement(required = true)
    protected Kampfsets kampfsets;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setConfig(Config value) {
        this.config = value;
    }

    /**
     * Gets the value of the angaben property.
     * 
     * @return
     *     possible object is
     *     {@link Angaben }
     *     
     */
    public Angaben getAngaben() {
        return angaben;
    }

    /**
     * Sets the value of the angaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angaben }
     *     
     */
    public void setAngaben(Angaben value) {
        this.angaben = value;
    }

    /**
     * Gets the value of the eigenschaften property.
     * 
     * @return
     *     possible object is
     *     {@link Eigenschaften }
     *     
     */
    public Eigenschaften getEigenschaften() {
        return eigenschaften;
    }

    /**
     * Sets the value of the eigenschaften property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eigenschaften }
     *     
     */
    public void setEigenschaften(Eigenschaften value) {
        this.eigenschaften = value;
    }

    /**
     * Gets the value of the münzen property.
     * 
     * @return
     *     possible object is
     *     {@link Münzen }
     *     
     */
    public Münzen getMünzen() {
        return münzen;
    }

    /**
     * Sets the value of the münzen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Münzen }
     *     
     */
    public void setMünzen(Münzen value) {
        this.münzen = value;
    }

    /**
     * Gets the value of the vorteile property.
     * 
     * @return
     *     possible object is
     *     {@link Vorteile }
     *     
     */
    public Vorteile getVorteile() {
        return vorteile;
    }

    /**
     * Sets the value of the vorteile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vorteile }
     *     
     */
    public void setVorteile(Vorteile value) {
        this.vorteile = value;
    }

    /**
     * Gets the value of the sonderfertigkeiten property.
     * 
     * @return
     *     possible object is
     *     {@link Sonderfertigkeiten }
     *     
     */
    public Sonderfertigkeiten getSonderfertigkeiten() {
        return sonderfertigkeiten;
    }

    /**
     * Sets the value of the sonderfertigkeiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sonderfertigkeiten }
     *     
     */
    public void setSonderfertigkeiten(Sonderfertigkeiten value) {
        this.sonderfertigkeiten = value;
    }

    /**
     * Gets the value of the verbilligtesonderfertigkeiten property.
     * 
     * @return
     *     possible object is
     *     {@link Verbilligtesonderfertigkeiten }
     *     
     */
    public Verbilligtesonderfertigkeiten getVerbilligtesonderfertigkeiten() {
        return verbilligtesonderfertigkeiten;
    }

    /**
     * Sets the value of the verbilligtesonderfertigkeiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verbilligtesonderfertigkeiten }
     *     
     */
    public void setVerbilligtesonderfertigkeiten(Verbilligtesonderfertigkeiten value) {
        this.verbilligtesonderfertigkeiten = value;
    }

    /**
     * Gets the value of the talentliste property.
     * 
     * @return
     *     possible object is
     *     {@link Talentliste }
     *     
     */
    public Talentliste getTalentliste() {
        return talentliste;
    }

    /**
     * Sets the value of the talentliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Talentliste }
     *     
     */
    public void setTalentliste(Talentliste value) {
        this.talentliste = value;
    }

    /**
     * Gets the value of the zauberliste property.
     * 
     * @return
     *     possible object is
     *     {@link Zauberliste }
     *     
     */
    public Zauberliste getZauberliste() {
        return zauberliste;
    }

    /**
     * Sets the value of the zauberliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zauberliste }
     *     
     */
    public void setZauberliste(Zauberliste value) {
        this.zauberliste = value;
    }

    /**
     * Gets the value of the gegenstaende property.
     * 
     * @return
     *     possible object is
     *     {@link Gegenstaende }
     *     
     */
    public Gegenstaende getGegenstaende() {
        return gegenstaende;
    }

    /**
     * Sets the value of the gegenstaende property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gegenstaende }
     *     
     */
    public void setGegenstaende(Gegenstaende value) {
        this.gegenstaende = value;
    }

    /**
     * Gets the value of the verbindungen property.
     * 
     * @return
     *     possible object is
     *     {@link Verbindungen }
     *     
     */
    public Verbindungen getVerbindungen() {
        return verbindungen;
    }

    /**
     * Sets the value of the verbindungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verbindungen }
     *     
     */
    public void setVerbindungen(Verbindungen value) {
        this.verbindungen = value;
    }

    /**
     * Gets the value of the kampfsets property.
     * 
     * @return
     *     possible object is
     *     {@link Kampfsets }
     *     
     */
    public Kampfsets getKampfsets() {
        return kampfsets;
    }

    /**
     * Sets the value of the kampfsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kampfsets }
     *     
     */
    public void setKampfsets(Kampfsets value) {
        this.kampfsets = value;
    }

}
