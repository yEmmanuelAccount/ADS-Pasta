const slide = document.getElementsByTagName('slide')[0];
const slideCode = document.querySelector('slide pre code');
const browserTabs = document.getElementsByClassName('browsertabs')[0]; 
const terminalTabs = document.getElementsByClassName('terminaltabs')[0]; 

browserTabs.children[0].addEventListener('click', () => { showXen(); })
browserTabs.children[1].addEventListener('click', () => { showProxmox(); })

let stage = 0;

function showXen() {
    if (stage === 0) showXenbp1();
}

function showProxmox() {
    if (stage === 0) showProxmoxbp1();
}

function showXenbp1() {
    browserTabs.children[0].classList.toggle('selected', true);
    browserTabs.children[1].classList.toggle('selected', false);

    document.getElementsByTagName('loginPageXen')[0].style.display = 'flex';
    document.getElementsByTagName('loginPageProxmox')[0].style.display = 'none';
}

function showProxmoxbp1() {
    browserTabs.children[0].classList.toggle('selected', false);
    browserTabs.children[1].classList.toggle('selected', true);

    document.getElementsByTagName('loginPageXen')[0].style.display = 'none';
    document.getElementsByTagName('loginPageProxmox')[0].style.display = 'flex';
}