<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assest/css/estilos.css" rel ="stylesheet" type="text/css">
    <link rel="stylesheet" href="assest/css/estilos.css">
    <title>Trepecio</title>
 
</head>
<body class="Trapecio">
    <h1 class="tituloTrapecio"> Trepecio </h1>
    <center><img id= "imagentrapecio" src="/asset/img/trapecio.png" alt="trapecio">
        <p id="pT">Los trapecios son un tipo de polígono muy especial. Forman parte de los cuadriláteros, ya que tienen 4 lados. <br>Concretamente se clasifican como no paralelogramos, ya que no tienen todos sus lados paralelos entre sí:<br> tienen 2 lados paralelos y 2 no paralelos.</p>
        <h2>Calcula el area y perimetro de un trapecio:</h2>
        <div>
        <label id="perimeT"for="perimetro">ingresa la base:  </label>
        <input type="text" >
         <label id="perimeT"for="perimetro">ingresa la altura:  </label>
         <input type="text" >

         <button>calcular Area</button>


        </div>
       
        <div>
            <label id="areaT" for="area">ingresa el lado A: </label>
        <input type="text" >
        <label id="areaT" for="area">ingresa el lado B: </label>
        <input type="text" >
        <label id="areaT" for="area">ingresa el lado C: </label>
        <input type="text" >
        <label id="areaT" for="area">ingresa el lado D: </label>
        <input type="text" >

        <button>calcular perimetro</button>

        <button>calcular perimetro</button>
        </div>
        
        
        <h1></h1>
        <a href="index.jsp">Atras</a></center> 
      
</body>
</html>