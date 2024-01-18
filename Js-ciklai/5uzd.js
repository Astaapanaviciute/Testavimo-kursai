window.onload = function() {
    let skaicius = +prompt("Iveskite skaičių: ");

    let pradzia = +prompt("Iveskite pirmą skaičių: ");
    let pabaiga = +prompt("Iveskite paskutinį skaičių: ");

    console.log(lyginisArNelyginis(skaicius));
    visiLyginiaiSkaiciai(pradzia, pabaiga);
}
function lyginisArNelyginis(skaicius) {
    if (skaicius % 2 ==0) {
        return true;
    } else if (skaicius % 2 == 1) {
        return false;
    }
}
function visiLyginiaiSkaiciai(pradzia, pabaiga) {
    for(let i = pradzia; i <= pabaiga; i++) {
        if(arLyginis(i)) { 
            console.log(i);
        }
    }
}
function arLyginis(skaicius) {
   return skaicius % 2 ==0;
}