//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.29 at 01:44:17 PM AEST 
//


package org.openclinica.ns.odm_ext_v130.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-Section complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-Section">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SectionAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SectionAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-Section")
public class OCodmComplexTypeDefinitionSection {

    @XmlAttribute(name = "SectionLabel")
    protected String sectionLabel;
    @XmlAttribute(name = "SectionTitle")
    protected String sectionTitle;
    @XmlAttribute(name = "SectionSubtitle")
    protected String sectionSubtitle;
    @XmlAttribute(name = "SectionInstructions")
    protected String sectionInstructions;
    @XmlAttribute(name = "SectionPageNumber")
    protected String sectionPageNumber;

    /**
     * Gets the value of the sectionLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionLabel() {
        return sectionLabel;
    }

    /**
     * Sets the value of the sectionLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionLabel(String value) {
        this.sectionLabel = value;
    }

    /**
     * Gets the value of the sectionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * Sets the value of the sectionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionTitle(String value) {
        this.sectionTitle = value;
    }

    /**
     * Gets the value of the sectionSubtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionSubtitle() {
        return sectionSubtitle;
    }

    /**
     * Sets the value of the sectionSubtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionSubtitle(String value) {
        this.sectionSubtitle = value;
    }

    /**
     * Gets the value of the sectionInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionInstructions() {
        return sectionInstructions;
    }

    /**
     * Sets the value of the sectionInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionInstructions(String value) {
        this.sectionInstructions = value;
    }

    /**
     * Gets the value of the sectionPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionPageNumber() {
        return sectionPageNumber;
    }

    /**
     * Sets the value of the sectionPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionPageNumber(String value) {
        this.sectionPageNumber = value;
    }

}
