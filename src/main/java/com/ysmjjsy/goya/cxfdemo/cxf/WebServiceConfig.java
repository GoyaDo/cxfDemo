package com.ysmjjsy.goya.cxfdemo.cxf;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * @author goya
 * @create 2022-05-05 23:30
 * @Description
 */
@Configuration
public class WebServiceConfig {


    @Resource
    private TestService testService;


    @Resource
    private Bus bus;

//    @Bean(name = Bus.DEFAULT_BUS_ID)
//    public SpringBus springBus(){
//        return new SpringBus();
//    }


    @Bean(name = "cxfServlet")
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/cxf/*");
    }

    @Bean
    public Endpoint endpointTestService(){
        EndpointImpl endpoint = new EndpointImpl(bus,testService);
        endpoint.publish("/webservice");
        return endpoint;
    }

}
