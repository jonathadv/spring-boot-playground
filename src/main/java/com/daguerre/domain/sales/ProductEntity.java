package com.daguerre.domain.sales;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String description;

  private BigDecimal price;
}
