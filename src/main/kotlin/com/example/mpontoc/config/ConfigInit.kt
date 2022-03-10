package com.example.mpontoc.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.example.*"]) //@PropertySource("application.properties")
@EntityScan(basePackages = ["com.example.*"])

class ConfigInit {


}