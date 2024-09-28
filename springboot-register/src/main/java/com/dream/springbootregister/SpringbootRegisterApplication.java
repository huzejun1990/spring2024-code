package com.dream.springbootregister;

import cn.itcast.pojo.Country;
import com.dream.anno.EnableCommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@Import(CommonConfig.class)
//@Import(CommonImportSelector.class)
@EnableCommonConfig
public class SpringbootRegisterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class, args);

//        Country country = context.getBean(Country.class);
//        System.out.println(country);

        System.out.println(context.getBean("province"));
    }


/*
    //注入Country对象
    @Bean
    public Country country() {
        return new Country();
    }
*/

}
