<div align="center">

# 📚 Bookstore — Spring Boot + Angular

### A full-stack bookstore: Java REST API + Angular SPA + SQL

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=springboot&logoColor=white)](#)
[![Angular](https://img.shields.io/badge/Angular-DD0031?logo=angular&logoColor=white)](#)
[![Java](https://img.shields.io/badge/Java-007396?logo=openjdk&logoColor=white)](#)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=white)](#)

*An end-to-end example app: a Spring Boot REST backend backed by MySQL, consumed by an Angular single-page storefront.*

</div>

---

## ✨ Features

- 🛒 **Storefront SPA** — browse the catalog, filter by category, paginate, manage a cart.
- 🔌 **REST API** — Spring Data REST exposes the catalog over clean, HATEOAS-style endpoints.
- 🗄️ **Relational data** — JPA entities persisted to MySQL.
- 🧱 **Clean separation** — independent backend and frontend you can run and scale separately.

## 🛠️ Tech stack

| Layer | Technologies |
|-------|--------------|
| **Backend** | Java · Spring Boot · Spring Data JPA · Spring Data REST · Lombok · MySQL |
| **Frontend** | Angular · TypeScript |

## 🚀 Quick start

```bash
# Backend (REST API)
cd bookstore
./mvnw spring-boot:run          # configure MySQL in application.properties

# Frontend (Angular SPA)
cd ../angular-bookstore
npm install
ng serve                        # http://localhost:4200
```

## 📁 Project structure

```
Spring-Angular-SQL/
├── bookstore/           # Spring Boot REST API (JPA + MySQL)
└── angular-bookstore/   # Angular storefront
```

---

<div align="center">
<sub>Built by <a href="https://github.com/GuillermoPastoriniRivas">Guillermo Pastorini</a></sub>
</div>
