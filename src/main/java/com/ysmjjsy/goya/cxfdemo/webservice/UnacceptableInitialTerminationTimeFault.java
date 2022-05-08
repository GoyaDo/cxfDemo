
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.430+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "UnacceptableInitialTerminationTimeFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnacceptableInitialTerminationTimeFault extends Exception {

    private com.wisdom.area.webservice.wsdl.UnacceptableInitialTerminationTimeFaultType faultInfo;

    public UnacceptableInitialTerminationTimeFault() {
        super();
    }

    public UnacceptableInitialTerminationTimeFault(java.lang.String message) {
        super(message);
    }

    public UnacceptableInitialTerminationTimeFault(java.lang.String message, Throwable cause) {
        super(message, cause);
    }

    public UnacceptableInitialTerminationTimeFault(java.lang.String message, com.wisdom.area.webservice.wsdl.UnacceptableInitialTerminationTimeFaultType unacceptableInitialTerminationTimeFault) {
        super(message);
        this.faultInfo = unacceptableInitialTerminationTimeFault;
    }

    public UnacceptableInitialTerminationTimeFault(java.lang.String message, com.wisdom.area.webservice.wsdl.UnacceptableInitialTerminationTimeFaultType unacceptableInitialTerminationTimeFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = unacceptableInitialTerminationTimeFault;
    }

    public com.wisdom.area.webservice.wsdl.UnacceptableInitialTerminationTimeFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
