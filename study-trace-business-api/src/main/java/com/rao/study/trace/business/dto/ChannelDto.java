package com.rao.study.trace.business.dto;

import java.io.Serializable;

public class ChannelDto implements Serializable {
    /**
     * 渠道名称
     */
    private String name;

    /**
     * 状态
     */
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
