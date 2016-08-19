package com.exec.one;

import com.exec.one.service.MagicService;

public class Main {
    public static void main(String[] args){
        System.out.println("Main Class Start");
        MagicService service = new MagicService();
        System.out.println("MESSAGE : " + service.getMessage());
    }
}
