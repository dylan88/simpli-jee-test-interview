package fr.simplifia.output.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import fr.simplifia.output.SmpOutputWriter;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest {

    private PrintStream stream;
    public SmpOutputWriterImplTest(){
        stream = Mockito.mock(PrintStream.class);
       doNothing().when(stream).println(anyString());
    }

    @Test
    public void testPrint() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        SmpOutputWriterImpl output = new SmpOutputWriterImpl(stream);
        output.print("Test");
        assertEquals(out.toString(), "Test\n");
    }

    @Test
    public void testPrintEmpty() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        SmpOutputWriterImpl output = new SmpOutputWriterImpl(stream);
        output.print("");
        assertEquals(out.toString(), "");
    }

    //TODO
    @Test
    public void testPrintNull() throws Exception {

    }

}