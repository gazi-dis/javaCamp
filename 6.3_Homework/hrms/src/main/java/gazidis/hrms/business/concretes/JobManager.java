package gazidis.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gazidis.hrms.business.abstracts.JobService;
import gazidis.hrms.dataAccess.abstracts.JobDao;
import gazidis.hrms.entitites.concretes.Job;

@Service
public class JobManager implements JobService{
	
	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
