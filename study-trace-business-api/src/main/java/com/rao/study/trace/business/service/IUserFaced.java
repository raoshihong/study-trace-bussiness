package com.rao.study.trace.business.service;

import com.rao.study.trace.business.dto.UserDto;

public interface IUserFaced {

    void save(UserDto userDto);
    void update(UserDto userDto);
    void delete(Long id);
}
