package com.example.notificationserver.DAO;

import com.example.notificationserver.DTO.DietNotificationDTO;
import com.example.notificationserver.DTO.PaymentNotificationDTO;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PaymentNotificationDAO {
    PaymentNotificationDTO create(PaymentNotificationDTO paymentNotificationDTO);
    void updateLastPaymentDate(PaymentNotificationDTO paymentNotificationDTO, LocalDateTime newPaymentDate);
    Optional<PaymentNotificationDTO> findLatestByEmail(String email);
    void delete(Long id);
}
