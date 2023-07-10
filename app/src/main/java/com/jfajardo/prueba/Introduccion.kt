package com.jfajardo.prueba

class Introduccion {
}


fun main() {
    //Variables pueden ser declaradas:
    //1 Sin tipo y esperar que Kotlin identifique el tipo de dato
    val num1=1
    //2. Con tipo para establecerlo
    val num2: Int=1 //Entera
    val decim: Double=3.0 //Double
    val flotante: Float=3.0f //Float
    val estado=true //Boolean

    //Variables alfanuméricas

    val caracter:Char='x' //Caracter
    val name:String="Jennifer" //Cadena
    val ename="Jennifer \n" //Cadena literal escapada
    val text = """ 
  Hola soy Jennifer
  Fajardo $num1
  """ //Cadena literal arbitraria

    //Impresión y concatenación de variables con interpolación
    print("hola $name \n")
    //Cadenas con expresiones de cadena
    print("la suma entre $num1 y $num2 es ${num1+num2} \n")
    //VAL ES CONSTANTE Y VAR VARIABLE
    //name="Pelada" //constante no se puede reasignar su valor

    println("Ingrese su apellido")
    var lastName= readLine()
    var results:Int= readLine()!!.toInt()
    when (results) {
        0  -> println("No results")
        in 1..39 -> println("Got results!")
        else -> println("That's a lot of results!")
    }

    println("Ingrese un número")
    var n1:Int= readLine()!!.toInt()
    println("Ingrese otro número")
    var n2:Int= readLine()!!.toInt()

    println("Ingresa una opción: \n 1. Suma \n 2. Resta \n 3.Resta \n 4. División")
    var op:Int= readLine()!!.toInt()
    when (op) {
        1  ->  println("La suma entre $num1 y $num2 es ${num1+num2}")
        2  ->  println("La resta entre $num1 y $num2 es ${num1+num2}")
        3  ->  println("La multiplicación entre $num1 y $num2 es ${num1+num2}")
        4  ->  println("La división entre $num1 y $num2 es ${num1+num2}")
        else -> println("La opción ingresada no es válida!")
    }

}