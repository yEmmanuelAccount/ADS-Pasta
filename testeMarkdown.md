Seguindo exatamente o modelo da imagem que você enviou (com Resumo, Pré/Pós-condições, Ações e Restrições), aqui estão os quadros para os dois casos de uso solicitados para o sistema Acervus.
Quadro 01: Descrição do caso de uso Gerenciar Item do Acervo
| Campo | Descrição |
|-------|-----------|
| Nome do Caso de Uso | UC_Gerenciar_Item – Gerenciar Item do Acervo |
| Ator principal | Administrador do Acervo |
| Atores secundários | (Nenhum) |
| Resumo | Este caso de uso engloba as operações administrativas de catalogar (criar), editar informações ou excluir um item digital e seus metadados do acervo. |
| Pré-condições | 1. O Administrador deve estar autenticado no sistema. 2. Para editar ou excluir, o item deve existir na base de dados. |
| Pós-condições | 1. (Se criar): Novo item registrado com status visível ou oculto. 2. (Se editar): Dados do item atualizados. 3. (Se excluir): Item e arquivos removidos permanentemente ou marcados como inativos. |
| Ações do Ator | Ações do Sistema |
| 1. Acessar o módulo de "Gestão de Acervo". | 2. Exibir a lista de itens cadastrados e as opções: "Novo Item", "Editar" e "Excluir". |
| 3. (Fluxo Criar): Selecionar "Novo Item", preencher metadados (título, autor, etc.) e fazer upload do arquivo. | 4. Validar o preenchimento dos campos obrigatórios e o formato do arquivo. |
| 5. (Fluxo Editar): Selecionar um item existente e alterar dados ou substituir o arquivo. | 6. Verificar se as alterações são válidas. |
| 7. (Fluxo Excluir): Selecionar um item e solicitar a exclusão. | 8. Solicitar confirmação crítica de exclusão. |
| 9. Confirmar a operação (Salvar ou Excluir). | 10. Executar a operação no banco de dados e emitir mensagem de sucesso. |
| Restrições/Validações | 1. O título do item e o arquivo digital são obrigatórios. 2. O arquivo não pode exceder o tamanho máximo permitido (ex: 500MB). 3. A exclusão de um item é irreversível (ou requer aprovação superior, dependendo da regra). |

Quadro 02: Descrição do caso de uso Consultar Relatório de Uso
| Campo | Descrição |
|-------|---------- |
| Nome do Caso de Uso | UC_Relatorio_Uso – Consultar Relatório de Uso |
| Ator principal | Administrador do Acervo |
| Atores secundários | (Nenhum) |
| Resumo | Este caso de uso permite ao administrador visualizar estatísticas sobre o engajamento do acervo, listando os itens mais populares e a contagem de acessos/visitantes. |
| Pré-condições | 1. O Administrador deve estar autenticado. 2. Devem existir registros de acesso (logs) no sistema. |
| Pós-condições | O relatório é exibido em tela ou um arquivo (PDF/CSV) é gerado para download. |
| Ações do Ator | Ações do Sistema |
| 1. Acessar o menu de "Relatórios e Métricas". | 2. Apresentar opções de filtro (Período: Data Início e Fim, Categoria, Tipo de Arquivo). |
| 3. Definir o período desejado e clicar em "Gerar Relatório". | 4. Processar os dados de acesso no banco de dados. 5. Exibir gráfico ou lista com: * Top Itens mais acessados. * Quantidade total de visitantes únicos no período. |
| 6. (Opcional) Clicar em "Exportar". | 7. Gerar e disponibilizar o arquivo do relatório. |
| Restrições/Validações | 1. A "Data Final" do filtro não pode ser anterior à "Data Inicial". 2. Se não houver dados no período selecionado, o sistema deve informar "Nenhum registro encontrado". |