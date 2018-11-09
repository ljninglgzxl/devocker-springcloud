package com.lg.dev.feign.controller.pipeline;

import com.lg.dev.api.pipeline.BuildService;
import com.lg.dev.dto.pipeline.BuildReqDTO;
import com.lg.dev.dto.pipeline.BuildResDTO;
import com.lg.jdk.dto.common.Request;
import com.lg.jdk.dto.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-08
 * &Desc pipeline test
 */
@RestController
@RequestMapping("/pipeline")
public class PipelineController {
    @Autowired
    BuildService buildService;
    @RequestMapping("/startBuild")
    @ResponseBody
    public BuildResDTO startBuild() {
        Request<BuildReqDTO> buildReqDTORequest = new Request<>();
        buildReqDTORequest.setData(new BuildReqDTO());
        Result<BuildResDTO> result = buildService.startBuild(buildReqDTORequest);
        return result.getData();
    }
}
