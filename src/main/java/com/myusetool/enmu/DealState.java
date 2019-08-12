package com.myusetool.enmu;

public enum DealState {
    /**
     * 处理中
     */
    dealing("00"),

    /**
     * 成功
     */
    sucess("01"),

    /**
     * 失败
     */
    fail("02"),

    /**
     * 未知
     */
    unknow("");

    private String value;

    DealState(String value) {
        value = value;
    }

    public String getValuue() {
        return value;
    }

    public static DealState getConstant(String con){
        for (DealState constant :values()){
            if (constant.value.equalsIgnoreCase(con)){
                return constant;
            }
        }
        return unknow;
    }

}
