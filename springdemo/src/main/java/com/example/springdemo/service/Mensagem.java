package com.example.springdemo.service;

import java.util.HashMap;
import java.util.Map;



/**
 *  Mensagem somente para testes!
 * 
 *  Ver: https://mkyong.com/spring-boot/spring-rest-error-handling-example/
 *  
 */

public class Mensagem {

    private int code;
    private Map<String, String> details = new HashMap<String, String>();

    public void addDetail(final String name, String msg) {
        details.put(name,msg);
    }

 

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}