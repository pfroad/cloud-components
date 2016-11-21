package com.airparking.cloud.info;

import com.netflix.eureka.resources.StatusResource;
import com.netflix.eureka.util.StatusInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 11/11/2016.
 */
@RestController
public class EurekaServerController {
    @GetMapping("eureka/status")
    public @ResponseBody StatusInfo status() {
        return new StatusResource().getStatusInfo();
    }
}
