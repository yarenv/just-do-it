package com.myusetool.enmu;

public enum FlowNodeConfig {

    ONE("0001"),
    TWO("0002"),
    THREE("0003"),

    UNKNOW("");

    private String value;

    FlowNodeConfig(String value) {
        value = value;
    }

    public String getValuue() {
        return value;
    }

    public static FlowNodeConfig getConstant(String con){
        for (FlowNodeConfig constant :values()){
            if (constant.value.equalsIgnoreCase(con)){
                    return constant;
            }
        }
        return UNKNOW;
    }
}
