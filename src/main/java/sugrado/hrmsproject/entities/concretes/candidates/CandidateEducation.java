package sugrado.hrmsproject.entities.concretes.candidates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidate_educations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "candidateCv"})
public class CandidateEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "school_name")
    @NotNull
    @NotBlank
    private String schoolName;

    @Column(name = "department")
    @NotNull
    @NotBlank
    private String department;

    @Column(name = "start_year")
    @NotNull
    @NotBlank
    private LocalDate startYear;

    @Column(name = "graduation_year")
    private LocalDate graduationYear;

    @ManyToOne()
    @JoinColumn(name = "candidate_cv_id")
    private CandidateCv candidateCv;
}
