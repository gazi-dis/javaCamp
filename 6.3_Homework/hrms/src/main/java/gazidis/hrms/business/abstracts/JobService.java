package gazidis.hrms.business.abstracts;

import java.util.List;

import gazidis.hrms.entitites.concretes.Job;

public interface JobService {
	List<Job> getAll();
}
