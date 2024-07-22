package com.progs.client.system;

import com.progs.common.security.annotation.EnableCustomConfig;
import com.progs.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ClientApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  客户端模块启动成功   ლ(´ڡ`ლ)");
    }
}
