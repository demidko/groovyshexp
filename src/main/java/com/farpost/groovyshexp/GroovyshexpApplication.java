package com.farpost.groovyshexp;

import static org.springframework.boot.SpringApplication.run;

import lombok.val;
import me.bazhenov.groovysh.spring.GroovyShellServiceBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GroovyshexpApplication {

  @Bean
  GroovyShellServiceBean groovyShell() {
    val gh = new GroovyShellServiceBean();
    gh.setPublishContextBeans(true);
    gh.setPort(6789);
    gh.setDisableImportCompletions(true);
    gh.setLaunchAtStart(true);
    return gh;
  }

  public static void main(String[] args) {
    run(GroovyshexpApplication.class, args);
  }
}
