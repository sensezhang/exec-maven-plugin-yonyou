package com.yonyou.plugin;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.codehaus.mojo.exec.ExecMojo;


/**
 * A Plugin for executing external programs.
 *
 * @author Jerome Lacoste (jerome@coffeebreaks.org)
 * @version $Id$
 * @since 1.0
 */
@Mojo( name = "yonyouExec", threadSafe = true, requiresDependencyResolution = ResolutionScope.TEST )
public class YonyouExecMojo
    extends ExecMojo{

  @Parameter( property = "enable", defaultValue = "false")
  protected boolean enable;

  @Override
  public void execute() throws MojoExecutionException {
    getLog().info("----------yonyou exec plugin start-------------");
    getLog().info("enable:" + enable);
    if(enable) {
      super.execute();
    } else {
      getLog().info("-------not exec!--------");
    }
    getLog().info("----------yonyou exec plugin end-------------");
  }

}
