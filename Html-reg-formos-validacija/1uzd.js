window.onload = function() {
    let forma = document.getElementById("forma");
}
function vardoValidacija() {
    let vardoLaukelis = document.getElementById("vardas");
    let vardas = vardoLaukelis.value;
    let vardoSpan = document.getElementById("vardasError");
    let errorZinute = "";

    if (vardas == "") {
        errorZinute += "Privalote įvesti vardą.";
    }
    if (vardas.length > 15) {
        errorZinute += "Vardas negali būti ilgesnis už 15 simbolių.";
    }
    vardoSpan.innerHTML = errorZinute;
    return errorZinute;
}
function pavardesValidacija() {
    let pavardesLaukelis = document.getElementById("pavarde");
    let pavarde = pavardesLaukelis.value;
    let pavardesSpan = document.getElementById("pavardeError");
    let errorZinute = "";

    if (pavarde == "") {
        errorZinute += "Privalote įvesti pavardę.";
    }
    pavardesSpan.innerHTML = errorZinute;
    return errorZinute;
}
function emailValidacija() {
    let emaiLaukelis = document.getElementById("email");
    let email = emaiLaukelis.value;
    let emailSpan = document.getElementById("emailError");
    let errorZinute = "";

    if (email == "") {
        errorZinute += "Privalote įvesti email.";
    }
    if ( email.length < 8) {
        errorZinute += "Slaptažodis per trumpas";
    }
    emailSpan.innerHTML = errorZinute;
    return errorZinute;
}