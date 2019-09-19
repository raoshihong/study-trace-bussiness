package com.rao.study.trace.business.dto;

import java.io.Serializable;

public class AgentDto implements Serializable {
    private Long channelId;

    /**
     * 名称
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态
     */
    private String state;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
