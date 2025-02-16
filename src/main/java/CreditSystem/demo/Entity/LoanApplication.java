package CreditSystem.demo.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@Entity
    public class LoanApplication {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

    private BigDecimal amount; // Kredi miktarı

    @Enumerated(EnumType.STRING)
    private LoanApprovalStatus status = LoanApprovalStatus.PENDING; // Başlangıçta PENDING

    private LocalDateTime applicationDate = LocalDateTime.now();

    }
