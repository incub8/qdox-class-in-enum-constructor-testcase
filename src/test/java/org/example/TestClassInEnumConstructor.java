package org.example;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.library.SortedClassLibraryBuilder;

public class TestClassInEnumConstructor
{
    private JavaProjectBuilder builder;

    @BeforeMethod
    public void setUp()
    {
        builder = new JavaProjectBuilder(new SortedClassLibraryBuilder());
        builder.setEncoding("UTF-8");
    }

    @Test
    public void testStringBasedEnum() throws IOException
    {
        builder.addSource(getClass().getResource("StringBasedEnum.java"));
    }

    @Test
    public void testClassBasedEnum() throws IOException
    {
        builder.addSource(getClass().getResource("ClassBasedEnum.java"));
    }
}