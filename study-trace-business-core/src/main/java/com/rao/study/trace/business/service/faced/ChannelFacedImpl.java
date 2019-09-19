package com.rao.study.trace.business.service.faced;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rao.study.trace.business.dto.ChannelDto;
import com.rao.study.trace.business.entity.Agent;
import com.rao.study.trace.business.entity.Channel;
import com.rao.study.trace.business.service.IAgentService;
import com.rao.study.trace.business.service.IChannelFaced;
import com.rao.study.trace.business.service.IChannelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Component
public class ChannelFacedImpl implements IChannelFaced {

    @Autowired
    private IChannelService iChannelService;

    @Autowired
    private IAgentService iAgentService;

    @Override
    public void save(ChannelDto channelDto) {
        Channel channel = new Channel();
        BeanUtils.copyProperties(channelDto,channel);
        channel.setState("true");
        channel.setCreateAt(LocalDateTime.now());
        channel.setUpdateAt(LocalDateTime.now());
        iChannelService.save(channel);
    }

    @Override
    public void disable(Long id) {

        Channel channel = new Channel();
        channel.setId(id);
        channel.setState("false");
        channel.setUpdateAt(LocalDateTime.now());
        iChannelService.updateById(channel);

        QueryWrapper<Agent> queryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<Agent> agentLambdaQueryWrapper = queryWrapper.lambda();
        agentLambdaQueryWrapper.eq(Agent::getChannelId,id);
        List<Agent> agents = iAgentService.list(queryWrapper);

//        iAgentService.updateBatchById()

//        agents.stream().forEach(agent -> {
//            agent.setState("false");
//            agent.setUpdateAt(LocalDateTime.now());
//            iAgentService.updateById(agent);
//        });

        agents.stream().forEach(agent -> {
            agent.setState("false");
            agent.setUpdateAt(LocalDateTime.now());
        });
        if(!CollectionUtils.isEmpty(agents)){
            iAgentService.updateBatchById(agents);
        }


    }
}
