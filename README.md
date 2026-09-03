# Sistema de Gestión "Epicentro Gourmet"

Proyecto desarrollado para la asignatura [Orientación a Objetos 2] - [2026 - Segundo Cuatrimestre].
Este software permite gestionar los festivales temáticos de "Epicentro Gourmet", sus unidades de venta, el personal asignado, los platos ofrecidos, los pedidos y el rendimiento económico de cada jornada.

## 👥 Equipo de Trabajo
- **Leal, Arian Gabriel** (@ari2709) - Desarrollador
- **Ledesma Miño, Alejandro Javier** (@AJLM97) - Desarrollador
- **Boullon, Juan Bautista** (@JuanBa7) - Desarrollador
- **Vogt, Thomas Gebhard** (@Thomy98) - Desarrollador

## Requisitos Iniciales
1. Crear la base de datos en MySQL ejecutando la siguiente consulta:
	`sql create database bd_tp_grupal_oo2_grupo11;`
2. Ingresar el usuario y la contraseña de MySQL en `src/hibernate.cfg.xml`, en las propiedades `connection.username` y `connection.password`.
	(Actualmente, la configuración utiliza el usuario `root` y la contraseña `root`).
3. Ejecutar el archivo `src/test/TestHBM.java`.

## Orden de Ejecución para Cargar los Datos Iniciales
1. Ejecutar `src/test/TestAgregarFestival.java`.
2. Ejecutar `src/test/TestAgregarEmpleado.java`.
3. Ejecutar `src/test/TestAgregarUnidadVenta.java`.
4. Ejecutar `src/test/TestAgregarPlato.java`.
5. Ejecutar `src/test/TestAgregarPlatoAFoodTruck.java`.