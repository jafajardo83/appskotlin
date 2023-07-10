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
    println("Ingrese su edad")
    var edad:Int= readLine()!!.toInt()


}