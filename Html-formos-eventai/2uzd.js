window.onload = function() {
    let pirmasLaukelis = document.getElementById("pirmas");
    console.log(pirmasLaukelis);
    let antrasLaukelis = document.getElementById("antras");
    console.log(antrasLaukelis);
    let mygtukas = document.getElementById("mygtukas");
    console.log(mygtukas);
    let pastraipa = document.getElementById("pastraipa");
    console.log(pastraipa);

    mygtukas.onclick = function() {
        let pirmas = +pirmasLaukelis.value;
        let antras = +antrasLaukelis.value;
        console.log(pirmas);
        console.log(antras);
        console.log(kurisDidesnis(pirmas, antras));

        console.log(pastraipa.value);

        pastraipa.innerHTML += kurisDidesnis(pirmas, antras);
    }
}
function kurisDidesnis(pirmas, antras) {
    if (pirmas > antras) {
        return pirmas;
    }
    else if (pirmas < antras) {
        return antras;
    }
}