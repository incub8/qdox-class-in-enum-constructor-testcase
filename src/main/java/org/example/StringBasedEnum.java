package org.example;

import java.util.List;

public enum StringBasedEnum
{
    LIST(List.class.getName());

    StringBasedEnum(String className)
    {
    }
}