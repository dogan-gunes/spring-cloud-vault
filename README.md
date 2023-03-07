
# Spring Boot with Vault

![Test Image](/1.PNG "Vault")


---
# Running Vault for Development
```
$ docker run --cap-add=IPC_LOCK -d --name=dev-vault vault
This runs a completely in-memory Vault server, which is useful for development but should not be used in production.

When running in development mode, two additional options can be set via environment variables:

VAULT_DEV_ROOT_TOKEN_ID: This sets the ID of the initial generated root token to the given value
VAULT_DEV_LISTEN_ADDRESS: This sets the IP:port of the development server listener (defaults to 0.0.0.0:8200)
As an example:
$ docker run --cap-add=IPC_LOCK -e 'VAULT_DEV_ROOT_TOKEN_ID=myroot' -e 'VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:1234' vault
```
---

# Docker Hub Link

[Go Docker Hub Vault Image](https://hub.docker.com/_/vault "https://hub.docker.com/_/vault")

