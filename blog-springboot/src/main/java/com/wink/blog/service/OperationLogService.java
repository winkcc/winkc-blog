package com.wink.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wink.blog.dto.OperationLogDTO;
import com.wink.blog.vo.PageResult;
import com.wink.blog.entity.OperationLog;
import com.wink.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author yezhiqiu
 * @date 2021/07/29
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
