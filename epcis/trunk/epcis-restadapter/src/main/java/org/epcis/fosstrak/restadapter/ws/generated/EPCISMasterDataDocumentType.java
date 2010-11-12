package org.epcis.fosstrak.restadapter.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * 
 *       MasterData document that contains a Header and a Body.
 *               
 * 
 * <p>Java class for EPCISMasterDataDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISMasterDataDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:epcglobal:xsd:1}Document">
 *       &lt;sequence>
 *         &lt;element name="EPCISHeader" type="{urn:epcglobal:epcis:xsd:1}EPCISHeaderType" minOccurs="0"/>
 *         &lt;element name="EPCISBody" type="{urn:epcglobal:epcis-masterdata:xsd:1}EPCISMasterDataBodyType"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis-masterdata:xsd:1}EPCISMasterDataDocumentExtensionType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISMasterDataDocumentType", namespace = "urn:epcglobal:epcis-masterdata:xsd:1", propOrder = {
    "epcisHeader",
    "epcisBody",
    "extension",
    "any"
})
public class EPCISMasterDataDocumentType
        extends Document {

    @XmlElement(name = "EPCISHeader")
    protected EPCISHeaderType epcisHeader;
    @XmlElement(name = "EPCISBody", required = true)
    protected EPCISMasterDataBodyType epcisBody;
    protected EPCISMasterDataDocumentExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the epcisHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISHeaderType }
     *     
     */
    public EPCISHeaderType getEPCISHeader() {
        return epcisHeader;
    }

    /**
     * Sets the value of the epcisHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISHeaderType }
     *     
     */
    public void setEPCISHeader(EPCISHeaderType value) {
        this.epcisHeader = value;
    }

    /**
     * Gets the value of the epcisBody property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISMasterDataBodyType }
     *     
     */
    public EPCISMasterDataBodyType getEPCISBody() {
        return epcisBody;
    }

    /**
     * Sets the value of the epcisBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISMasterDataBodyType }
     *     
     */
    public void setEPCISBody(EPCISMasterDataBodyType value) {
        this.epcisBody = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISMasterDataDocumentExtensionType }
     *     
     */
    public EPCISMasterDataDocumentExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISMasterDataDocumentExtensionType }
     *     
     */
    public void setExtension(EPCISMasterDataDocumentExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
