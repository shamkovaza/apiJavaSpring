package com.loveapp.mifoda;
import org.springframework.stereotype.Component;
@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to Mifoda";
    }
}
