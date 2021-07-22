package com.huma.grpc.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author hudenian
 * @date 2021/7/22
 */
@Configuration
@EnableOpenApi
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {

    @Bean
    public Docket docketCreateRestApi() {

        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfoapiInfo()).select()

                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))

                .paths(PathSelectors.any())

                .build();

    }

    private ApiInfo apiInfoapiInfo() {

        return new ApiInfoBuilder()

                .title("标题")

                .description("描述")

                .contact(new Contact("联系人", "www.xxx.com", "xxx@xxx.com"))

                .version("1.0.0")

                .build();

    }

}

