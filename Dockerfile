# Utilizamos una imagen de Gradle para construir el proyecto
FROM gradle:jdk17-alpine AS builder

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos los archivos de construcción y gradle.properties para permitir la descarga de dependencias
COPY . .

# Copiamos el directorio de código fuente
EXPOSE 8080

# Construimos el proyecto
CMD ["./gradlew","run"]
