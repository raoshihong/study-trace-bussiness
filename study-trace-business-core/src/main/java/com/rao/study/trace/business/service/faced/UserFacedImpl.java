package com.rao.study.trace.business.service.faced;

import com.alibaba.dubbo.config.annotation.Service;
import com.rao.study.trace.business.dto.UserDto;
import com.rao.study.trace.business.entity.User;
import com.rao.study.trace.business.service.IUserFaced;
import com.rao.study.trace.business.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserFacedImpl implements IUserFaced {

    @Autowired
    private IUserService iUserService;

    @Override
    public void save(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.save(user);
    }

    @Override
    public void update(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.updateById(user);
    }

    @Override
    public void delete(Long id) {
        iUserService.removeById(id);
    }
}
