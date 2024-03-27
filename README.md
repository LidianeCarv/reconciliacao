> Status: Em desenvolvimento ⚠️

## O que é o Sistema de Reconciliação?
<p>É um sistema para realizar a reconciliação de reservas
de casas alugadas pelo Airbnb, Booking e reservas por fora.
Nele é possível fazer exportação de extrato do banco, de
histórico das plataformas de aluguel, além de lançamentos
de: reservas por fora, despesas, retiradas e recebimentos,
vinculando esses registros com o extrato do banco, validando 
assim, todas as informações.</p>

## Diagrama de Classe
![Captura de tela de 2024-03-27 19-28-14](https://github.com/LidianeCarv/reconciliacao/assets/112911249/548f360c-7129-42cd-9d98-72338065d37a)

## Tecnologias usadas:
<Table>
 <tr>
  <td>Java</td>
  <td>SpringBoot</td>
  <td>Docker Compose</td>
  <td>Postgresql</td>
 </tr>
 <tr>
  <td>17.0.10 </td>
  <td>3.2.2</td>
  <td>2.24.7</td>
  <td>16.2.0</td>
</tr>
</Table>

## Como desenvolver localmente?
### Para subir o banco execute no terminal o comando: 
+ make db-up
### Para parar o banco basta executar o comando:
+ make db-down

## Como testar a aplicação?
Para testar a aplicação, você pode utilizar os métodos HTTP: GET, POST,
DELETE E PUT.Com o POST é possível criar uma nova reconciliacao da 
seguinte forma:
~~~html
{
"data": "01/01/2001",
"notas": "Descrição da reconciliacao",
"extrato_banco_id": 03,
"movimentacao_reserva_id": 04,
"movimentacao_financeira_id": 05
}
~~~
No método POST o id será gerado automáticamente, sendo necessário passar como parâmetro
apenas para atualizar(PUT) e excluir(DETELE).
O método GET retorna todos os produtos.

 
