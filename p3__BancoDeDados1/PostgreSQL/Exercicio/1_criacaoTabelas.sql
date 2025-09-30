-- Setor (**CodSetor**, Nome, Supervisor)
-- Médico (**CRM**, Nome, Especialidade)
-- SetorMedico (**CodSetor**, **CRM**)
-- Paciente (**CodPaciente**, Nome, DataNascimento)
-- Atendimento (**CodAtendimento**, DataAtendimento, Valor, Operadora, AtendimentoAnterior, CRM, CodPaciente)
-- TelefoneMedico (**Telefone**, **CRM**)

create Table Setor (
    CodSetor INTEGER PRIMARY KEY,
    Nome VARCHAR(100) UNIQUE NOT NULL,
    Supervisor VARCHAR(10),

    Foreign Key (Supervisor) REFERENCES Medico (CRM)
);

create Table Medico (
    CRM VARCHAR(10) PRIMARY KEY,
    Nome VARCHAR(200),
    Especialidade VARCHAR(20)
);

create Table SetorMedico (
    CodSetor INTEGER,
    CRM VARCHAR(10),

    PRIMARY KEY (CodSetor, CRM),
    Foreign Key (CodSetor) REFERENCES Setor(CodSetor),
    Foreign Key (CRM) REFERENCES Medico(CRM)
);

CREATE TABLE Paciente (
    CodPaciente INTEGER PRIMARY KEY,
    Nome VARCHAR(200),
    DataNascimento DATE
);

CREATE TABLE Atendimento (
    CodAtendimento INTEGER PRIMARY KEY,
    DataAtendimento DATE NOT NULL,
    Valor NUMERIC(10, 2),
    Operadora VARCHAR(50),
    AtendimentoAnterior INTEGER,
    CRM VARCHAR(10),
    CodPaciente INTEGER,

    Foreign Key (AtendimentoAnterior) REFERENCES Atendimento(CodAtendimento),
    Foreign Key (CRM) REFERENCES Medico(CRM),
    Foreign Key (CodPaciente) REFERENCES Paciente(CodPaciente)
);

CREATE Table TelefoneMedico (
    Telefone VARCHAR(15),
    CRM VARCHAR(10),

    PRIMARY KEY (Telefone, CRM),
    Foreign Key (CRM) REFERENCES Medico(CRM)
)
