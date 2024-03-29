package com.socks.api;

import lombok.Builder;
import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {

    String baseUrl();

    @DefaultValue("de")
    String locale();

    boolean logging();
}
