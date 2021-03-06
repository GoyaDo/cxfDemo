
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.360+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "UnableToDestroySubscriptionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnableToDestroySubscriptionFault extends Exception {

    private com.wisdom.area.webservice.wsdl.UnableToDestroySubscriptionFaultType faultInfo;

    public UnableToDestroySubscriptionFault() {
        super();
    }

    public UnableToDestroySubscriptionFault(java.lang.String message) {
        super(message);
    }

    public UnableToDestroySubscriptionFault(java.lang.String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToDestroySubscriptionFault(java.lang.String message, com.wisdom.area.webservice.wsdl.UnableToDestroySubscriptionFaultType unableToDestroySubscriptionFault) {
        super(message);
        this.faultInfo = unableToDestroySubscriptionFault;
    }

    public UnableToDestroySubscriptionFault(java.lang.String message, com.wisdom.area.webservice.wsdl.UnableToDestroySubscriptionFaultType unableToDestroySubscriptionFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = unableToDestroySubscriptionFault;
    }

    public com.wisdom.area.webservice.wsdl.UnableToDestroySubscriptionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
