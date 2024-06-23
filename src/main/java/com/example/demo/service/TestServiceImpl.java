package com.example.demo.service;


import org.apache.commons.text.StringSubstitutor;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getTestString(String input) {
        StringSubstitutor sub = StringSubstitutor.createInterpolator();
        final String text = sub.replace(
                "Base64 Decoder:        ${base64Decoder:SGVsbG9Xb3JsZCE=}\n"
                        + "Base64 Encoder:        ${base64Encoder:HelloWorld!}\n"
                        + "Java Constant:         ${const:java.awt.event.KeyEvent.VK_ESCAPE}\n"
                        + "Date:                  ${date:yyyy-MM-dd}\n"
                        + "Environment Variable:  ${env:USERNAME}\n"
                        + "Java:                  ${java:version}\n"
                        + "Localhost:             ${localhost:canonical-name}\n"
                        + "System Property:       ${sys:user.dir}\n"
                        + "URL Decoder:           ${urlDecoder:Hello%20World%21}\n"
                        + "URL Encoder:           ${urlEncoder:Hello World!}\n");
        return String.format("Hello %s from test Service, returned %s", input,text);
    }
}
