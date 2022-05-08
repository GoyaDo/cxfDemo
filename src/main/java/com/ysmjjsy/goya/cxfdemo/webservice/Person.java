
package com.ysmjjsy.goya.cxfdemo.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 居民实体类
 * 
 * <p>Person complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}RegObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.chiss.org.cn/rhin/2015}HumanName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthTime" type="{http://www.chiss.org.cn/rhin/2015}Date" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.chiss.org.cn/rhin/2015}Code" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="languageCommunication" type="{http://www.chiss.org.cn/rhin/2015}Language" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthPlace" type="{http://www.chiss.org.cn/rhin/2015}Address" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatusCode" type="{http://www.chiss.org.cn/rhin/2015}Code" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="deceasedInd" type="{http://www.chiss.org.cn/rhin/2015}Boolean"/&gt;
 *           &lt;element name="deceasedTime" type="{http://www.chiss.org.cn/rhin/2015}DateTime"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="multipleBirthInd" type="{http://www.chiss.org.cn/rhin/2015}Boolean"/&gt;
 *           &lt;element name="multipleBirthOrderNumber" type="{http://www.chiss.org.cn/rhin/2015}Integer"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="photo" type="{http://www.chiss.org.cn/rhin/2015}Base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "identifier",
    "name",
    "birthTime",
    "gender",
    "address",
    "telecom",
    "languageCommunication",
    "birthPlace",
    "maritalStatusCode",
    "deceasedInd",
    "deceasedTime",
    "multipleBirthInd",
    "multipleBirthOrderNumber",
    "photo"
})
public class Person
    extends RegObject
{

    protected List<Identifier> identifier;
    protected List<HumanName> name;
    protected Date birthTime;
    protected Code gender;
    protected List<Address> address;
    protected List<Telecom> telecom;
    protected List<Language> languageCommunication;
    protected Address birthPlace;
    protected Code maritalStatusCode;
    protected java.lang.Boolean deceasedInd;
    protected DateTime deceasedTime;
    protected java.lang.Boolean multipleBirthInd;
    protected java.lang.Integer multipleBirthOrderNumber;
    protected Base64Binary photo;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HumanName }
     * 
     * 
     */
    public List<HumanName> getName() {
        if (name == null) {
            name = new ArrayList<HumanName>();
        }
        return this.name;
    }

    /**
     * 获取birthTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBirthTime() {
        return birthTime;
    }

    /**
     * 设置birthTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBirthTime(Date value) {
        this.birthTime = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setGender(Code value) {
        this.gender = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telecom }
     * 
     * 
     */
    public List<Telecom> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Telecom>();
        }
        return this.telecom;
    }

    /**
     * Gets the value of the languageCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * 
     * 
     */
    public List<Language> getLanguageCommunication() {
        if (languageCommunication == null) {
            languageCommunication = new ArrayList<Language>();
        }
        return this.languageCommunication;
    }

    /**
     * 获取birthPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBirthPlace() {
        return birthPlace;
    }

    /**
     * 设置birthPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBirthPlace(Address value) {
        this.birthPlace = value;
    }

    /**
     * 获取maritalStatusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * 设置maritalStatusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMaritalStatusCode(Code value) {
        this.maritalStatusCode = value;
    }

    /**
     * 获取deceasedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * 设置deceasedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setDeceasedInd(java.lang.Boolean value) {
        this.deceasedInd = value;
    }

    /**
     * 获取deceasedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDeceasedTime() {
        return deceasedTime;
    }

    /**
     * 设置deceasedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDeceasedTime(DateTime value) {
        this.deceasedTime = value;
    }

    /**
     * 获取multipleBirthInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getMultipleBirthInd() {
        return multipleBirthInd;
    }

    /**
     * 设置multipleBirthInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setMultipleBirthInd(java.lang.Boolean value) {
        this.multipleBirthInd = value;
    }

    /**
     * 获取multipleBirthOrderNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getMultipleBirthOrderNumber() {
        return multipleBirthOrderNumber;
    }

    /**
     * 设置multipleBirthOrderNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setMultipleBirthOrderNumber(java.lang.Integer value) {
        this.multipleBirthOrderNumber = value;
    }

    /**
     * 获取photo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getPhoto() {
        return photo;
    }

    /**
     * 设置photo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setPhoto(Base64Binary value) {
        this.photo = value;
    }

}
