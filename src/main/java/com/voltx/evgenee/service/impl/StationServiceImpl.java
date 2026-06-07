package com.voltx.evgenee.service.impl;

import com.voltx.evgenee.dto.requests.ReviewRequestDto;
import com.voltx.evgenee.dto.requests.StationRequestDto;
import com.voltx.evgenee.dto.responses.ReviewResponseDto;
import com.voltx.evgenee.dto.responses.StationResponseDto;
import com.voltx.evgenee.service.StationService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StationServiceImpl implements StationService {
    @Override
    public List<StationResponseDto> getNearbyStations(Double latitude, Double longitude, Double radius) {
        return List.of();
    }

    @Override
    public List<StationResponseDto> getAllStations() {
        return List.of();
    }

    @Override
    public List<StationResponseDto> getStationsByOwner(Long ownerId) {
        return List.of();
    }

    @Override
    public void updateStationStatus(Long stationId, String status) {

    }

    @Override
    public void suspendStation(Long stationId) {

    }

    @Override
    public void deleteStation(Long stationId) {

    }

    @Override
    public StationResponseDto addStation(StationRequestDto request) {
        return null;
    }

    @Override
    public List<StationResponseDto> getMyStations(String ownerEmail) {
        return List.of();
    }

    @Override
    public StationResponseDto getStationById(Long stationId) {
        return null;
    }

    @Override
    public StationResponseDto updateStation(Long stationId, StationRequestDto request) {
        return null;
    }

    @Override
    public ReviewResponseDto addReview(Long stationId, ReviewRequestDto request) {
        return null;
    }

    @Override
    public void toggleStationStatus(Long stationId) {

    }
}
