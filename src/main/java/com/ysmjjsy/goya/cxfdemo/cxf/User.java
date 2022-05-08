package com.ysmjjsy.goya.cxfdemo.cxf;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author goya
 * @create 2022-05-05 23:49
 * @Description
 */
@Data
@XmlRootElement
public class User {

    private String name;

    private String age;

    private String sex;


}
