package com.lg.dev.service.pipeline;

import com.lg.dev.api.pipeline.BuildService;
import com.lg.dev.biz.pipiline.PipelineBiz;
import com.lg.dev.dto.pipeline.BuildReqDTO;
import com.lg.dev.dto.pipeline.BuildResDTO;
import com.lg.jdk.dto.common.Request;
import com.lg.jdk.dto.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-06
 * &Desc build service
*/
@RestController
@RefreshScope
public class BuildServiceImpl implements BuildService {
    @Autowired
    PipelineBiz pipelineBiz;
    @Override
    public Result<BuildResDTO> startBuild(@RequestBody Request<BuildReqDTO> request) {
        BuildResDTO buildResDTO = new BuildResDTO();
        buildResDTO.setResult(pipelineBiz.testJedisCluster());
        Result<BuildResDTO> result = new Result<>();
        result.setData(buildResDTO);
        return result;
    }
}
