package com.soapsrv;


import javax.xml.ws.Endpoint;

public class HelloServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/simpleservletTest/soap/Hello", new Hello());
    }
}