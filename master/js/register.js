window.addEventListener('load', function(){

  // Material Select Initialization
$(document).ready(function() {
  $('.mdb-select').materialSelect();
  });

var botonDeRegistro = document.querySelector("button.registrarme");
botonDeRegistro.addEventListener('click',function(){



      var nombre = document.querySelector("input.firstName");
      var apellido = document.querySelector("input.lastName");
      var nombreDeUsuario = document.querySelector("input.nombreDeUsuario");
      var email = document.querySelector("input.email");
      var contrasenia = document.querySelector("input.password");
      var confirmar_contrasenia = document.querySelector("input.confirm_password");

      var errorFirstName = document.querySelector ("span.ErrorNombre");
      var errorLastName = document.querySelector ("span.ErrorApellido");
      var errorNombreDeUsuario = document.querySelector ("span.ErrornombredeUsuario");
      var errorEmail = document.querySelector ("span.errorEmail");
      var errorContrasenia = document.querySelector ("span.ErrorContrasenia");



      if (nombre.value == ""){
       errorFirstName.innerHTML= "El nombre es obligatorio";
     }else if (nombre.value.length < 3) {
       errorFirstName.innerHTML= "El nombre debe tener al menos 3 caracteres";
     }else {
       errorFirstName.innerHTML= "";
     }

     if (apellido.value == ""){
      errorLastName.innerHTML= "El apellido es obligatorio";
    }else if (apellido.value.length < 3) {
      errorLastName.innerHTML= "El apellido debe tener al menos 3 caracteres";
    }else {
      errorLastName.innerHTML= "";
    }
    if (nombreDeUsuario.value == ""){
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario es obligatorio";
   }else if (nombreDeUsuario.value.length < 5) {
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
   }else if (nombreDeUsuario.value.length > 15) {
    errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
   }else {
     errorNombreDeUsuario.innerHTML= "";
   }

   if (/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i.test(email.value)){
    errorEmail.innerHTML="";
  }else if (email.value == "") {
    errorEmail.innerHTML="La dirección de email es obligatoria!."
  } else {
    errorEmail.innerHTML="La dirección de email no es válida!.";
   }
   if (contrasenia.value == ""){
    errorContrasenia.innerHTML= "La contraseña es obligatoria";
  }else if (contrasenia.value.length < 5) {
    errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
  }else if (contrasenia.value.length > 15) {
   errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
 }else if (contrasenia.value !=confirmar_contrasenia.value) {
  errorContrasenia.innerHTML= "Las contraseñas deben ser iguales";
 }else {
    errorContrasenia.innerHTML= "";
   }


});



})
