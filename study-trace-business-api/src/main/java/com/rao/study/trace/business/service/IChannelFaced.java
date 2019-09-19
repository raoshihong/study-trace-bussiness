package com.rao.study.trace.business.service;

import com.rao.study.trace.business.dto.ChannelDto;

public interface IChannelFaced {
    void save(ChannelDto channelDto);
    void disable(Long id);
}
