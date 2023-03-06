# BANCA MIFEL
## Prueba Tecnica
### Luis Eduardo Garcia Mercado
---

### Detalles de la práctica
1. Implementar mecanismo de autenticación vía JWT, con OAUT 2

    #### Api LOGIN REQUEST
        - curl --location --request POST 'localhost:8080/oauth/token' \
        - Autorization:
            - username: BancaMifel
            - pass: bancamifelpass

        - Body:
            - formato: x-www-form-urlencoded
            - keys admin:
                - username: admin
                - password: 12345
                - grant_type: password
            - keys user:
                - username: bancamifel
                - password: 12345
                - grant_type: password


- Respuesta de la petición:
~~~
    {
        "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpbmZvX2FkaWNpb25hbCI6IkhvbGEgcXVlIHRhbCE6IGFkbWluIiwidXNlcl9uYW1lIjoiYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiYXBlbGxpZG8iOiJhZG1pbiIsImV4cCI6MTY3ODExMjIxOSwibm9tYnJlIjoiQWRtaW5pc3RyYWRvciIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iLCJST0xFX1VTRVIiXSwianRpIjoiZGVlOGJiZDktMjY3ZS00NDY5LWI4MTMtMWYzN2U2ZjczMjRiIiwiZW1haWwiOiJhZG1pbkBhZG1pbi5jb20iLCJjbGllbnRfaWQiOiJCYW5jYU1pZmVsIn0.sLKq3JYjpa6dph8BokE4G-phwwZMo7t0XV_HsQxMNVD33hbh0FjkLuWRn-3zjcLQoDAekuKMloQGM9U03Kn7SZVnWxwGxyeTC1BjvKdE-1GP3zmOsRZZ-jrhlGrjZHHwc0RqnCrnaEThmNoBS97UkfzGlUQeOslk8yNKp88u2A2yEDEIXBlfIM1EzujKjEX2vxvnzcHqieNiAlRGwn7fJLtXZSaE-GEaFiXHBhpQYzEAsxly5wylq7gKvybacKLvqUbFVjzUTjZGRFBEsz-IwS2YGwV8qvL7OXOBGaeyKwsFaNdJhkmdGExqAg6qd9CCgw3fVjCIpbMSgUECvvChPg",
        "token_type": "bearer",
        "refresh_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpbmZvX2FkaWNpb25hbCI6IkhvbGEgcXVlIHRhbCE6IGFkbWluIiwidXNlcl9uYW1lIjoiYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiYXBlbGxpZG8iOiJhZG1pbiIsImF0aSI6ImRlZThiYmQ5LTI2N2UtNDQ2OS1iODEzLTFmMzdlNmY3MzI0YiIsImV4cCI6MTY3ODExMjIxOSwibm9tYnJlIjoiQWRtaW5pc3RyYWRvciIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iLCJST0xFX1VTRVIiXSwianRpIjoiZGM4MzY0NzYtZTA2ZC00OGM3LWI1YTMtMTVlODVlNWM0ZGEwIiwiZW1haWwiOiJhZG1pbkBhZG1pbi5jb20iLCJjbGllbnRfaWQiOiJCYW5jYU1pZmVsIn0.PD8pJ8nBe1RxqzmlRZ5eYbBr9x3HiBEy_KpK4fD21bBhGgHZyTvD9yxXFDmGKFIvk4V5zr2j7S_ZzS2W9XgmBAtJZ8uncfDXBUKtAOIVHGk-UJkZVWHYLe4kYH4-zdq3Bzeq4pkXgDr0QinpUSE2CrOkebLtBLtWH0VFpRyvCtP76qs4dSWq5txWefJk0GHEMH7LwNYYQOUrUaKmCcVYPlxkqHDVaxFqs9wM7--cF7IVctLi1QbNtKwzL9nj0GouJpFiYwuujqc_lmFEz3QGLDB5roZQ7RnP89ZIONZqA_tcszxSYiFSUHinV5ne4_yD0QgseYx8nIY37__P-vMAbQ",
        "expires_in": 3599,
        "scope": "read write",
        "info_adicional": "Hola que tal!: admin",
        "apellido": "admin",
        "nombre": "Administrador",
        "email": "admin@admin.com",
        "jti": "dee8bbd9-267e-4469-b813-1f37e6f7324b"
    }
~~~

Para las siguientes Apis será necesario utilizar el "access_token" además de los siguientes modos de
autenticación:

    - Bearer Token
        - Ingresa el "access_token" al campo Token y envialo.
    - IAuth2.0
        Ingresa los datos de la conexión como los especifica en el formulario. Además tendrás un acceso
        con un Token almacenado.

--- 
### Consumiendo las Apis
- Items
- PokeApi
- Codificación

### Servicio de Items 
- 192.168.1.74:8080/api/items
- GET
- Respuesta:
~~~
[
    {
        "id": 1,
        "nombre": "MACBOOK",
        "marca": "Apple",
        "modelo": "M1",
        "descripcion": "Laptop de alta Gama",
        "precio": 30000.0,
        "createAt": "2020-01-01"
    },
    {
        "id": 2,
        "nombre": "MOUSE",
        "marca": "Delux",
        "modelo": "Pro",
        "descripcion": "Mouse Pro",
        "precio": 30000.0,
        "createAt": "2021-01-01"
    },
    {
        "id": 3,
        "nombre": "TV",
        "marca": "SAMSUNG",
        "modelo": "8k",
        "descripcion": "TV de gran definición",
        "precio": 50000.0,
        "createAt": "2022-01-01"
    }
]
~~~
- 192.168.1.74:8080/api/items?nombre=MACBOOK
- GET
~~~
[
    {
        "id": 1,
        "nombre": "MACBOOK",
        "marca": "Apple",
        "modelo": "M1",
        "descripcion": "Laptop de alta Gama",
        "precio": 30000.0,
        "createAt": "2020-01-01"
    }
]
~~~

- 192.168.1.74:8080/api/items/1
- DELETE
- Respuesta Admin:
~~~
{
    "mensaje": "El item a sido eliminado con éxito!"
}
~~~
- Respuesta User:
~~~
{
    "error": "access_denied",
    "error_description": "Access is denied"
}
~~~
--- 
### Servicio de consulta POKEAPI

- 192.168.1.74:8080/api/pokemonDitto
- GET
- Respuesta: 
~~~
{
    "abilities": [
        {
            "ability": {
                "name": "limber",
                "url": "https://pokeapi.co/api/v2/ability/7/"
            },
            "is_hidden": false,
            "slot": 1
        },
        {
            "ability": {
                "name": "imposter",
                "url": "https://pokeapi.co/api/v2/ability/150/"
            },
            "is_hidden": true,
            "slot": 3
        }
    ],
    "base_experience": 101,
    "forms": [
        {
            "name": "ditto",
            "url": "https://pokeapi.co/api/v2/pokemon-form/132/"
        }
    ],
    "game_indices": [
        {
            "game_index": 76,
            "version": {
                "name": "red",
                "url": "https://pokeapi.co/api/v2/version/1/"
            }
        },
        {
            "game_index": 76,
            "version": {
                "name": "blue",
                "url": "https://pokeapi.co/api/v2/version/2/"
            }
        },
        {
            "game_index": 76,
            "version": {
                "name": "yellow",
                "url": "https://pokeapi.co/api/v2/version/3/"
            }
        },
        ...
~~~
- Respuesta sin autorizacion:
~~~
{
    "error": "unauthorized",
    "error_description": "Full authentication is required to access this resource"
}
~~~

--- 
### Servicio de consulta Codifiación "AES/CBC/PKCS5Padding"

- 192.168.1.74:8080/api/codificar?cadena=holamundo
- GET
- Respuesta:
~~~
{
    "Cadena Codificada": "[B@48b2a1b4"
}
~~~
- Respuesta sin cadena enviada:
~~~
{
    "mensaje": "Error al codificar la cadena",
    "error": "Cannot invoke \"String.getBytes()\" because \"cadena\" is null: Cannot invoke \"String.getBytes()\" because \"cadena\" is null"
}
~~~