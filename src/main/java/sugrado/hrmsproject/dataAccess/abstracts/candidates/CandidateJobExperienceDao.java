package sugrado.hrmsproject.dataAccess.abstracts.candidates;

import org.springframework.data.jpa.repository.JpaRepository;
import sugrado.hrmsproject.entities.concretes.candidates.CandidateJobExperience;

public interface CandidateJobExperienceDao extends JpaRepository<CandidateJobExperience, Integer> {
}
