# projetojavarest
Projeto Java RESTFULL com Spring Boot e Hibernate
Endpoints:

Endereço Base: localhost:8080

[Bebida]

GET - /api/bebida (/api/bebida) -      Obtem todas as bebidas
Retorno:
[
    {
        "tipoProduto": "Bebida",
        "id": 1,
        "descricao": "bebida",
        "preco": 120.0,
        "fabricante": "fabricante",
        "rotulo": "rótulo"
    },
    {
        "tipoProduto": "Bebida",
        "id": 2,
        "descricao": "bebida",
        "preco": 240.0,
        "fabricante": "fabricante",
        "rotulo": "rótulo"
    }
    
]

GET - /api/bebida/{id} (/api/bebida/1) - Obtem uma bebida por Id
Retorno:
{
        "tipoProduto": "Bebida",
        "id": 1,
        "descricao": "bebida",
        "preco": 120.0,
        "fabricante": "fabricante",
        "rotulo": "rótulo"
}

POST - /api/bebida (/api/bebida)- Inclui uma bebida
Json
{
        "tipoProduto": "Bebida",        
        "descricao": "bebida",
        "preco": 120.0,
        "fabricante": "fabricante",
        "rotulo": "rótulo"
}

DELETE - /api/bebida/{id} (/api/bebida/1) - Exluir uma bebida (Não exclui se já estiver atribuído a um pedido)

[Computador]

GET - /api/computador (/api/computador) -      Obtem todos os computadores
Retorno:
[
    {
        "tipoProduto": "Computador",
        "id": 1,
        "descricao": "computador",
        "preco": 120.0,
        "fabricante": "fabricante",
        "modelo": "modelo"
    },
    {
        "tipoProduto": "Computador",
        "id": 2,
        "descricao": "computador",
        "preco": 240.0,
        "fabricante": "fabricante",
        "modelo": "modelo"
    }
    
]

GET - /api/computador/{id} (/api/computador/1) - Obtem um computador por Id
Retorno:
{
        "tipoProduto": "Computador",
        "id": 1,
        "descricao": "computador",
        "preco": 120.0,
        "fabricante": "fabricante",
        "modelo": "modelo"
}

POST - /api/computador (/api/computador)- Inclui um computador
Json
{
        "tipoProduto": "Computador",        
        "descricao": "computador",
        "preco": 120.0,
        "fabricante": "fabricante",
        "modelo": "modelo"
}

DELETE - /api/computador/{id} (/api/computador/1) - Exlui um computador (Não exclui se já estiver atribuído a um pedido)

[Empresa]

GET - /api/empresa (/api/empresa) -      Obtem todas as empresas
Retorno:
[
    {
        "id": 1,
        "nome": "nome",
        "endereco": "endereco",
        "nacional": true,
        "email": "email@email.com"
    },
    {
        "id": 2,
        "nome": "nome2",
        "endereco": "endereco",
        "nacional": false,
        "email": "email2@email.com"
    }
]

GET - /api/empresa/{id} (/api/empresa/1) - Obtem uma empresa por Id
Retorno:
{
        "id": 1,
        "nome": "nome",
        "endereco": "endereco",
        "nacional": true,
        "email": "email@email.com"
}

POST - /api/empresa (/api/empresa)- Inclui uma empresa
Json
{
        "nome": "nome",
        "endereco": "endereco",
        "nacional": true,
        "email": "email@email.com"
}

DELETE - /api/empresa/{id} (/api/empresa/1) - Exlui uma empresa (Não exclui se já estiver atribuído a um pedido)

[Livro]

GET - /api/livro (/api/livro) -      Obtem todos os livros
Retorno:
[
    {
        "tipoProduto": "Livro",
        "id": 1,
        "descricao": "livro",
        "preco": 120.0,
        "titulo": "título",
        "autor": "autor",
	      "editora": "editora",
	      "anoEdicao": 2020
    },
    {
        "tipoProduto": "Livro",
        "id": 2,
        "descricao": "livro",
        "preco": 120.0,
        "titulo": "título",
        "autor": "autor",
	      "editora": "editora",
	      "anoEdicao": 2020
    }
    
]

GET - /api/livro/{id} (/api/livro/1) - Obtem um livro por Id
Retorno:
{
        "tipoProduto": "Livro",
        "id": 1,
        "descricao": "livro",
        "preco": 120.0,
        "titulo": "título",
        "autor": "autor",
	      "editora": "editora",
	      "anoEdicao": 2020
}

POST - /api/livro (/api/livro)- Inclui um livro
Json
{
        "tipoProduto": "Livro",        
        "descricao": "livro",
        "preco": 120.0,
        "titulo": "título",
        "autor": "autor",
	      "editora": "editora",
	      "anoEdicao": 2020
}

DELETE - /api/livro/{id} (/api/livro/1) - Exluir um livro (Não exclui se já estiver atribuído a um pedido)


[Pedido]

GET - /api/pedido (/api/pedido) -      Obtem todos os pedidos
Retorno:
[
  {
	"entregue":"false",
	"observacao":"Rua 5",
	"descricao":"Pedido 01",
	"empresa":{
		"nome":"Empresa 01",
		"email":"mail@empresa.com",
		"nacional":"true",
		"endereco":"Enredeço 01"
	},
	"itens":[{
		"quantidade":"2",
		"produto":{
			"tipoProduto":"Computador",
			"descricao":"Computador i7",
			"fabricante":"Dell",
			"modelo":"Inspiron",
			"preco":"900.00"
		}
	},{
		"quantidade":"1",
		"produto":{
			"tipoProduto":"Bebida",
			"descricao":"whisky 12 anos",
			"fabricante":"Chivas",
			"rotulo":"Black Label",
			"preco":"99.00"
		}
	}]
 }    
]

GET - /api/pedido/{id} (/api/pedido/1) - Obtem um pedido por Id
Retorno:
 {
	"id":"1",
        "entregue":"false",
	"observacao":"Rua 5",
	"descricao":"Pedido 01",
	"empresa":{
		"nome":"Empresa 01",
		"email":"mail@empresa.com",
		"nacional":"true",
		"endereco":"Enredeço 01"
	},
	"itens":[{
		"quantidade":"2",
		"produto":{
			"tipoProduto":"Computador",
			"descricao":"Computador i7",
			"fabricante":"Dell",
			"modelo":"Inspiron",
			"preco":"900.00"
		}
	},{
		"quantidade":"1",
		"produto":{
			"tipoProduto":"Bebida",
			"descricao":"whisky 12 anos",
			"fabricante":"Chivas",
			"rotulo":"Black Label",
			"preco":"99.00"
		}
	}]
   }

POST - /api/pedido (/api/pedido)- Inclui um pedido
Json
{
	"entregue":"false",
	"observacao":"Rua 5",
	"descricao":"Pedido 01",
	"empresa":{
		"nome":"Empresa 01",
		"email":"mail@empresa.com",
		"nacional":"true",
		"endereco":"Enredeço 01"
	},
	"itens":[{
		"quantidade":"2",
		"produto":{
			"tipoProduto":"Computador",
			"descricao":"Computador i7",
			"fabricante":"Dell",
			"modelo":"Inspiron",
			"preco":"900.00"
		}
	},{
		"quantidade":"1",
		"produto":{
			"tipoProduto":"Bebida",
			"descricao":"whisky 12 anos",
			"fabricante":"Chivas",
			"rotulo":"Black Label",
			"preco":"99.00"
		}
	}]
}

DELETE - /api/pedido/{id} (/api/pedido/1) - Exlui um pedido
