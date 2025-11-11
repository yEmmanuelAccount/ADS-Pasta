// CONSTs
const CONST_centerMap = [-6.8886, -38.5566]
const CONST_zoomLevel = 17;
const CONST_maxZoom = 20;
const CONST_minZoom = 10;
const CONST_zoomControl = false;

// EXEMPLO 01
// let map = L.map('map',{
//     zoomControl: false,
//     maxZoom: CONST_maxZoom,
//     minZoom: CONST_minZoom,
//     dragging: false
// }).setView(CONST_centerMap, CONST_zoomLevel);
// L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
//     maxZoom: 19,
//     attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
// }).addTo(map);

// EXEMPLO 02
let map = L.map('map').setView(CONST_centerMap, CONST_zoomLevel);

var icon = L.icon({
            iconUrl: 'https://cdn-icons-png.flaticon.com/512/1397/1397971.png',
            iconSize: [30,30]
        });

let marker = L.marker(CONST_centerMap, { // abre o mapa no centro
    dragging: true,
    icon: icon
}).addTo(map);

map.locate();
map.on('locationfound', location => {
    map.setView(location.latlng); // coloca a view na cidade que detecta a localização
    // L.marker(location.latlng).addTo(map); // adiciona a marca no mapa (localização detectada)
    marker.setLatLng(location.latlng); // se tiver com a localização permitida, abre na localização
});

L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: CONST_maxZoom,
    attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(map);

// EXEMPLO 03: campo de busca (transformando texto em localização)
let botaoBuscar = document.getElementById('btBuscar');
botaoBuscar.onclick = () => {
    let texto = document
        .getElementById('inputLocal').value;
    fetch(
        `https://nominatim.openstreetmap.org/search?q=${texto}&format=json`
    ).then(response => response.json()).
    then(data => {
        let resultado = data[0];
        let latlng = [
            parseFloat(resultado.lat),
            parseFloat(resultado.lon)
        ];
        map.setView(latlng, 15);
        marker.setLatLng(latlng);
    }).catch(error =>{
        alert('Local não encontrado');
    });
};