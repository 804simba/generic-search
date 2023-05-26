package com.simba.dynamic.search.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "operating_system")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperatingSystem implements Serializable {
    @Serial
    private static final long serialVersionUID = -1730538653948604611L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="version", nullable = false)
    private String version;

    @Column(name="kernel", nullable = false)
    private String kernel;

    @Column(name="release_date", nullable = false)
    private LocalDateTime releaseDate;

    @Column(name="usages", nullable = false)
    private Integer usages;
}
