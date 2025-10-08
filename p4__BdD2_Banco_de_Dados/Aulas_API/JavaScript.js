document.addEventListener('DOMContentLoaded', async () => {
    const res = await fetch('http://localhost:3000/tarefas');
    const tarefas = await res.json();
    const ulTarefas = document.getElementById('ulTarefas');
    tarefas.forEach(tarefa => {
        const li = document.createElement('li');
        li.innerText = `${tarefa.nome} - ${tarefa.descricao} - ${tarefa.tipo}`;
        ulTarefas.appendChild(li);
    });
});

document.getElementById('salvarButton')
    .addEventListener('click', async () => {
        const tarefa = {
            nome: document.getElementById('inputNome').value,
            descricao: document.getElementById('inputDescricao').value,
            tipo: document.getElementById('selectCategoria').value
        }
        fetch('http://localhost:3000/tarefas', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(tarefa)
        }).then(res => {
            if (res.status === 201) {
                alert('Tarefa salva com sucesso!');
            } else {
                alert('Falha ao salvar');
            }
            window.location.reload();
        }).catch(err => {
            console.log(err);
            alert('Falha ao salvar');
        });
});