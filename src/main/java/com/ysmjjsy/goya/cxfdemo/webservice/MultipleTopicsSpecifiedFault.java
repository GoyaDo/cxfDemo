
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.415+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "MultipleTopicsSpecifiedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class MultipleTopicsSpecifiedFault extends Exception {

    private com.wisdom.area.webservice.wsdl.MultipleTopicsSpecifiedFaultType faultInfo;

    public MultipleTopicsSpecifiedFault() {
        super();
    }

    public MultipleTopicsSpecifiedFault(String message) {
        super(message);
    }

    public MultipleTopicsSpecifiedFault(String message, Throwable cause) {
        super(message, cause);
    }

    public MultipleTopicsSpecifiedFault(String message, com.wisdom.area.webservice.wsdl.MultipleTopicsSpecifiedFaultType multipleTopicsSpecifiedFault) {
        super(message);
        this.faultInfo = multipleTopicsSpecifiedFault;
    }

    public MultipleTopicsSpecifiedFault(String message, com.wisdom.area.webservice.wsdl.MultipleTopicsSpecifiedFaultType multipleTopicsSpecifiedFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = multipleTopicsSpecifiedFault;
    }

    public com.wisdom.area.webservice.wsdl.MultipleTopicsSpecifiedFaultType getFaultInfo() {
        return this.faultInfo;
    }
}