package com.sefl.kpi.factory;

import com.sefl.kpi.builder.Phone;

public class PhoneFactory {
    private static PhoneFactory ourInstance = new PhoneFactory();

    public static PhoneFactory getInstance() {
        return ourInstance;
    }

    private PhoneFactory() {
    }

    public Phone getPhoneByName(String name){
        Phone result=null;
        switch (name){
            case "nokla":result=new Nokla();
            break;
            case "gnusmas": result=new Gnusmas();
            break;
            case "blueberry": result=new Blueberry();
            break;
            default:

        }

        return result;
    }

}
