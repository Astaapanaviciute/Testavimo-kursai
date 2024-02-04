window.onload = function() {
    let pastraipa = document.getElementById("pastraipa");
    console.log(pastraipa);
    let pirmasMygtukas = document.getElementById("pirmas");
    console.log(pirmasMygtukas);
    let antrasMygtukas = document.getElementById("antras");
    console.log(antrasMygtukas);
    let treciasMygtukas = document.getElementById("trecias");
    console.log(treciasMygtukas);
    let ketvirtasMygtukas = document.getElementById("ketvirtas");
    console.log(ketvirtasMygtukas);
    let penktasMygtukas = document.getElementById("penktas");
    console.log(penktasMygtukas);
    let sestasMygtukas = document.getElementById("sestas");
    console.log(sestasMygtukas);

    pirmasMygtukas.onclick = function() {
        pastraipa.innerHTML = "JavaScript programavimas";
    }

    antrasMygtukas.onclick = function() {
        alert("Svarbus pranešimas");
    }

    treciasMygtukas.onclick = function() {
        let x = prompt("Įveskite tekstą: ");
        pastraipa.innerHTML = x;
    }

    ketvirtasMygtukas.onclick = function() {
        pastraipa = document.getElementById("pastraipa").style.backgroundColor = 'lime';
    }

    penktasMygtukas.onclick = function() {
        onclick = document.getElementById("pastraipa").style.visibility= 'hidden';
    }

    sestasMygtukas.onclick = function() {
        let raide = prompt("Įveskite raidę: ");
        
        alert(kiekKartuKartojasiRaide(pastraipa, raide));
    }
}
function kiekKartuKartojasiRaide(pastraipa, raide) {
    let kiekis = 0;
    for (let i = 0; i < pastraipa.length; i++) {
        if (pastraipa[i] == raide) {
            kiekis++
        }
    }
    return kiekis;
}

