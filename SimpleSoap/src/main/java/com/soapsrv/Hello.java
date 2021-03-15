package com.soapsrv;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//http://localhost:8080/SimpleSoap/soap/Hello

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {
    public Hello() {}

    @WebMethod
    public String helloworld() {
        return "com.soapsrv.Hello World JAX-WS ";
    }
}