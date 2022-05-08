
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 人的姓名
 * 
 * <p>HumanName complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HumanName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="use" type="{http://www.chiss.org.cn/rhin/2015}NameUse" minOccurs="0"/&gt;
 *         &lt;element name="family" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *         &lt;element name="given" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *         &lt;element name="prefix" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *         &lt;element name="suffix" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.chiss.org.cn/rhin/2015}Period" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="value" type="{http://www.chiss.org.cn/rhin/2015}stringPrimitive" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumanName", propOrder = {
    "use",
    "family",
    "given",
    "prefix",
    "suffix",
    "period",
    "text"
})
public class HumanName
    extends Any
{

    protected NameUse use;
    protected com.wisdom.area.webservice.wsdl.String family;
    protected com.wisdom.area.webservice.wsdl.String given;
    protected com.wisdom.area.webservice.wsdl.String prefix;
    protected com.wisdom.area.webservice.wsdl.String suffix;
    protected Period period;
    protected com.wisdom.area.webservice.wsdl.String text;
    @XmlAttribute(name = "value")
    protected String value;

    /**
     * 获取use属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameUse }
     *     
     */
    public NameUse getUse() {
        return use;
    }

    /**
     * 设置use属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameUse }
     *     
     */
    public void setUse(NameUse value) {
        this.use = value;
    }

    /**
     * 获取family属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public com.wisdom.area.webservice.wsdl.String getFamily() {
        return family;
    }

    /**
     * 设置family属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public void setFamily(com.wisdom.area.webservice.wsdl.String value) {
        this.family = value;
    }

    /**
     * 获取given属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public com.wisdom.area.webservice.wsdl.String getGiven() {
        return given;
    }

    /**
     * 设置given属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public void setGiven(com.wisdom.area.webservice.wsdl.String value) {
        this.given = value;
    }

    /**
     * 获取prefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public com.wisdom.area.webservice.wsdl.String getPrefix() {
        return prefix;
    }

    /**
     * 设置prefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public void setPrefix(com.wisdom.area.webservice.wsdl.String value) {
        this.prefix = value;
    }

    /**
     * 获取suffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public com.wisdom.area.webservice.wsdl.String getSuffix() {
        return suffix;
    }

    /**
     * 设置suffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public void setSuffix(com.wisdom.area.webservice.wsdl.String value) {
        this.suffix = value;
    }

    /**
     * 获取period属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * 设置period属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public com.wisdom.area.webservice.wsdl.String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.wisdom.area.webservice.wsdl.String }
     *     
     */
    public void setText(com.wisdom.area.webservice.wsdl.String value) {
        this.text = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
