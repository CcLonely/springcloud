package top.cg0509.task.service;


import com.github.pagehelper.PageInfo;
import top.cg0509.task.entity.JobAndTrigger;

public interface IJobAndTriggerService {

	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
