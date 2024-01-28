package com.example.operationvariables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.operationvariables.ui.theme.OperationVariablesTheme

fun main (){
    println("Hello World")
    /**
     * This method adds two integers.
     * @params are integer numbers
     * @return the sum of two integers
     */
    println(sum(2,3))

    /**
     * This method subtrate two integers.
     * @params are integer numbers
     * @return the subtraction of two integers
     */
    println(subtract(10,5))
    /**
     * This method multiple two integers.
     * @params are integer numbers
     * @return the Multiplication of two integers
     */
    println(multiply(4,3))
    /**
     * This method divide two integers.
     * @params are integer numbers
     * @return the Division of two integers
     */
    println(divide(5,2))
    /**
     * This method find residue two integers from division.
     * @params are integer numbers
     * @return the residue of two integers
     */
    println(modulus(5,2))
    /**
     * This method show name of user.
     * @param  is string
     * @return is showing
     */
    println(greeting("Zenfira"))
}


fun sum (a:Int, b:Int):Int{
   return a.plus(b)
}

fun subtract(a: Int, b: Int):Int{
    return  a.minus(b)
}

fun multiply(a: Int, b: Int):Int{
    return a.times(b)
}

fun divide(a: Int, b: Int):Int{
    return a.div(b)
}
fun modulus(a: Int,b: Int):Int{
    return a.mod(b)
}

fun greeting(name:String):String{
    return "Hello my name is ${name}"
}
