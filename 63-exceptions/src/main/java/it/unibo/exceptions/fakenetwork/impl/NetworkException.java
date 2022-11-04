package it.unibo.exceptions.fakenetwork.impl;

import java.io.IOException;

public class NetworkException extends IOException {
   
    public NetworkException() throws Exception {
        throw new Exception("Network error: no response");
    }

    public NetworkException( final String message) throws Exception {
        throw new Exception("Network error while sending message: " + message);
    }
}
