package com.test.event.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AppSyncEvent {

    @JsonProperty("identity")
    private Object identity;
    @JsonProperty("result")
    private Object result;
    @JsonProperty("request")
    private Request request;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("prev")
    private Object prev;
    @JsonProperty("stash")
    private Stash stash;
    @JsonProperty("outErrors")
    private List<Object> outErrors;
    @JsonProperty("arguments")
    private Arguments arguments;
    @JsonProperty("source")
    private Object source;

    @JsonProperty("identity")
    public Object getIdentity() {
        return identity;
    }

    @JsonProperty("identity")
    public void setIdentity(Object identity) {
        this.identity = identity;
    }

    @JsonProperty("result")
    public Object getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Object result) {
        this.result = result;
    }

    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("prev")
    public Object getPrev() {
        return prev;
    }

    @JsonProperty("prev")
    public void setPrev(Object prev) {
        this.prev = prev;
    }

    @JsonProperty("stash")
    public Stash getStash() {
        return stash;
    }

    @JsonProperty("stash")
    public void setStash(Stash stash) {
        this.stash = stash;
    }

    @JsonProperty("outErrors")
    public List<Object> getOutErrors() {
        return outErrors;
    }

    @JsonProperty("outErrors")
    public void setOutErrors(List<Object> outErrors) {
        this.outErrors = outErrors;
    }

    @JsonProperty("arguments")
    public Arguments getArguments() {
        return arguments;
    }

    @JsonProperty("arguments")
    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

}