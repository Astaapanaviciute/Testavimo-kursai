window.onload = function() {
    let a = +prompt("Iveskite skaičių ");
    let b = +prompt("Iveskite skaičių: ");

    alert(arTeigiamasIrLyginis(a));
    alert(skaicius(b));
}
function arTeigiamasIrLyginis(a) {
    if ((a > 0) && (a % 2 == 0)) {
        return true;
    }
    else {
        return false;
    }
}
function skaicius(b) {
    if ((b > 100) && (b < -100)) {
        return true;
    }
    else {
        return false;
    }
}