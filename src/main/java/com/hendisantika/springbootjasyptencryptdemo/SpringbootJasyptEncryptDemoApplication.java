package com.hendisantika.springbootjasyptencryptdemo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringbootJasyptEncryptDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringbootJasyptEncryptDemoApplication.class, args);
        MyTest myTest = configurableApplicationContext.getBean(MyTest.class);
        myTest.testPrint();
    }
}


@Component
class MyTest {

    private Logger logger = LogManager.getLogger(MyTest.class);

    @Value("${userdemo.name}")
    private String username;

    @Value("${usercity.name}")
    private String cityname;

    public void testPrint() {
        logger.info("##############################");
        logger.info("Username is --------> {}", username);
        logger.info("Cityname is --------> {}", cityname);
        logger.info("##############################");
    }

}