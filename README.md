# encontrarLeiloes
Sistema de Leilão

O que é o Sistema de Leilão?
O sistema de leilão tem por finalidade facilitar ao usuário a busca por 
itens de interesse no site de leilões https://www.nellisauction.com/. 
Através dessa aplicação é possível cadastrar os itens de interesse, 
o que gerará um alerta ao usuário quando o mesmo estiver sendo leiloado.
Esse alerta informará valores desse item em lojas virtuais e trará a
opção de participar do leilão. Ao participar o usuário indicará o lance
mínimo e máximo, a aplicação se encarrega de cobrir os lances 
automaticamente até o valor máximo estabelecido pelo usuário a partir
dos últimos minutos para o término do leilão.

Como desenvolver localmente?
Subir o banco executando no terminal o comando: 
-> make db-up
E para parar o banco basta executar o comando:
-> make db-down

Como testar a aplicação?
Para testar a aplicação, você pode utilizar os métodos HTTP: GET, POST,
DELETE E PUT. Com o POST é possível criar um produto da seguinte forma:
{
"titulo": "Teste",
"descricao": "Descrição do produto",
"link": "http:...",
"preco": 00.00
}
O id será gerado automáticamente, sendo necessário passar como parâmetro
para atualizar(PUT) e excluir(DETELE).
O método GET retorna todos os produtos.

 
