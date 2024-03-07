<h1># encontrarLeiloes</h1>
> Status: Em desenvolvimento ⚠️

## O que é o Sistema de Leilões?
<p>Nellis Auction é um site de leilões on-line que trabalha com produtos dos 
principais varejistas dos EUA. Os leilões acontecem diariamente de acordo
com o repasse dos itens, geralmente produtos que foram devolvidos, e por 
isso não são mais vendidos como novos. O grande desafio para participar 
ativamente desses leilões e obter êxito é o fato de que os mesmos costumam 
finalizar por volta de meia noite, e é próximo do término quando há mais lances.
O sistema de leilão tem por finalidade facilitar ao usuário a busca por 
itens de interesse no site de leilões https://www.nellisauction.com/. 
Através dessa aplicação é possível cadastrar os itens de interesse, 
o que gerará um alerta ao usuário quando o mesmo aparecer em leilão.
Esse alerta informará valores desse item em lojas virtuais como Amazon, 
para fins de comparação, e trará a opção de participar do leilão. Ao participar
o usuário determinará os lances mínimo e máximo e a aplicação se encarregará 
de cobrir os lances automaticamente até o valor máximo estabelecido pelo usuário a partir
dos últimos minutos para o término do leilão.</p>

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
DELETE E PUT.Com o POST é possível criar um produto de interesse da 
seguinte forma:
~~~html
{
"titulo": "Teste",
"descricao": "Descrição do produto",
"link": "http:...",
"preco": 00.00
}
~~~
No método POST o id será gerado automáticamente, sendo necessário passar como parâmetro
apenas para atualizar(PUT) e excluir(DETELE).
O método GET retorna todos os produtos.

 
