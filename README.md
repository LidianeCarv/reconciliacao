<h1># reconciliacao </h1>
> Status: Em desenvolvimento ⚠️

## O que é o Sistema Reconciliação?
<p>É um sistema para realizar a reconciliacao de reservas
de casas alugadas pelo Airbnb, Booking e reservas por fora.
Nele é possível fazer exportação de extrato do banco,de
histórico das plataformas de aluguel, além de lançamentos
de reservas por fora, das despesas, das retiradas e recebimentos,
vinculando esses registros com o extrato do banco, validando 
assim todas as informações</p>

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
  <td>1.26.0</td>
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

 
