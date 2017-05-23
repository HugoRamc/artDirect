function comprobarClave(){
   	clave1 = document.alta.clave1.value
   	clave2 = document.alta.clave2.value

   	if (clave1 == clave2) {
      	alert("Las dos claves son iguales");
        return true;
    }
   	else {
      	alert("Las dos claves son distintas Verificar");
        return false;
    }
}

function validar(){
 var texto = document.getElementById("textoEjemplo");
    if (texto.length == 0){
        alert("Datos imcompletos");
        return false;
    }
    else{
        if(comprobarClave())
        {
            
        }


    }
}
