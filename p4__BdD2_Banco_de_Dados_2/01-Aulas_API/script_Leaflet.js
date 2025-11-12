let center = [-6.8886, -38.5566];
let map = L.map('map').setView(center, 15);

var icon = L.icon({
    iconUrl: 'https://cdn-icons-png.flaticon.com/512/1397/1397971.png',
    iconSize: [30, 30]
});

let marker = L.marker(center, {
    draggable: true,
    icon: icon
}).addTo(map);

map.locate();
map.on('locationfound', location => {
    map.setView(location.latlng);
    marker.setLatLng(location.latlng);
});

L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: 19,
    attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(map);

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
        }).catch(error => {
            alert('Local não encontrado');
        });
};

let botaoAdicionar = document
    .getElementById('btAdicionar');
botaoAdicionar.onclick = () => {
    let tarefa = {
        nome: document
            .getElementById('inputNome').value,
        descricao: document
            .getElementById('inputDescricao').value,
        tipo: document
            .getElementById('selectTipo').value,
        localizacao: {
            type: "Point",
            coordinates: [marker.getLatLng().lng,
            marker.getLatLng().lat]
        }
    };
    fetch('http://localhost:3000/tarefas', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(tarefa)
    }).then(response => {
        if (response.status === 201) {
            alert('Tarefa adicionada com sucesso');
        }
    });
    //TODO: Tratar as exceções....
}