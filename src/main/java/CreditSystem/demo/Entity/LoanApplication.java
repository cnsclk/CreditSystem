package CreditSystem.demo.Entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
    public class LoanApplication {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        private BigDecimal amount; // Kredi miktarı
        private String status; // "PENDING", "APPROVED", "REJECTED"
        private LocalDateTime applicationDate; // Başvuru tarihi

    }
