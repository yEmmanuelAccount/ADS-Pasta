import sequelize from '../databases/sequelize.js';
import { DataTypes } from 'sequelize';

const Tarefa = sequelize.define('Tarefa', {
    id: {
        type: DataTypes.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    nome: {
        type: DataTypes.STRING,
        allowNull: false
    },
    descricao: {
        type: DataTypes.STRING
    },
    tipo: {
        type: DataTypes
            .ENUM('pessoal', 'profissional', 'outros'),
        allowNull: false
    }
});

Tarefa.sync();

export default Tarefa;