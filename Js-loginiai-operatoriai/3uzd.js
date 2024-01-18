window.onload = function() {
    let x = 100;
    let y = -100;
    let b = +prompt("Iveskite skaičių: ");

    alert(skaicius(x, y, b));
}
function skaicius(x, y, b) {
    if ((b > x) || (b < y)) {
        return true;
    }
    else {
        return false;
    }
}