package count.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "count", schema = "public")
@SequenceGenerator(schema = "public", name = "seq_count", allocationSize = 1)
public class Count {

    @Id
    @Column(name = "id")
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_count")
    private Long id;

    @NotNull
    @NotBlank
    @Column(name = "number")
    private String number;

    @NotNull
    @NotBlank
    @Column(name = "agency")
    private String agency;

    @NotNull
    @Column(name = "balance")
    private BigDecimal balance;

    @NotNull
    @Column(name = "expirationDate")
    private LocalDate expirationDate;

}
