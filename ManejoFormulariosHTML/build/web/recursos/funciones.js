function validarForma(forma){
    //validando el usuario
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir Usuario"){
        alert("Debe ingresar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    // validando password
    var password = forma.password;
    if(password.value === "" ||password.value.length<3){
        alert("Debe ingresar una contraseña de al menos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    // validando tecnologias de interes
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    //revisando si selecciono algo en el checkbox
    for(i=0;1<tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if(checkSeleccionado){
        alert("Debe seleccionar una tecnologia!!!");
        return false;
    }
    //validando el genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    // revisando si selecciono alguna opcion en el radiobutton
    for(i = 0;i<generos.length;i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
    }
    if(radioSeleccionado){
        alert("Debe seleccionar el genero");
        return false;
    }
    // validando la ocupacion
    var ocupacion = forma.ocupacion;
    if (ocupacion.value==""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    // formulario validado
    alert("Formulario valido, enviando datos al servidor...");
    return true;
}


