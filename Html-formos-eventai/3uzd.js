window.onload = function() {
    let tekstoLaukelis = document.getElementById("tekstas");
    console.log(tekstoLaukelis);
    let mygtukas = document.getElementById("mygtukas");
    console.log(mygtukas);

    mygtukas.onclick = function() {
        let tekstas = tekstoLaukelis.value
        console.log(tekstas);
        console.log(tekstas.length);

        console.log(pastraipa.value);

        pastraipa.innerHTML += tekstas.length;
    }
}
