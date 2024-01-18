window.onload = function() {
    let pradzia = +prompt("Įveskite pirmą skaičių");
    let pabaiga = +prompt("Įveskite paskutinį skaičių");

    alert("Skaičių suma: " + skaiciuSuma(pradzia, pabaiga));
    alert("Skaičių suma: " + skaiciuSumaSuD(pradzia, pabaiga));
}
function skaiciuSuma(pradzia, pabaiga) {
    let suma = 0;
    for (let i = pradzia; i <= pabaiga; i++)
    suma += i;
    return suma;
}
function skaiciuSumaSuD(pradzia, pabaiga) {
    let suma = 0;
    let d = 3;
    for (let i = pradzia; i < pabaiga; i += d)
    suma += i;
return suma;
}

