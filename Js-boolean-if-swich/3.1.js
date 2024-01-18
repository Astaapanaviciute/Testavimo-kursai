window.onload = function() {
    let x = +prompt("Iveskite skaičių: ");

    alert(teigiamasarNeigiamas(x));
    alert(trejetoKartotinis(x));
}
function teigiamasarNeigiamas(x) {
    if (x % 2 == 0) {
        return true;
    }
    else {
        return false;
    }
}
function trejetoKartotinis(x) {
    if (x % 3 == 0) {
        return true;
    }
    else {
        return false;
    }
}