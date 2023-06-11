package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

// @JsonIgnoreProperties(value={"field1"}) // ignore field1 and field2 when returning SomeBean
@JsonFilter("SomeBeanFilter") // ignore field2 when returning SomeBean
public class SomeBean {

    private String field1;
    @JsonIgnore // ignore field2 when returning SomeBean
    private String field2;
    private String field3;
    private String field4;

    public SomeBean(String value1, String value2, String value3, String value4) {
        this.field1 = value1;
        this.field2 = value2;
        this.field3 = value3;
        this.field4 = value4;
    }

    // Getters and setters
    public String getField1() {
        return field1;
    }
    public void setField1(String value1) {
        this.field1 = value1;
    }

    public String getField2() {
        return field2;
    }
    public void setField2(String value2) {
        this.field2 = value2;
    }

    public String getField3() {
        return field3;
    }
    public void setField3(String value3) {
        this.field3 = value3;
    }

    public String getField4() {
        return field4;
    }
    public void setField4(String value4) {
        this.field4 = value4;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 +
                '}';
    }
}
