## Modelos de requisições esperadas pela API

### Login
```JSON
{
  "login": "seu.email@voll.med",
  "senha": "123456"
}
```
Retorna o token de acesso para ser utilizado no header das requisoções

---

### Cadastro de Médicos
```
POST /medicos
HEADER:
    Authorization: Bearer {token}
    Content-Type: application/json
```
```JSON
{
  "nome": "João Roberto da Silva",
  "email": "joao.roberto@voll.med",
  "telefone": "47965485752",
  "crm": "233444",
  "especialidade": "CARDIOLOGIA",
  "endereco": {
    "logradouro": "Rua 5",
    "bairro": "Parque Alegre",
    "cep": "12345678",
    "cidade": "Brasilia",
    "uf": "DF",
    "numero": "123"
  }
}
```

---

### Cadastro de Pacientes
```
POST /pacientes
HEADER:
    Authorization: Bearer {token}
    Content-Type: application/json
```
```JSON
{
  "nome": "Rondinelli da Costa Rosa",
  "email": "rondinellicosta@ig.br",
  "telefone": "55942136598",
  "cpf": "242.423.689-89",
  "endereco": {
    "logradouro": "Rua da Árvore",
    "bairro": "Colina das Oitis",
    "cep": "12345678",
    "cidade": "Jundilândia",
    "uf": "RO",
    "numero": "123"
  }
}
```

---

### Listagem de Médicos
```
GET /medicos
HEADER:
    Authorization: Bearer {token}
```

---

### Listagem de Pacientes
```
GET /pacientes
HEADER:
    Authorization: Bearer {token}
```

---

### Atualização de Médicos
```
PUT /medicos
HEADER:
    Authorization: Bearer {token}
    Content-Type: application/json
```
```JSON
{
  "id": 1,
  "telefone": "5532945789458"
}
```

---

### Atualização de Pacientes
```
PUT /pacientes
HEADER:
    Authorization: Bearer {token}
    Content-Type: application/json
```
```JSON
{
  "id": 1,
  "telefone": "5532945789458"
}
```

---

### Exclusão de Médicos
```
DELETE /medicos/{id_medico}
HEADER:
    Authorization: Bearer {token}
    Content-Type: application/json
```

---

### Exclusão de Pacientes
```
DELETE /pacientes/{id_paciente}
HEADER:
    Authorization: Bearer {token}
    Content-Type: application/json
```

---

### Detalhamento de Médicos
```
GET /medicos/{id_medico}
HEADER:
    Authorization: Bearer {token}
```

---

### Detalhamento de Pacientes
```
GET /pacientes/{id_paciente}
HEADER:
    Authorization: Bearer {token}
```
