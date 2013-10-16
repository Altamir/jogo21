package tests.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestJogo;
import tests.TestPontuacao;
import tests.testJogador;

@RunWith(Suite.class)
@SuiteClasses({ testJogador.class, TestJogo.class, TestPontuacao.class })
public class AllTests {

}
