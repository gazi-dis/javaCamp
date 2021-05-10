package gazidis.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import gazidis.hrms.entitites.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer> {

}
