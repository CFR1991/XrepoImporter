//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.02 at 06:08:32 PM MEZ 
//


package org.oasis_open.docs.codelist.ns.genericode._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="document" id="R1"&gt;
 * 						A code list must have at least one key, unless it is a
 * 						metadata-only
 * 						definition without a 'SimpleCodeList' element.
 * 					&lt;/rule:text&gt;
 * </pre>
 * 
 * 				
 * 
 * <p>Java class for CodeListDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}DocumentHeader"/>
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ColumnSetChoice"/>
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}OuterCodeListChoice" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListDocument", propOrder = {
    "annotation",
    "identification",
    "columnSet",
    "columnSetRef",
    "simpleCodeList"
})
public class CodeListDocument {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "Identification", required = true)
    protected Identification identification;
    @XmlElement(name = "ColumnSet")
    protected ColumnSet columnSet;
    @XmlElement(name = "ColumnSetRef")
    protected ColumnSetRef columnSetRef;
    @XmlElement(name = "SimpleCodeList")
    protected SimpleCodeList simpleCodeList;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the columnSet property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSet }
     *     
     */
    public ColumnSet getColumnSet() {
        return columnSet;
    }

    /**
     * Sets the value of the columnSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSet }
     *     
     */
    public void setColumnSet(ColumnSet value) {
        this.columnSet = value;
    }

    /**
     * Gets the value of the columnSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSetRef }
     *     
     */
    public ColumnSetRef getColumnSetRef() {
        return columnSetRef;
    }

    /**
     * Sets the value of the columnSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSetRef }
     *     
     */
    public void setColumnSetRef(ColumnSetRef value) {
        this.columnSetRef = value;
    }

    /**
     * Gets the value of the simpleCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCodeList }
     *     
     */
    public SimpleCodeList getSimpleCodeList() {
        return simpleCodeList;
    }

    /**
     * Sets the value of the simpleCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCodeList }
     *     
     */
    public void setSimpleCodeList(SimpleCodeList value) {
        this.simpleCodeList = value;
    }

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R2"&gt;xml:base does not apply to
     * 							canonical URIs.
     * 						&lt;/rule:text&gt;
     * </pre>
     * 
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
