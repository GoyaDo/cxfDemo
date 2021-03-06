
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.439+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "UnrecognizedPolicyRequestFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnrecognizedPolicyRequestFault extends Exception {

    private com.wisdom.area.webservice.wsdl.UnrecognizedPolicyRequestFaultType faultInfo;

    public UnrecognizedPolicyRequestFault() {
        super();
    }

    public UnrecognizedPolicyRequestFault(java.lang.String message) {
        super(message);
    }

    public UnrecognizedPolicyRequestFault(java.lang.String message, Throwable cause) {
        super(message, cause);
    }

    public UnrecognizedPolicyRequestFault(java.lang.String message, com.wisdom.area.webservice.wsdl.UnrecognizedPolicyRequestFaultType unrecognizedPolicyRequestFault) {
        super(message);
        this.faultInfo = unrecognizedPolicyRequestFault;
    }

    public UnrecognizedPolicyRequestFault(java.lang.String message, com.wisdom.area.webservice.wsdl.UnrecognizedPolicyRequestFaultType unrecognizedPolicyRequestFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = unrecognizedPolicyRequestFault;
    }

    public com.wisdom.area.webservice.wsdl.UnrecognizedPolicyRequestFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
