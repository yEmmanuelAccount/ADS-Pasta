INSERT INTO Medico (CRM, Nome, Especialidade)
    VALUES
        ('CRM-111111', 'Dr. Alice Silva', 'Cardiologia'),
        ('CRM-222222', 'Dr. Bruno Souza', 'Dermatologia'),
        ('CRM-333333', 'Dr. Carla Pereira', 'Neurologia');

INSERT INTO Setor (CodSetor, Nome, Supervisor)
    VALUES
        (1, 'Cardiologia', 'CRM-111111'),
        (2, 'Dermatologia', 'CRM-222222'),
        (3, 'Neurologia', 'CRM-333333');

INSERT INTO Paciente (CodPaciente, Nome, DataNascimento)
    VALUES
        (1, 'Maria Eduarda', '1990-05-12'),
        (2, 'João Pedro', '1985-11-23'),
        (3, 'Ana Clara', '2000-02-15');

INSERT INTO TelefoneMedico (Telefone, CRM)
    VALUES
        ('83991234567', 'CRM-111111'),
        ('83988776655', 'CRM-222222'),
        ('83997654321', 'CRM-333333');

INSERT INTO SetorMedico (CodSetor, CRM)
    VALUES
        (1, 'CRM-111111'),
        (2, 'CRM-222222'),
        (3, 'CRM-333333');

INSERT INTO Atendimento (CodAtendimento, DataAtendimento, Valor, Operadora, AtendimentoAnterior, CRM, CodPaciente)
    VALUES
        (1001, '2025-07-01', 150.00, 'Unimed', NULL, 'CRM-111111', 1),
        (1002, '2025-07-05', 200.00, 'Bradesco', 1001, 'CRM-222222', 2),
        (1003, '2025-07-10', 175.50, 'Amil', NULL, 'CRM-333333', 3);

