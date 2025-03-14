# 📊 Aplicación de Seguimiento de Gastos

## Descripción
Aplicación en **Java + Spring Boot + PostgreSQL** para gestionar gastos personales desde la línea de comandos. Permite agregar, eliminar, actualizar y consultar gastos, así como establecer un presupuesto mensual y recibir advertencias al superarlo.

---
## 🚀 Funcionalidades
✅ Agregar, actualizar y eliminar gastos.  
✅ Consultar todos los gastos registrados.  
✅ Consultar gastos por mes.  
✅ Definir un presupuesto mensual.  
✅ Advertencias si se supera el presupuesto.  
✅ Filtrado de gastos por categoría.  
✅ Exportación de gastos a CSV.  

---
## 🛠️ Tecnologías utilizadas
- Java 17
- Spring Boot 3
- PostgreSQL
- Hibernate / JPA
- Maven
- Lombok
- JUnit / Mockito (para pruebas)

---
## 📂 Esquema de la Base de Datos
```sql
CREATE TABLE gastos (
    id SERIAL PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    fecha DATE NOT NULL,
    categoria VARCHAR(100) NOT NULL
);

CREATE TABLE presupuestos (
    id SERIAL PRIMARY KEY,
    mes INT NOT NULL CHECK (mes BETWEEN 1 AND 12),
    monto_maximo DECIMAL(10,2) NOT NULL
);
```

---
## 📌 Endpoints

### 📝 Gastos
| Método  | Endpoint          | Descripción                        |
|---------|------------------|------------------------------------|
| `POST`  | `/gastos`        | Agregar un gasto                   |
| `GET`   | `/gastos`        | Obtener todos los gastos           |
| `GET`   | `/gastos/{mes}`  | Obtener gastos de un mes específico |
| `PUT`   | `/gastos/{id}`   | Actualizar un gasto                |
| `DELETE`| `/gastos/{id}`   | Eliminar un gasto                  |

### 💰 Presupuesto
| Método  | Endpoint             | Descripción                         |
|---------|----------------------|------------------------------------|
| `POST`  | `/presupuesto`       | Establecer un presupuesto mensual  |
| `GET`   | `/presupuesto/{mes}` | Obtener el presupuesto de un mes  |
| `PUT`   | `/presupuesto/{id}`  | Actualizar el presupuesto         |
| `DELETE`| `/presupuesto/{id}`  | Eliminar un presupuesto           |

---
## 📖 Manual de Uso

1️⃣ **Configurar la Base de Datos**  
- Asegúrate de tener PostgreSQL instalado.  
- Configura las credenciales en `application.properties`:
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/tu_basedatos
  spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña
  ```

2️⃣ **Ejecutar la Aplicación**  
```sh
mvn spring-boot:run
```

3️⃣ **Usar los Endpoints**  
- Puedes utilizar herramientas como **Postman** o **cURL** para hacer peticiones.

4️⃣ **Exportar a CSV**  
```sh
curl -X GET http://localhost:8080/gastos/exportar -o gastos.csv
```

---
## 📌 Contribución
1. Realiza un fork del repositorio.  
2. Crea una rama con tu funcionalidad: `git checkout -b nueva-funcionalidad`  
3. Sube los cambios: `git commit -m 'Agregada nueva funcionalidad'`  
4. Abre un Pull Request 🚀  

---
## 📜 Licencia
Proyecto de código abierto bajo licencia **MIT**.

🎯 **¡Espero que les ayude!**
