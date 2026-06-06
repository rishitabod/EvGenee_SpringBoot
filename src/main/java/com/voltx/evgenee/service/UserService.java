package com.voltx.evgenee.service;

import com.voltx.evgenee.dto.requests.UserRequestDto;

public interface UserService {

    String register(UserRequestDto req);
}
