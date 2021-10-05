# REDIS

- database
- cache
- message broker

## Simulador de linha de comando

é um simulador do propt do redis, nele é passado uma serie de tutorias com os comando presenes no redis.

[link](https://try.redis.io/)

## rodar redis local

resposta do stack over flow de como rodar redis localmente.

```bash

# inicailizar o doker na 127.0.0.0.1:6379

sudo docker run -d --name redis-test -p 6379:6379  -v /path/to/redisconf/redis.conf:/redis.conf redis redis-server /redis.conf

# se conecta com o redis na 127.0.0.0.1:6379

redis-cli

```

[link](https://stackoverflow.com/questions/41371402/connecting-to-redis-running-in-docker-container-from-host-machine)

## Get-start balun

um get-start promovido pela baelun, ensina como utilizar o redis com java.

[link](https://www.baeldung.com/jedis-java-redis-client-library)

## Meu get-starte

o meu get start é um projeto em java para mostrar o funcinamento do redis ele está na pasta `./get-starte`

para o funcinamento correto da aplicação é necessario rodar o seguinte comando:

```bash
mvn clean install
```

precisa estar com redis rodando na `127.0.0.0.1:6379`.

ou pode altrar aquivo `application.yml`

```yml
ip: "localhost"
port: 6379
```
