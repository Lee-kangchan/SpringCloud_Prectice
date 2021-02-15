package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestController 명시
@RequestMapping("v1/organizations/{organizations}/licenses") // 해당 url 경로로 노출
public class LicenseServiceController {
}
