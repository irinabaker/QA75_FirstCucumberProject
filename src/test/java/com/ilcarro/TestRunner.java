package com.ilcarro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com/ilcarro/stepDefinitions",
       // tags = "@wrongPassword",
        plugin = {"pretty","json:build/cucumber-report/cucumber.java"}
)
public class TestRunner {
}

//FAILURE: Build failed with an exception.
//
//* What went wrong:
//Execution failed for task ':compileJava'.
//        > Compilation failed; see the compiler output below.
//        D:\QA_projects\FirstCucumberProject\src\main\java\com\ilcarro\pages\LoginPage.java:48: error: cannot find symbol
//public LoginPage enterWrongData(DataTable table) {
//                                      ^
//    symbol:   class DataTable
//    location: class LoginPage
//  D:\QA_projects\FirstCucumberProject\src\main\java\com\ilcarro\pages\LoginPage.java:5: error: package io.cucumber.datatable does not exist
//  import io.cucumber.datatable.DataTable;
//                              ^
//    2 errors
//
//            * Try:
//> Check your code and dependencies to fix the compilation error(s)
//            > Run with --scan to get full insights from a Build Scan (powered by Develocity).
//
//            BUILD FAILED in 2s
//    2 actionable tasks: 2 executed
