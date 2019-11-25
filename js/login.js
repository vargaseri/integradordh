
window.addEventListener('load', function(){

var botonDeLogin = document.querySelector("#jugar");
botonDeLogin.addEventListener('click',function(){

      var nombreDeUsuario = document.querySelector("input.input100");
      var contrasenia = document.querySelector("input.input100 password");

      var errorNombreDeUsuario = document.querySelector ("span.focus-input100 ErrornombredeUsuario");
      var errorContrasenia = document.querySelector ("span.focus-input100 ErrorContrasenia");


    if (nombreDeUsuario.value == ""){
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario es obligatorio";
   }else if (nombreDeUsuario.value.length < 5) {
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
   }else if (nombreDeUsuario.value.length > 15) {
    errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
   }else {
     errorNombreDeUsuario.innerHTML= "";
   }
// hasta que podamos validar con los datos en la base esta es la validacion
   if (contrasenia.value == ""){
    errorContrasenia.innerHTML= "La contraseña es obligatoria";
  }else if (contrasenia.value.length < 5) {
    errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
  }else if (contrasenia.value.length > 15) {
   errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
 }else {
    errorContrasenia.innerHTML= "";
   }

});

})
