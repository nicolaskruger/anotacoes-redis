# REDIS

- database
- cache
- [message broker](#message-broker)

## :pushpin: tabela de conteudo

- [tipos de dados suportados](#tipos-de-dados-suportados)
- [apendice](#apendice)

## tipos de dados suportados

- strings
- hashes
- lists
- sets
- sorted
- sets

## features

- [Transactions](#transaction)
- Pub/Sub
- Lua scripting
- Keys with a limited time-to-live
- LRU eviction of keys
- Automatic failover

## apendice

### message broker

Os message brokers são uma tecnologia de comunicação entre aplicativos que ajuda a criar um mecanismo de integração comum para suportar arquiteturas de cloud híbrida, sem servidor e com base em microsserviços.

### bitmap

chave valor inteiro bit

```code
> setbit key 10 1
(integer) 1
> getbit key 10
(integer) 1
> getbit key 11
(integer) 0
```

### transaction

#### **tipos**

- MULT
- EXEC
- DISCARD
- WATCH

permitem executar uma série de comandos comandos em uma unica vez.

#### **exemplo de comando**

```bash
> MULTI # permite a execução de multiplos comandos
OK
> INCR foo # empilha o primeiro comando
QUEUED
> INCR bar # empilha o segundo comando
QUEUED
> EXEC # executa ambos os comandos
1) (integer) 1
2) (integer) 1
```

### Pub/Sub

#### **comandos**

- SUBSCRIBE
- UNSUBSCRIBE
- PUBLISH

```code
SUBSCRIBE foo bar
```
