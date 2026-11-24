
package com.artificial.smart_refund_management.Controller;

import com.artificial.smart_refund_management.Model.RefundEntity;
import com.artificial.smart_refund_management.Service.RefundService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/refunds")
public class RefundController {

    private final RefundService service;

    public RefundController(RefundService service) {
        this.service = service;
    }

    @PostMapping
    public RefundEntity createRefund(@RequestBody RefundEntity refund) {
        return service.createRefund(refund);
    }

    @GetMapping
    public List<RefundEntity> getAllRefunds() {
        return service.getAllRefunds();
    }

    @GetMapping("/{id}")
    public RefundEntity getRefundById(@PathVariable Long id) {
        return service.getRefundById(id);
    }

    @PutMapping("/{id}/status")
    public RefundEntity updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return service.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public String deleteRefund(@PathVariable Long id) {
        service.deleteRefund(id);
        return "Refund deleted successfully";
    }
}
