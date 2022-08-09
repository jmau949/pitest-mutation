package com.github.pitest.service;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.github.pitest.service")
@IncludePackages("com.github.pitest.service")
public class PiTestSuiteTest {}