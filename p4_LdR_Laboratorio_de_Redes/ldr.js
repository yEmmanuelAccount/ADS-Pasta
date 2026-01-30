// constantes do HTML
document.addEventListener('DOMContentLoaded', function() {
    let cliente_ip = "";
    let server_ip = "";
    let docker_ip = "";

    document.getElementById('cliente-ip').textContent = cliente_ip;
    document.getElementById('server-ip').textContent = server_ip;
    document.getElementById('docker-ip').textContent = docker_ip;
});

// formatação
const slide = document.getElementsByTagName('slide')[0];
const slideCode = document.querySelector('slide pre code');
const browserTabs = document.getElementsByClassName('browsertabs')[0]; 
const terminalTabs = document.getElementsByClassName('terminaltabs')[0]; 

browserTabs.children[0].addEventListener('click', () => { showXen(); })
browserTabs.children[1].addEventListener('click', () => { showProxmox(); })

let stageXen = 0;
let stageProxmox = 0;
let currentBrowserTab = 0;

const xenTerminalsTxt = [{
    txtLocal: '',
    txtServer: '',
    txtDocker: '',
    button: 0,
}]

function progressStage(xenStage, proxmoxStage) {
    if (xenStage) stageXen = xenStage;
    if (proxmoxStage) stageProxmox = proxmoxStage;
    updateBrowser();
}

function updateBrowser() {
    if (currentBrowserTab === 0) showXen();
    else showProxmox();
}

function prepareBrowser() {
    [...document.getElementsByClassName('proxmox')].forEach((item) => item.style.display = 'none');
    [...document.getElementsByClassName('xen')].forEach((item) => item.style.display = 'none');
    slideCode.style.display = 'none';
    terminalTabs.style.display = 'none';
}

function showXen() {
    prepareBrowser();
    browserTabs.children[0].classList.toggle('selected', true);
    browserTabs.children[1].classList.toggle('selected', false);
    currentBrowserTab = 0;
    if (stageXen === 0) showXenbp1();
    if (stageXen === 1) showXenbp2();
    if (stageXen === 2) showXenbp3();
    if (stageXen >= 3) {
        slideCode.style.display = 'flex';
        terminalTabs.style.display = 'flex';
        showXenbp4();
    }
}

function showProxmox() {
    prepareBrowser();
    browserTabs.children[0].classList.toggle('selected', false);
    browserTabs.children[1].classList.toggle('selected', true);
    currentBrowserTab = 1;
    if (stageProxmox === 0) showProxmoxbp1();
}

function addEnterToTerminal(terminal, action) {
    const button = document.createElement('button');
    button.addEventListener('click', action);
    button.innerText = 'Enter ⏎';
    button.classList.add('enterButton');
    terminal.appendChild(button);
}

function showXenbp1() {
    document.getElementsByTagName('loginPageXen')[0].style.display = 'flex';
}

function showProxmoxbp1() {
    document.getElementsByTagName('loginPageProxmox')[0].style.display = 'flex';
}

function showXenbp2() {
    slideCode.style.display = 'flex';
    slideCode.innerText = '$ startx';
    addEnterToTerminal(slideCode, () => { progressStage(2); });
}

function showXenbp3() {
    document.getElementsByTagName('vmHomeXen')[0].style.display = 'flex';
}

function showXenbp4() {
    slideCode.innerText = 'abc';
}

showXen();
progressStage(0);

// forms
document.addEventListener('DOMContentLoaded', () => {
    const formContainer = document.getElementById('ip-form-container');
    const openFormBtn = document.getElementById('open-form');
    const ipForm = document.getElementById('ip-form');
    const saveBtn = document.getElementById('save-btn');

    // Função para abrir o formulário
    openFormBtn.addEventListener('click', () => {
        formContainer.style.display = 'flex';

        // Preencher campos com valores armazenados (se houver)
        const cliente_ip = localStorage.getItem('cliente-ip') || '';
        const server_ip = localStorage.getItem('server-ip') || '';
        const docker_ip = localStorage.getItem('docker-ip') || '';

        document.getElementById('cliente-ip').value = cliente_ip;
        document.getElementById('server-ip').value = server_ip;
        document.getElementById('docker-ip').value = docker_ip;
    });

    // Fechar o formulário quando o botão "Salvar" for clicado
    saveBtn.addEventListener('click', (event) => {
        event.preventDefault(); // Impede o comportamento padrão do formulário

        // Salvar os valores no localStorage
        const cliente_ip = document.getElementById('cliente-ip').value;
        const server_ip = document.getElementById('server-ip').value;
        const docker_ip = document.getElementById('docker-ip').value;

        localStorage.setItem('cliente-ip', cliente_ip);
        localStorage.setItem('server-ip', server_ip);
        localStorage.setItem('docker-ip', docker_ip);

        // Fechar o formulário
        formContainer.style.display = 'none';
    });

    // Fechar o formulário quando clicar fora dele
    formContainer.addEventListener('click', (event) => {
        if (event.target === formContainer) {
            formContainer.style.display = 'none';
        }
    });
});

// Função para converter HH:MM:SS para segundos totais
function converterParaSegundos(tempo) {
    const partes = tempo.split(':');
    const h = parseInt(partes[0]) * 3600;
    const m = parseInt(partes[1]) * 60;
    const s = parseInt(partes[2]);
    return h + m + s;
}

// Seleciona o item da lista
const item = document.querySelector('#progresso-lista li');
const totalStr = item.getAttribute('data-total');
const vistoStr = item.getAttribute('data-visto');

// Realiza o cálculo
const totalSegundos = converterParaSegundos(totalStr);
const vistoSegundos = converterParaSegundos(vistoStr);

const calculoPerc = (vistoSegundos / totalSegundos) * 100;

// Exibe o resultado no HTML
item.querySelector('.porcentagem').innerText = calculoPerc.toFixed(2) + "%";