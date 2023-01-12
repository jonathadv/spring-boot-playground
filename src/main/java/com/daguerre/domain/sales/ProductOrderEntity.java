package com.daguerre.domain.sales;

import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.*;
import lombok.*;

@Table(name = "product_order")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductOrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "client_id")
  private ClientEntity clientEntity;

  @Column(name = "date", nullable = false)
  private Instant date;

  @Column(name = "total", nullable = false)
  private BigDecimal total;
}
