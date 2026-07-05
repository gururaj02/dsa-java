package com.guru.javaConcepts.enumsExample.enumCalcAbstractMethods;

public enum Calculator {
    ADD {
        long operation(long a, long b) {
            return a + b;
        }
    },  SUBTRACT {
        @Override
        long operation(long a, long b) {
            return a - b;
        }
    }, MULTIPLY {
        @Override
        long operation(long a, long b) {
            return a * b;
        }
    }, DIVIDE {
        @Override
        long operation(long a, long b) {
            return a / b;
        }
    };

    abstract long operation(long a, long b);
}
