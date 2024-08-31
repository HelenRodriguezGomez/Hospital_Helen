# HOSPITAL
## Descripción

Aplicativo donde se realiza registro de pacientes, médicos y citas médicas. Permite listar médicos por especialidad y pacientes por médico.

---

## Contenidos

- **`Main.kt`**: Menú principal y lógica de registro y consulta.
- **`Medico.kt`**: Definición de la clase `Medico`.
- **`Paciente.kt`**: Definición de la clase `Paciente`.
- **`CitaMedica.kt`**: Definición de la clase `CitaMedica`.

---

## Funcionalidades

1. **Registro de Pacientes**
   - Registro de pacientes con DNI, nombre, apellido, fecha de nacimiento, dirección, número de historia clínica, sexo, grupo sanguíneo y alergias.

2. **Registro de Médicos**
   - Registro de médicos con DNI, nombre, especialidad, servicio, y datos laborales.

3. **Registro de Citas Médicas**
   - Registro de citas médicas asociadas a pacientes y médicos, con fecha y hora.

4. **Listar Médicos por Especialidad**
   - Listado de médicos según la especialidad solicitada.

5. **Listar Pacientes por Médico**
   - Listado de pacientes atendidos por un médico según su código.

---

## Instrucciones de Uso

1. **Ejecutar el Programa**
   - Asegúrate de tener Kotlin instalado y configurado.
   - Ejecuta el archivo `Main.kt` para iniciar la aplicación.

2. **Menú Principal**
   - Selecciona una opción del menú para realizar una acción.

---

## Validaciones

- **DNI**: Debe ser numérico.
- **Fecha**: Debe seguir el formato `dd-mm-yyyy`.

---

## Nota Importante

Asegúrate de ingresar datos sin espacios. Las entradas con espacios pueden causar errores y detener el programa.

---

## Ejemplos de Entrada

**Registrar Paciente**
- DNI: `1002936076`
- Nombre: `Helen`
- Apellido: `Rodriguez`
- Fecha de nacimiento: `01-01-1990`
- Dirección: `CalleFalsa123`
- Ciudad de procedencia: `Zipaquirá`
- Número de historia clínica: `123456`
- Sexo: `F`
- Grupo sanguíneo: `O+`
- Medicamentos a los que es alérgico: `Penicilina,Aspirina`

**Registrar Médico**
- DNI: `2003947582`
- Nombre: `Juan`
- Apellido: `Pérez`
- Fecha de nacimiento: `15-05-1980`
- Dirección: `Av.SiempreViva456`
- Ciudad de procedencia: `Bogotá`
- Código de empleado: `98765`
- Número de horas extras: `10`
- Fecha de ingreso: `01-06-2015`
- Área: `Cardiología`
- Cargo: `Especialista`
- Salario mensual: `5000.00`
- Porcentaje adicional por hora extra: `10`
- Especialidad: `Cardiología`
- Servicio: `Consulta`
- Número de consultorio: `202`

**Registrar Cita Médica**
- DNI del paciente: `1002936076`
- Especialidad del médico: `Cardiología`
- Fecha de la cita: `23-09-2024`
- Hora de la cita: `12:35`

---

## Notas

- **Formato de Fecha y DNI**: La fecha debe seguir el formato `dd-mm-yyyy` y el DNI debe ser numérico.
- **Restricción de Espacios**: Todas las entradas deben ingresarse sin espacios. Las entradas con espacios pueden causar errores y detener el programa.

---


