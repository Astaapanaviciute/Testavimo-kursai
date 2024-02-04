window.onload = function() {
    const mas = [5, 12, 3, 6, 8, 14, 15, 5, 6, 10];
    let atsakymas = skaiciaiDidesniUzDesimt(mas);
    console.log("Didesni uz 10 skaiciai: " + atsakymas);
    let x = 3;
    let atsX = skaiciaiDidesniUzX(mas, x);
    console.log("Didesni uz x: " + atsX);
}
function skaiciaiDidesniUzDesimt(masyvas) {
    let disesniUzDesimt = 0;
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > 10) {
            disesniUzDesimt++;
        }
    }
    return disesniUzDesimt;
}
function skaiciaiDidesniUzX(masyvas, x) {
    let didesniUzX = 0;
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > x) {
            didesniUzX++;
        }
    }
    return didesniUzX;
}