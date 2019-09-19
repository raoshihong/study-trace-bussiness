package com.rao.study.trace.business.service.faced;

import com.alibaba.dubbo.config.annotation.Service;
import com.rao.study.trace.business.dto.AgentDto;
import com.rao.study.trace.business.entity.Agent;
import com.rao.study.trace.business.service.IAgentFaced;
import com.rao.study.trace.business.service.IAgentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Service
@Component
public class AgentFacedImpl implements IAgentFaced {

    @Autowired
    private IAgentService iAgentService;

    @Override
    public void save(AgentDto agentDto) {

        Agent agent = new Agent();
        BeanUtils.copyProperties(agentDto,agent);
        agent.setCreateAt(LocalDateTime.now());
        agent.setUpdateAt(LocalDateTime.now());
        agent.setState("true");
        iAgentService.save(agent);
    }
}
