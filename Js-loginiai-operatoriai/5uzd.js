window.onload = function() {
    let skaicius = +prompt("Iveskite skaičių: ");
    let intervaloPradzia = +prompt("Iveskite intervalo pradžią: ");
    let intervaloPabaiga = +prompt("Iveskite intervalo pabaigą: ");

    alert(arSkaiciusYraIntervale(skaicius, intervaloPradzia, intervaloPabaiga));

}
function arSkaiciusYraIntervale(skaicius, intervaloPradzia, intervaloPabaiga) {
    if ((skaicius >= intervaloPradzia) && (skaicius <= intervaloPabaiga)) {
        return true;
    }
    else {
        return false;
    }
}