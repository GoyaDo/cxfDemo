
package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.419+08:00
 * Generated source version: 3.5.2
 */

@WebFault(name = "InvalidProducerPropertiesExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidProducerPropertiesExpressionFault extends Exception {

    private com.wisdom.area.webservice.wsdl.InvalidProducerPropertiesExpressionFaultType faultInfo;

    public InvalidProducerPropertiesExpressionFault() {
        super();
    }

    public InvalidProducerPropertiesExpressionFault(String message) {
        super(message);
    }

    public InvalidProducerPropertiesExpressionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidProducerPropertiesExpressionFault(String message, com.wisdom.area.webservice.wsdl.InvalidProducerPropertiesExpressionFaultType invalidProducerPropertiesExpressionFault) {
        super(message);
        this.faultInfo = invalidProducerPropertiesExpressionFault;
    }

    public InvalidProducerPropertiesExpressionFault(String message, com.wisdom.area.webservice.wsdl.InvalidProducerPropertiesExpressionFaultType invalidProducerPropertiesExpressionFault, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidProducerPropertiesExpressionFault;
    }

    public com.wisdom.area.webservice.wsdl.InvalidProducerPropertiesExpressionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
