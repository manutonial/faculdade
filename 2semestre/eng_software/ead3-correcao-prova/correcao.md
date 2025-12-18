# Correção da primeira prova de Engenharia de Software

## Questão 2:
### Explique o que foi a crise do software ? Quando surgiu e até quando foi ? Qual é a solução para a crise do software (Peso 0,5)?
A crise foi uma insatisfação pelos softwares produzidos na época que eram feitos sem metodologia e não atingindo os requisitos pedidos. Surgiu no final dos anos 60 e vai até os dias atuais.
Utilizar uma abordagem metodológica de desenvolvimento, utilizando os conhecimentos da Engenharia
de Software, não fazendo de qualquer jeito.

## Questão 4:
### Cite três causas e três problemas da crise do software (0,5).
    Causas: 
    Cultura do desenvolvimento de que desenvolver software é apenas escrever código 
    Aumento da complexidade 
    Problemas de comunicação 
    Ausência de documentação

    Problemas: Fracasso nas estimativas de custo e prazo
    Insatisfação com o produto final
    Dificuldades de manutenção
    Qualidade suspeita do software produzido 
    Não cumprimento das solicitações do cliente

## Questão 5:
### Qual é o principal paradoxo enfrentado pela indústria de software atualmente?
    d) A pressão para reduzir os custos e tempo de desenvolvimento, enquanto se exige software de qualidade superior e sem falhas.

## Questão 7:
### Quais são as fases do ciclo de vida clássico do software? E explique o que se faz na análise, no projeto e na implementação?

    - Análise – se faz um estudo do domínio do problema (é o problema em si, sem envolver o computador) .
    Vai do geral até os maiores detalhes
    - Projeto – se faz o estudo do domínio da solução (como resolver o problema no computador). Aumenta o
    detalhamento feito na análise. (não é no projeto que se faz o desenvolvimento do software)
    - Implementação – se faz a escrita do código (programação)
    - Testes
    - Manutenção

## Questão 8:
### Qual é o papel do documento de requisitos no desenvolvimento de software e de que maneira os requisitos influenciam outras atividades do processo de software?
Os requisitos produzidos durante a fase de levantamento de requisitos são imprescindíveis para todas as
outras etapas do processo de desenvolvimento. Eles serão a base dos modelos produzidos na etapa de
análise, serão necessários para guiar as escolhas tecnológicas da etapa de projeto, irão influenciar na
implementação, guiarão a criação de casos de teste na etapa de testes, guiarão a validação do produto
disponibilizado na fase de entrega, além de servirem de base para manutenção do sistema. 

## Questão 9:
### Selecione abaixo a alternativa do modelo de processo de software em que o princípio fundamental é que, acada ciclo, uma versão operacional do sistema será produzida e entregue para uso ou avaliação detalhada do cliente. Os requisitos têm de ser levantados e é preciso constatar que o sistema é modular. Esse é o modelo:
    c) Incremental


## Questão 12:
### A partir do texto sobre o Sistema de Consultório Odontológico (de Dentista) abaixo, elabore a lista dos requisitos funcionais, dos requisitos não funcionais e das regras de negócio (Peso 3,0).
Código Descrição
RF01 O sistema deve permitir que o cliente realize o cadastro de clientes (informando nome, telefone, e-mail e senha).
RF02 O sistema deve permitir que o cliente realize login (com e-mail e senha)
RF03 O sistema deve permitir o cadastro de animais de estimação (com nome, espécie, raça e idade).
RF04 O sistema deve permitir que o cliente pesquise clínicas parceiras próximas(com base em sua localização.)
RF05
O sistema deve exibir os serviços disponíveis (consultas, vacinas, banho, tosa, etc.) com respectivos preços e
horários.
RF06
O sistema deve permitir que o cliente agende serviços (consultas, vacinas, banho,
tosa, etc.) em uma clínica selecionada.
RF07
O sistema deve permitir que o cliente cancele um agendamento (desde que o horário marcado seja superior a 2
horas no futuro) .
RF08 O sistema deve permitir que as clínicas parceiras acessem uma área administrativa.
RF09 O sistema deve permitir que a clínica cadastre e gerencie seus horários disponíveis.
RF10 O sistema deve permitir que a clínica confirme ou recuse agendamentos recebidos.
RF11 O sistema deve permitir que a clínica atualize o status de um agendamento (pendente, confirmado, concluído).
RF12 O sistema deve enviar notificações automáticas ao cliente sempre que o status do agendamento for alterado.
Requisitos Não Funcionais
RNF01 Disponibilidade O sistema deve estar disponível pelo menos 99% do tempo em cada mês.
RNF02 Acessibilidade multiplataforma O sistema deve ser acessível por aplicativo móvel (Android/iOS) e
navegadores web.
RNF03 Segurança O sistema deve realizar cópias de segurança (backups) de todos os dados, pelo menos uma
vez por semana.
RNF04 Segurança da informação Todos os dados pessoais e clínicos devem ser armazenados com segurança e
em conformidade com a LGPD.
Regras de Negócio
RN01 Limite de agendamentos por cliente Cada cliente pode manter no máximo cinco agendamentos ativos
simultaneamente.
RN02 Cancelamento de agendamento O cancelamento só pode ser feito até 2 horas antes do horário do
agendamento.
RN03 Exclusividade por profissional e horário O sistema deve garantir que apenas um agendamento seja aceito por
horário e por profissional.
RN04 Taxa de serviço PetCare O sistema deve cobrar 10% do valor de cada agendamento confirmado como
taxa de serviço.
RN05 Notificações obrigatórias O cliente deve ser notificado automaticamente a cada mudança de status de
agendamento.