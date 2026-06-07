package com.voltx.evgenee.service.impl;

import com.voltx.evgenee.dto.requests.MessageRequestDto;
import com.voltx.evgenee.dto.responses.MessageResponseDto;
import com.voltx.evgenee.service.AIService;
import org.springframework.stereotype.Service;


@Service
public class AIServiceImpl implements AIService {
    @Override
    public MessageResponseDto chat(MessageRequestDto requestDto) {
        return null;
    }
}
