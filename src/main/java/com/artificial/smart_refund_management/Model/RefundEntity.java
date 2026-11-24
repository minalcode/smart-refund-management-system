
package com.artificial.smart_refund_management.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "refund_requests")
public class RefundEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String orderId;

    private String reason;

    private double refundAmount;

    private String status;

    private LocalDateTime createdAt = LocalDateTime.now();
}
