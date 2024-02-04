window.onload = function() {
    const masyvas = [5, 12, 3, 6, 8, 14, 15, 5, 6, 10];
    console.log(masyvas);
    console.log(lyginiaiSkaiciai(masyvas));
}
function lyginiai(skaiciai) {
    return skaiciai % 2 === 0;
}
function lyginiaiSkaiciai(masyvas) {
    const naujasMas = [];
    for (let i = 0; i < masyvas.length; i++) {
        if (lyginiai(masyvas[i])) {
            naujasMas.push(masyvas[i]);
        }
    }
    return naujasMas;
}