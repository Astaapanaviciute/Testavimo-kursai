window.onload = function() {
    let x = +prompt("Irašykite skaičių: ");
    x += 30;
    console.log(x);

    let y = +prompt("Irašykite skaičių: ");
    y -= 57.239;
    console.log(y);

    let a = +prompt("Irašykite skaičių: ");
    a *= 10;
    console.log(a);

    let b = +prompt("Irašykite skaičių: ");
    b /= 2;
    console.log(b);

    let c = +prompt("Irašykite skaičių: ");
    c = (c += -20);
    console.log(c)
}