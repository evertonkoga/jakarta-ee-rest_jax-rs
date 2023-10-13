<center>
  <p align="center">
    <img src="https://github.com/evertonkoga/jakarta-ee-rest_jax-rs/assets/54872138/838e7f17-8e3b-40d9-9aee-64f4ca10aacb" width="180"/>
    <img src="https://github.com/evertonkoga/jakarta-ee-rest_jax-rs/assets/54872138/845f9365-157e-4063-80af-7ef9b071571a" width="150" height="150"/>
  </p>  
  <h1 align="center">Jakarta EE REST com JAX-RS</h1>
  <p align="center">
    Um projeto de estudo envolvendo Jakarta EE e JAX-RS, focado em aprendizado com exercícios práticos.<br />
    Por meio da implentação do <b>Jersey</b>, eu crio APIs utilizando o <b>protocolo HTTP</b> para especificar ações e suas respostas. Isso abrange a definição de <b>MIME types</b>, utilização correto dos <b>status codes</b>, o uso de verbos como <b>GET, POST e DELETE</b>, além da implementação de <b>interceptores</b> e <b>filtros</b> tanto no lado do servidor quanto do cliente. Tudo isso é executado no servidor <b>Grizzly</b>.
  </p>
</center>
<br />

## Ferramentas utilizadas

- JDK 17
- IDE Intellij Community Edition
- Maven

## Como executar?

1. Clonar o repositório:
```sh
git clone https://github.com/evertonkoga/jakarta-ee-rest_jax-rs.git
```

### Executar API no Grizzly

Execute o método `main()` na classe **Server** na raiz do projeto, em seguida digite o número do exercício que deseja testar.

Pronto! Aguarde a exibição da mensagem abaixo:

```sh
Server is started...
Server URL: http://localhost:8080
```
> Caso queira acessar a documentação em WADL acesse o link http://localhost:8080/application.wadl.

### Acesse a API via Client Jersey

Após executar o passo anterior, basta execute o método `main()` na classe **ClientRest** de cada exercício que esteja testando, caso exista.
