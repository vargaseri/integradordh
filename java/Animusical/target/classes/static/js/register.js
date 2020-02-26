window.addEventListener('load', function(){

var form = document.querySelector("#regitro");
form.addEventListener('submit',function(env){

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
       env.preventDefault();
     }else if (nombre.value.length < 3) {
       errorFirstName.innerHTML= "El nombre debe tener al menos 3 caracteres";
      env.preventDefault();
     }else {
       errorFirstName.innerHTML= "";
     }

     if (apellido.value == ""){
      errorLastName.innerHTML= "El apellido es obligatorio";
       env.preventDefault();
    }else if (apellido.value.length < 3) {
      errorLastName.innerHTML= "El apellido debe tener al menos 3 caracteres";
       env.preventDefault();
    }else {
      errorLastName.innerHTML= "";
    }
    if (nombreDeUsuario.value == ""){
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario es obligatorio";
       env.preventDefault();
   }else if (nombreDeUsuario.value.length < 5) {
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
       env.preventDefault();
   }else if (nombreDeUsuario.value.length > 15) {
    errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
       env.preventDefault();
   }else {
     errorNombreDeUsuario.innerHTML= "";
   }

   if (email.value == "") {
    errorEmail.innerHTML="La dirección de email es obligatoria!."
       env.preventDefault();
  } else {
    errorEmail.innerHTML="";
   }
   if (contrasenia.value == ""){
    errorContrasenia.innerHTML= "La contraseña es obligatoria";
       env.preventDefault();
  }else if (contrasenia.value.length < 5) {
    errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
       env.preventDefault();
  }else if (contrasenia.value.length > 15) {
   errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
       env.preventDefault();
 }else if (contrasenia.value !=confirmar_contrasenia.value) {
  errorContrasenia.innerHTML= "Las contraseñas deben ser iguales";
       env.preventDefault();
 }else {
    errorContrasenia.innerHTML= "";
   }

})})



