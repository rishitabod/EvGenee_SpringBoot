package com.voltx.evgenee.service.impl;

import com.voltx.evgenee.dto.requests.MessageRequestDto;
import com.voltx.evgenee.dto.responses.MessageResponseDto;
import com.voltx.evgenee.service.RoadsideService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoadSideImpl implements RoadsideService {

    @Override
    public List<String> getIssueTypes() {
        return List.of();
    }

    @Override
    public MessageResponseDto getNearestMechanic(Double latitude, Double longitude) {
        return null;
    }

    @Override
    public MessageResponseDto createSOSRequest(MessageRequestDto requestDto) {
        return null;
    }

    @Override
    public List<MessageResponseDto> getMyRequests() {
        return List.of();
    }

    @Override
    public MessageResponseDto getRequestDetails(Long requestId) {
        return null;
    }

    @Override
    public MessageResponseDto cancelRequest(Long requestId) {
        return null;
    }
}
