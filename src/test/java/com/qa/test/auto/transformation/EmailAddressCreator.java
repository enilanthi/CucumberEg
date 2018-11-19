package com.qa.test.auto.transformation;

import cucumber.api.Transformer;

public class EmailAddressCreator extends Transformer<String> {

    @Override
    public String transform(String userName){
        return userName.concat("@ab.com");
    }
}
