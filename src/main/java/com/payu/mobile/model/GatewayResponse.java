package com.payu.mobile.model;

/**
 * Created by jhonatan.zambrano on 2/16/17.
 */
public class GatewayResponse {

    private final long id;
    private final String content;

    public GatewayResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
