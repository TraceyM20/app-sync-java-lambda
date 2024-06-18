package com.test.event.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {

    @JsonProperty("fieldName")
    private String fieldName;
    @JsonProperty("parentTypeName")
    private String parentTypeName;
    @JsonProperty("variables")
    private Variables variables;

    @JsonProperty("fieldName")
    public String getFieldName() {
        return fieldName;
    }

    @JsonProperty("fieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @JsonProperty("parentTypeName")
    public String getParentTypeName() {
        return parentTypeName;
    }

    @JsonProperty("parentTypeName")
    public void setParentTypeName(String parentTypeName) {
        this.parentTypeName = parentTypeName;
    }

    @JsonProperty("variables")
    public Variables getVariables() {
        return variables;
    }

    @JsonProperty("variables")
    public void setVariables(Variables variables) {
        this.variables = variables;
    }

}
