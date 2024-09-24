package io.samancore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "coberturas_adicionales")
public class TmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_state")
    @Column(nullable = false)
    private Long id;

    @Column
    private Long edad;

    @Column(length  = 8)
    private String prob;

    @Column
    private Date fecha;
}
