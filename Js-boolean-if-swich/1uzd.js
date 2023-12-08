window.onload = function() {
    let x = +prompt("Įveskite pirmą skaičių: ");
    let y = +prompt("Įveskite antrą skaičių: ");
    let z = 2 * (x + y);
    alert(z);

    let a = +prompt("Ilgis: ");
    let b = +prompt("Plotis: ");
    let c = +prompt("Aukštis: ");
    let A = 2 * ((a * b) + (a * c) + (b * c));
    alert(A);

    let r = +prompt("Apskritimo spindulys: ");
    let s = 2;
    let B = Math.PI * (Math.pow(r, s));
    alert(B);
}

