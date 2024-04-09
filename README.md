# CRUD de Categorias en Micronaut con Gradle 
_Sistema desarrollado por KennerDev_

<p align="center">
<a href="https://micronaut.io"><img src="https://imgs.search.brave.com/pQgW5L2RpCxKqHGtn1dVArYcpMfgyMkjZ1gozdl4vbk/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9hc3Nl/dC5icmFuZGZldGNo/LmlvL2lkS0VnMUxr/Z2kvaWRzYWN6eUVu/Ny5zdmc_dXBkYXRl/ZD0xNzAxMjgzMzMz/MDQx.svg" width="400" alt="Angular Logo" /></a>
</p>

### Pre-requisitos 📋

_Para poder inicializar el sistema se requiere lo siguiente :_

```
1. Git.
2. Docker.
3. Micronaut.
4. IntelliJ (Editor de Codigo).
```

### Clonar el Repositorio 🔧

```
git clone https://github.com/KennerEspinal/Category-Microservice-Mn.git
```
```
cd Category-Microservice-Mn
```

#### Dentro de la raíz del proyecto ejecute el siguiente comando
```
 ./gradlew run
```

> [!WARNING]
> No es necesario instaciar la base de datos ya que al correr el comando.
> ```sh
> ./gradlew run
> ````
> El mismo micronaut se encargara da crear dos contenedores uno para la base de datos y otro para la app.
> si desea crear el Dockerfile usar el comando.
> ```sh
> ./gradlew dockerBuild 
> ````
> Esto generará en la ruta build/docker/main el archivo Dockerfile con lo necesario para ejecutar.


### Correr la App 🚀
> [!NOTE]
> Para correr el microservicio: 
> ```sh
> ./gradlew run
> ````


> [!IMPORTANT]
> Si desea especificar la base de datos hay un ejemplo en el path resources application.properties de donde puedes guiarte.
> usando.
> ```sh
> docker compose up
> ````
> levanta un servicio de mysql y solo con descomentar las lineas en application.properties puede tener una conexión específica a base de datos

## Autor ✒️

- **Kenner Espinal**

## Expresiones de Gratitud 🎁

- Comenta a otros sobre este proyecto 📢
- Invitanos una cerveza 🍺 o un café ☕ a alguien del equipo.
- Da las gracias públicamente 🤓.
- etc.
