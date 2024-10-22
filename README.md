# Requisitos
### Banco de dados
Antes de execeutar o código, deve-se criar um banco de dados **MYSQL** com o nome: `dbfirst`.
Também deve-se atualizar o documento `application.properties` que está inserido na pasta `src/main/resources`:<br><br>
`spring.application.name=database-first-orm`<br>
`spring.datasource.url=jdbc:mysql://<IP_SERVIDOR>:<PORTA_SERVIDOR>/dbfirst`<br>
`spring.datasource.username=<USUARIO>`<br>
`spring.datasource.password=<SENHA>`<br>
`spring.jpa.hibernate.ddl-auto=update`<br>
`spring.jpa.show-sql=true`<br>
### Iniciando o projeto
Para executá-lo, devemos iniciar a main da classe: `DatabaseFirstOrmApplication`.
Esta classe está armazenada na pasta `src/main/java/orm.billig.database_first_orm`.

 
