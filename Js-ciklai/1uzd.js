window.onload = function() {
    let pradzia = +prompt("Įveskite intervalo pradžią");
    let pabaiga = +prompt("Įveskite intervalo pabaigą");

    isvestiNuoAIkiBKasTreciaSkaiciu(pradzia, pabaiga);
    isvestiBruksniukus();
    isvestiNuoAIkiBKasPenkta(pradzia, pabaiga);
    isvestiBruksniukus();
}
function isvestiNuoAIkiBKasTreciaSkaiciu(a, b) {
    for (let i = a; i < b; i += 3) {
        console.log(i)
    }
}
function isvestiNuoAIkiBKasPenkta(a, b) {
    let d = 5;
    for (let i = a; i < b; i += d) {
        console.log(i)
    }
}
function isvestiBruksniukus() {
    console.log("------------");
}