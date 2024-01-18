window.onload = function() {
    let x = +prompt("Iveskite pirmą skaičių: ");
    let y = +prompt("Iveskite antrą skaičių: ");

    alert(skaicius(x, y));
    alert(skaicius1(x, y));
}
function skaicius(x, y) {
    if (x > y) {
        return -1;
    }
    else if (x < y) {
        return 1;
    }
    else {
        return 0;
    }
}
function skaicius1(x, y) {
    if ((x * y) > (x + y)) {
        return true;
    }
    else {
        return false;
    }
}