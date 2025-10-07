import Tarefa from "../models/tarefa.js";

export async function listarTarefas(req, res) {
    const tarefas = await Tarefa.findAll();
    res.json(tarefas);
}

export async function criarTarefa(req, res) {
    try {
        const tarefa = await Tarefa.create(req.body);
        res.status(201).json(tarefa);
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
}

export async function buscarTarefa(req, res) {
    const tarefa = await Tarefa.findByPk(req.params.id);
    if (tarefa) {
        res.json(tarefa);
    } else {
        res.status(404).json({ error: 'Tarefa não encontrada.' });
    }
}

export async function deletarTarefa(req, res) {
    const tarefa = await Tarefa.findByPk(req.params.id);
    if (tarefa) {
        await tarefa.destroy();
        res.json(tarefa);
    } else {
        res.status(404).json({ error: 'Tarefa não encontrada.' });
    }
}