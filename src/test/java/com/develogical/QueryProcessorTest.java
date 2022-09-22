package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutMycelium() throws Exception {
        assertThat(queryProcessor.process("Mycelium"), containsString("attention"));
    }

    @Test
    public void knowsAboutMyName() throws Exception {
        assertThat(queryProcessor.process("name"), containsString("THAMAADA"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
        assertThat(queryProcessor.process("mycelium"), containsString("attention"));
    }

    public void plus() throws Exception {
        assertThat(queryProcessor.process("what is 9 plus 10"), containsString("19"));
        assertThat(queryProcessor.process("what is 9 plus 0"), containsString("9"));
    }

}
