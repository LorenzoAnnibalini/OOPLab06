package it.unibo.exceptions.fakenetwork.impl;

import java.io.IOException;

public class NetworkException extends IOException {
   
    public NetworkException() throws Exception {
        super("Network error: no response");
    }

    public NetworkException( final String message) throws Exception {
        super("Network error while sending message: " + message);
    }
}
