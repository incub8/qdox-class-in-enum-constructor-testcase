package org.example;

import java.util.List;

public enum ClassBasedEnum
{
    LIST(List.class);

    ClassBasedEnum(Class<?> clazz)
    {
    }
}