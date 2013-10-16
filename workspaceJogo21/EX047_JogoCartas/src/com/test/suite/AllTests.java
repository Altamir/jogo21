package com.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.TestBaralho;
import com.test.TestCartas;

@RunWith(Suite.class)
@SuiteClasses({ TestBaralho.class, TestCartas.class })
public class AllTests {

}
