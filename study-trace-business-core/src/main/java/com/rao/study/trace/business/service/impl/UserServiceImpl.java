package com.rao.study.trace.business.service.impl;

import com.rao.study.trace.business.entity.User;
import com.rao.study.trace.business.mapper.UserMapper;
import com.rao.study.trace.business.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-09-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
