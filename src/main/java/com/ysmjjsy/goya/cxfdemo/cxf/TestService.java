package com.ysmjjsy.goya.cxfdemo.cxf;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author goya
 * @create 2022-05-05 23:27
 * @Description
 */
@WebService(name = "TestService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TestService {

    @WebMethod
    String getMessage(@WebParam(name = "name") String name);


    @WebMethod
    @WebResult(name = "user",partName = "user")
    User getUser();


}
