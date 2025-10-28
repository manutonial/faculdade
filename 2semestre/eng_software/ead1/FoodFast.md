# FoodFast

## Funcionais
### Foco: O que o sistema deve fazer, acões e comportamentos

| RF1 | Cadastro de Clientes |
|-----|----------------------|
| **Descrição** | O sistema deve ter um sistema de login, que usa email e senha como credenciais
| **Prioridade** | Alta 

| RF2 | Login |
|-----|-------|
| **Descrição** | O sistema deve ter uma funcionalidade segura de login, relacionada com o cadastro dos clientes |
| **Prioridade** | Alta |

| RF3 | Enviar notificações |
|-----|-------|
| **Descrição** | O sistema também deve enviar notificações automáticas para o usuário sempre que o status for alterado.|
| **Prioridade** | Alta |

| RF4 | Acessa lista pendente |
|-----|-------|
| **Descrição** | Do lado da logística, os motoboys terão acesso a uma lista de entregas pendentes, mas só poderão aceitar um pedido por vez até concluí-lo.|
| **Prioridade** | Alta |

| RF5 | Pagamento |
|-----|-----------|
| **Descrição** | Deve possuir funcionalidade de pagamentos, e suportar os metodos da RN01|
| **Prioridade** | Alta |

| RF6 | Alterar status do pedido|
|------|-------------------------|
| **Descrição** | O restaurante parceiro, ao receber o pedido, poderá alterar o status para “em preparo”, “a caminho” ou “entregue”. |
| **Prioridade**| Alta |

<br>

## Não funcionais
### Foco: Qualidades, características e restrições do sistema. Experiência e eficiência

| RNF1 | Disponibilidade do Sistema |
|------|----------------------------|
| **Descrição** | O sistema deverá estar disponível pelo menos 99% do tempo em cada mês e, para garantir boa experiência, deve suportar até 10.000 acessos simultâneos sem perda significativa de desempenho. |
| **Categoria** | Infraestrutura |
| **Obrigatoriedade** | Obrigatório |


| RNF2 | Conformidade com a LGDP |
|------|-------------------------|
| **Descrição** | O sistema deve estar em conformidade com as normas da LGDP |
| **Categoria** | Segurança |
| **Obrigatoriedade** | Obrigatório |


| RNF3 | Multiplataforma |
|------|-----------------|
| **Descrição** | Como o sistema precisa funcionar tanto em celulares (Android e iOS) quanto em navegadores web|
| **Categoria** | Abrangência |
| **Obrigatoriedade** | Obrigatório |

| RNF4 | Tempo de resposta |
|------|------------------|
| **Descrição** | O sistema deve processar qualquer requisição do usuário (como login, consulta de cardápio ou confirmação de pedido) em no máximo 2 segundos em condições normais de operação. |
| **Categoria** | Desempenho |
| **Obrigatoriedade** | Obrigatório |


<br>

## Regras de negócio
| Nome | Metódo de pagamento (RN01)|
|------|---------------------------|
|**Descrição**| Uma vez escolhido o pedido, o usuário poderá realizar o pagamento diretamente no sistema, seja por cartão de crédito ou por PIX
|**Fonte**|--- 
|**Histórico**| data --/--/----

| Nome | Repassar valor (RN02)|
|------|----------------------|
|**Descrição**| Os restaurantes terão que repassar 15% do valor de cadavenda realizada através da plataforma como taxa de serviço.
|**Fonte**|--- 
|**Histórico**| data --/--/----

| Nome | Cancelamento de pedido (RN03)|
|------|-----------------------------|
|**Descrição**| O cliente poderá cancelar o pedido apenas até o momento em que o restaurante marcar o status como "em preparo". Após isso, o cancelamento não será mais permitido.
|**Fonte**|--- 
|**Histórico**| data --/--/----


