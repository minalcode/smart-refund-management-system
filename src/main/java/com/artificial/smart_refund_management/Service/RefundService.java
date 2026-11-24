
package com.artificial.smart_refund_management.Service;

import com.artificial.smart_refund_management.Model.RefundEntity;
import com.artificial.smart_refund_management.Repository.RefundRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundService {

    private final RefundRepository repository;

    public RefundService(RefundRepository repository) {
        this.repository = repository;
    }

    public RefundEntity createRefund(RefundEntity refund) {
        refund.setStatus("PENDING");
        return repository.save(refund);
    }

    public List<RefundEntity> getAllRefunds() {
        return repository.findAll();
    }

    public RefundEntity getRefundById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Refund not found"));
    }

    public RefundEntity updateStatus(Long id, String status) {
        RefundEntity refund = getRefundById(id);
        refund.setStatus(status);
        return repository.save(refund);
    }

    public void deleteRefund(Long id) {
        repository.delete(getRefundById(id));
    }
}
