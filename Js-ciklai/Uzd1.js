window.onload = function() {
    let tekstas = prompt("Iveskite tekstą: ");
    let pradzia = +prompt("Iveskite skaičių nuo kelintos raidės pradėti: ");
    let pabaiga = +prompt("Iveskite skaičių ties kelinta raide užbaigti: ");

    isvestiRaides(pradzia, pabaiga, tekstas);
    
}
function isvestiRaides(pradzia, pabaiga, tekstas) {
    for(let i = 1; i < pabaiga; i++) {
        console.log(tekstas[i]);
    }
    
}