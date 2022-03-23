package com.fclass.lambda_vs_innerclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThisReferenceExampleLambdaTest {
    ThisReferenceExampleLambda thisReferenceExampleLambda;
    @BeforeEach
    void init(){thisReferenceExampleLambda = new ThisReferenceExampleLambda();}

    @Test
    void doSomethingCaller() {
        assertEquals("Changing 'this' reference of the Object of class 'ThisReferenceExampleLambda'",thisReferenceExampleLambda.doSomethingCaller(thisReferenceExampleLambda));

    }
}