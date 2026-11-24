
package com.artificial.smart_refund_management.Repository;

import com.artificial.smart_refund_management.Model.RefundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundRepository extends JpaRepository<RefundEntity, Long> {
}
