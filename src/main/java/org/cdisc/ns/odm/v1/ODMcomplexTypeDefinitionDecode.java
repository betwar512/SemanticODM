//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.29 at 07:33:46 PM AEST 
//


package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Decode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Decode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}TranslatedText" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}DecodeElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}DecodeAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Decode", propOrder = {
    "translatedText"
})
public class ODMcomplexTypeDefinitionDecode {

    @XmlElement(name = "TranslatedText", required = true)
    protected List<ODMcomplexTypeDefinitionTranslatedText> translatedText;

    /**
     * Gets the value of the translatedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translatedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslatedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionTranslatedText }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionTranslatedText> getTranslatedText() {
        if (translatedText == null) {
            translatedText = new ArrayList<ODMcomplexTypeDefinitionTranslatedText>();
        }
        return this.translatedText;
    }

}