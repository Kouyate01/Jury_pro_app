package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.oda.jury_pro.Entities.VoteGroupe;

public interface VoteGroupeRepository extends JpaRepository<VoteGroupe, Integer> {
    
}
