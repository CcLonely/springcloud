package top.cg0509.task.service.impl;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import top.cg0509.task.dao.JobAndTriggerMapper;
import top.cg0509.task.entity.JobAndTrigger;
import top.cg0509.task.service.IJobAndTriggerService;

import javax.annotation.Resource;


@Service
public class JobAndTriggerImpl implements IJobAndTriggerService {

	@Resource
	private JobAndTriggerMapper jobAndTriggerMapper;
	
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
		PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
		return page;
	}
}
