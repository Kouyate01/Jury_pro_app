package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.oda.jury_pro.Entities.GroupeCandidat;

public interface GroupeCandidatRepository extends JpaRepository<GroupeCandidat, Integer> {
    
}
