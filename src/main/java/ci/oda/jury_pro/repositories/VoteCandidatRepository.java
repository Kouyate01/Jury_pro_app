package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.oda.jury_pro.Entities.VoteCandidat;

public interface VoteCandidatRepository extends JpaRepository<VoteCandidat, Integer> {
    
}
