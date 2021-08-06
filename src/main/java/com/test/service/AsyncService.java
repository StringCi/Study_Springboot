package com.test.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.crypto.MacSpi;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AsyncService {

    public static final SimpleDateFormat simpleDataformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Async
    public void sendmsg(String message){

        try{
            System.out.println("sending msg" + simpleDataformat.format(new Date(System.currentTimeMillis())));
            Thread.sleep(5000);
            System.out.println("sendmsg : " + message);
            System.out.println("end sending" + simpleDataformat.format(new Date(System.currentTimeMillis())));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
