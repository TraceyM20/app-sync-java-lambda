package com.test.event.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

    @JsonProperty("headers")
    private Headers headers;
    @JsonProperty("domainName")
    private Object domainName;

    @JsonProperty("headers")
    public Headers getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    @JsonProperty("domainName")
    public Object getDomainName() {
        return domainName;
    }

    @JsonProperty("domainName")
    public void setDomainName(Object domainName) {
        this.domainName = domainName;
    }

}
