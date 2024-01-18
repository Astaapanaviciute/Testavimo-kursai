window.onload = function() {
    let a = 0;
    let b= 120;
    let x = +prompt("Iveskite skaičių: ");

    alert(galimasArNe(x, a, b));
}
function galimasArNe(x, a, b) {
    if ((x >= a) && (x <= b)) {
        return true;
    }
    else {
        return false;
    }
}