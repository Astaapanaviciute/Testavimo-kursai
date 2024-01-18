window.onload = function () {
    let pradzia = +prompt("Iveskite pirmą skaičiū: ");
    let pabaiga = +prompt("Iveskite paskutinį skaičių: ");

    console.log("Skaičių sandauga yra: " + skaiciuSandauga(pradzia, pabaiga));
}
function skaiciuSandauga(pradzia, pabaiga) {
    let sandauga = 1;
    for (let i = pradzia; i <= pabaiga; i++) {
        sandauga *= i;
    }
    return sandauga;
}
