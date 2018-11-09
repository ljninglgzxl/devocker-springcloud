package com.lg.dev.api.pipeline;


import com.lg.dev.dto.pipeline.BuildReqDTO;
import com.lg.dev.dto.pipeline.BuildResDTO;
import com.lg.jdk.dto.common.Request;
import com.lg.jdk.dto.common.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lg
 * @date 2018-11-06
 * &Desc build service
 */
@FeignClient(value = "pipeline-service")
public interface BuildService {
    /**
     * start build pipeline
     */
    @RequestMapping("/pipeline/startBuild")
    Result<BuildResDTO> startBuild(@RequestBody Request<BuildReqDTO> request);
}
