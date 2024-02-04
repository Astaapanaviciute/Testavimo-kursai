window.onload = function() {
    let x = +prompt("Iveskite skaičių: ");

    alert(teigiamasArNeigiamas(x));
    alert(trejetoKartotinis(x));
}
function teigiamasArNeigiamas(x) {
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