
window.addEventListener('load', function(){

var form = document.querySelector("#login");
form.addEventListener('submit',function(envio){

      var nombreDeUsuario = document.querySelector("input.input100 nombreDeUsuario");
      var contrasenia = document.querySelector("input.input100 password");

      var errorNombreDeUsuario = document.querySelector ("span.errornombredeUsuario");
      var errorContrasenia = document.querySelector ("span.focus-input100 ErrorContrasenia");


    if (nombreDeUsuario.value == ""){
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario es obligatorio";
     envio.preventDefault();
   }else if (nombreDeUsuario.value.length < 5) {
     errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
     envio.preventDefault();
   }else if (nombreDeUsuario.value.length > 15) {
    errorNombreDeUsuario.innerHTML= "El nombre de Usuario debe tener entre 5 y 15 caracteres";
    envio.preventDefault();
   }else {
     errorNombreDeUsuario.innerHTML= "";
   }

   if (contrasenia.value == ""){
    errorContrasenia.innerHTML= "La contraseña es obligatoria";
    envio.preventDefault();
  }else if (contrasenia.value.length < 5) {
    errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
    envio.preventDefault();
  }else if (contrasenia.value.length > 15) {
   errorContrasenia.innerHTML= "La contraseña debe tener entre 5 y 15 caracteres";
   envio.preventDefault();
 }else {
    errorContrasenia.innerHTML= "";
  }

})

})
