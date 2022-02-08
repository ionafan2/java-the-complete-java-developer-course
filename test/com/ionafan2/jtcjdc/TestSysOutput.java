package com.ionafan2.jtcjdc;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class TestSysOutput {

    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    protected final PrintStream originalOut = System.out;
    protected final PrintStream originalErr = System.err;

    protected void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    protected void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
