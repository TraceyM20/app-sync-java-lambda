package com.test.event.model;

import java.util.Map;

public class AppSyncEventTruncated {

    private String field;
    private Map<String, String> arguments;
    private String source;

    public AppSyncEventTruncated(){}

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Map<String, String> getArguments() {
        return arguments;
    }

    public void setArguments(Map<String, String> arguments) {
        this.arguments = arguments;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
