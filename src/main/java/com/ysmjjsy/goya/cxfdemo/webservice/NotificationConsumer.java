package com.ysmjjsy.goya.cxfdemo.webservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-08T01:12:06.461+08:00
 * Generated source version: 3.5.2
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", name = "NotificationConsumer")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface NotificationConsumer {

    @WebMethod(operationName = "Notify", action = "Notify")
    @Oneway
    public void notify(

        @WebParam(partName = "Notify", name = "Notify", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
        Notify notify
    );
}
