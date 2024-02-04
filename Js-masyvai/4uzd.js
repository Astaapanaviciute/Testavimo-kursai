window.onload = function() {
    const skaiciai = [15, 20, 17, 30, 25, 18, 9, 8];
    isvestiKasAntraSkaiciu(skaiciai);
    
}
function isvestiKasAntraSkaiciu(masyvas) {
    for (i = 0; i < masyvas.length; i += 2)
    console.log(masyvas[i]);
}
