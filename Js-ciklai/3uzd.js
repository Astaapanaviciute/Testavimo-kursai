window.onload = function() {
    let zodis = prompt("Įveskite žodį: ");
    let n = prompt("Įveskite skaičių: ");

    zodisPakartotasNKartu(zodis, n);
}

function zodisPakartotasNKartu(zodis, n) {
    for (let i = 1; i <= n; i++) {
        console.log(zodis, i)
    }
}