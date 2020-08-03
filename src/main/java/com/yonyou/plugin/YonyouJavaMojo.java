package com.yonyou.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.codehaus.mojo.exec.ExecJavaMojo;

/**
 * @Author: zhangwbin
 * @Date: 2020/3/24
 */
@Mojo(name = "yongyouJava", threadSafe = true, requiresDependencyResolution = ResolutionScope.TEST)
public class YonyouJavaMojo extends ExecJavaMojo {


  @Parameter(property = "enable", defaultValue = "false")
  protected boolean enable;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    getLog().info("----------yonyou java plugin start-------------");
    getLog().info("enable:" + enable);
    if (enable) {
      super.execute();
    } else {
      getLog().info("-------not exec!--------");
    }
    getLog().info("----------yonyou java plugin end-------------");
  }

}
