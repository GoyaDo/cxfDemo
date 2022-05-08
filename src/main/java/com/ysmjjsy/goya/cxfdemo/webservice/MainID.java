
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MainID complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MainID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}ID"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://www.chiss.org.cn/rhin/2015}uriPrimitive"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainID", propOrder = {
    "system"
})
public class MainID
    extends ID
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String system;

    /**
     * 获取system属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * 设置system属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

}
