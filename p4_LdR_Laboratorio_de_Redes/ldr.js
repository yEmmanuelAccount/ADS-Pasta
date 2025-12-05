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