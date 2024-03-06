# encontrarLeiloes
Sistema de Leilões

O que é o Sistema de Leilções?
O sistema de leilões tem por finalidade facilitar ao usuário a busca por 
itens disponíveis para lançes em leilões. Através dessa aplicação é 
possível encontrar os itens em diversos leilões, comparar preços dos 
mesmos em lojas virtuais e principalmente facilitar a atividade de dar 
lances. Ao estipular os valores mínimo e máximo de lances, a aplicação
se encarrega de cobrir os lances automaticamente até o valor máximo 
estabelecido pelo usuário.

Como desenvolver localmente?
Subir o banco executando no terminal o comando: 
-> make db-up
E para parar o banco basta executar o comando:
-> make db-down

Como testar a aplicação?
Para testar a aplicação, você pode utilizar os métodos HTTP: GET, POST,
DELETE E PUT. Com o POST é possível criar um DTO passando os campos:
-titulo(String);
-descricao(String);
-link(String);
-preco(Float).
O id será gerado automáticamente, sendo necessário passar como parâmetro
para atualizar(PUT) e excluir(DETELE).
O método GET retorna todos os produtos.

 
