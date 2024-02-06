# springboot-mapstruct-example

### Customer curl
curl -X POST http://localhost:8080/customers --json '{"email": "johnsmith@mail.com", "name": "John", "surname": "Smith", "password": "secret"}'

curl -s http://localhost:8080/customers/1 

### User curl
curl http://localhost:8080/users/1

curl -X POST http://localhost:8080/users --json '{"email": "juanperez@mail.com", "password": "secret", "name": "Juan", "surname": "Perez"}'

### Author curl
curl http://localhost:8080/authors

### Book curl
curl http://localhost:8080/books/1

