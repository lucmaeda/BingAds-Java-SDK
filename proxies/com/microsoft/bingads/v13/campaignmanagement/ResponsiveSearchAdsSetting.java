
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiveSearchAdsSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiveSearchAdsSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       &lt;sequence>
 *         &lt;element name="AutoGeneratedAssetsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveSearchAdsSetting", propOrder = {
    "autoGeneratedAssetsEnabled"
})
public class ResponsiveSearchAdsSetting
    extends Setting
{

    @XmlElement(name = "AutoGeneratedAssetsEnabled", nillable = true)
    protected Boolean autoGeneratedAssetsEnabled;

    /**
     * Gets the value of the autoGeneratedAssetsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoGeneratedAssetsEnabled() {
        return autoGeneratedAssetsEnabled;
    }

    /**
     * Sets the value of the autoGeneratedAssetsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGeneratedAssetsEnabled(Boolean value) {
        this.autoGeneratedAssetsEnabled = value;
    }

}
