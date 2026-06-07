package com.voltx.evgenee.service.impl;

import com.voltx.evgenee.dto.requests.PaymentRequestDto;
import com.voltx.evgenee.dto.responses.PaymentResponseDto;
import com.voltx.evgenee.service.PaymentService;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentResponseDto createOrder(PaymentRequestDto requestDto) {
        return null;
    }

    @Override
    public PaymentResponseDto updatePayment(PaymentRequestDto requestDto) {
        return null;
    }
}
