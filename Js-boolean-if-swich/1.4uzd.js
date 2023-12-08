window.onload = function() {
    let a = +prompt("Pirma kraštinė: ");
    let b = +prompt("Antra kraštinė: ");
    let s = 2;
    let C = Math.sqrt((Math.pow(a, s)) + (Math.pow(b, s)));
    alert(C);
}