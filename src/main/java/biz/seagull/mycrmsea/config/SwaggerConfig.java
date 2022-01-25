package biz.seagull.mycrmsea.config;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Pageable;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
    //    .securityContexts(Collections.singletonList(securityContext()))
    //    .securitySchemes(Collections.singletonList(apiKey()))
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        .directModelSubstitute(Pageable.class, SwaggerPageable.class);
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Mandator Service")
        .description("Mandator Service Api doc")
        .build();
  }

  @Getter
  static class SwaggerPageable {
    @ApiModelProperty(value = "Page size", example = "20")
    private Integer size;
    @ApiModelProperty(value = "Page number", example = "0")
    private Integer page;
    @ApiModelProperty(
        "Sorting criteria in the format: property(,asc|desc)."
            + " Default sort order is ascending. Multiple sort criteria are supported."
    )
    private String sort;

    SwaggerPageable(Integer size, Integer page, String sort) {
      this.size = size;
      this.page = page;
      this.sort = sort;
    }
  }

}