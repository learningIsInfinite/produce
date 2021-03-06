package com.example.produce.mapper;

import com.example.produce.entity.DataRequest;
import com.example.produce.entity.ProduceData;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hou
 * @date 2020/8/21
 */
@Component("ProduceDataMapper")
public interface ProduceDataMapper {

    /**
     * 添加数据
     * @param dataRequest
     * @return
     */
    int add(DataRequest dataRequest);

    /**
     * 批量插入数据
     * @param dataRequests
     * @return
     */
    int batchInsert(List<ProduceData> dataRequests);
}
