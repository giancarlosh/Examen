/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function nuevo() {
    var test = true;
    var inputs = document.getElementsByTagName("input");
    var limite = inputs.length - 1;
    for (var i = 0; i < limite; i++) {
        if (test && inputs[i].value != "") {
            test = true;
        } else {
            test = false;
        }
    }
    if (test) {
        alert("Registro con exito");
    }
}
function mostrar(formMostrar, formOcultar1, formOcultar2, formOcultar3, formOcultar4) {
    var mostrar = document.getElementById(formMostrar);
    mostrar.className = "mostrar mostrar-tabla contenedor";
    var ocultar1 = document.getElementById(formOcultar1);
    ocultar1.className = "oculto mostrar-tabla contenedor";
    var ocultar2 = document.getElementById(formOcultar2);
    ocultar2.className = "oculto mostrar-tabla contenedor";
    var ocultar3 = document.getElementById(formOcultar3);
    ocultar3.className = "oculto mostrar-tabla contenedor";
    var ocultar4 = document.getElementById(formOcultar4);
    ocultar4.className = "oculto mostrar-tabla contenedor";
   

}
function cerrar() {

    alert("Hasta Pronto");
}
function validar() {

    var usuario = document.getElementsByName("usuario")[0].value;
    var contrasenia = document.getElementsByName("contrasenia")[0].value;
    if (usuario == "root" && contrasenia == "root") {
        alert("Bienvenido");
    } else {
        alert("Usuario y/o contraseña incorrecta");
    }
}
