package com.jfajardo.prueba

class Condicionales {
}

fun main() {
//Condicionales dobles

    println("Ingrese un número")
    var n1:Int= readLine()!!.toInt()
    println("Ingrese otro número")
    var n2:Int= readLine()!!.toInt()

    if (n1 > n2) {
        println("$n1 es mayor que $n2")
    } else {
        println("$n2 es mayor que $n1")
    }

//Condicionales anidados
    if (n1 > n2) {
        println("$n1 es mayor que $n2")
    } else if(n2 > n1){
        println("$n2 es mayor que $n1")
    } else {
        println("$n2 es igual a $n1")
    }

//Rangos

    if (n1 in 1..100) {
        println("El número $n1 está en el rango de 1 a 100")
    }
    else{
        println("El número está fuera del rango")
    }

//Sentencia When Condicional múltiple

    var results:Int= (1..50).random() //Generación de números aleatorios
    when (results) {
        0  -> println("No hay resultados")
        1,2,3,4,5->println("Hay menos de 5 resultados")
        in 6..50 -> println("Hay entre 5 y 50 resultados!")
        else -> println("Esos son bastantes resultados!")
    }
//Ejemplo calculadora
    println("Ingrese un número")
    var num1:Int= readLine()!!.toInt()
    println("Ingrese otro número")
    var num2:Int= readLine()!!.toInt()

    println("Ingresa una opción: \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División")
    var op:Int= readLine()!!.toInt()

    when (op) {
        1  ->  println("La suma entre $num1 y $num2 es ${num1+num2}")
        2  ->  println("La resta entre $num1 y $num2 es ${num1-num2}")
        3  ->  println("La multiplicación entre $num1 y $num2 es ${num1*num2}")
        4  ->  println("La división entre $num1 y $num2 es ${num1/num2}")
        else -> println("La opción ingresada no es válida!")
    }

}